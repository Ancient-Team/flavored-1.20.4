package ancient.flavored;

import ancient.flavored.api.FlavouredCompatApi;
import ancient.flavored.registries.ModBlocks;
import ancient.flavored.registries.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Flavored implements ModInitializer {
	public static final String MOD_ID = "flavored";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Flavored is initializing!");

        ModItems.registerAll();
        ModBlocks.registerAll();

        // Mod Compat
        FabricLoader.getInstance().getEntrypointContainers("flavoured", FlavouredCompatApi.class).forEach(entrypoint -> {
            String modId = entrypoint.getProvider().getMetadata().getId();
            try {
                FlavouredCompatApi api = entrypoint.getEntrypoint();
                api.onInitializeCompat();
            }catch (Throwable e) {
                LOGGER.error("Mod {} has a broken flavoured implementation", modId, e);
            }
        });

	}
}