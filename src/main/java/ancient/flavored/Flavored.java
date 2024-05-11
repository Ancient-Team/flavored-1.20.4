package ancient.flavored;

import ancient.flavored.api.FlavoredCompatApi;
import ancient.flavored.block.ModBlocks;
import ancient.flavored.item.ModItemGroup;
import ancient.flavored.item.ModItems;
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
        ModItemGroup.registerAll();


        // Mod Compat
        FabricLoader.getInstance().getEntrypointContainers("flavored", FlavoredCompatApi.class).forEach(entrypoint -> {
            String modId = entrypoint.getProvider().getMetadata().getId();
            try {
                FlavoredCompatApi api = entrypoint.getEntrypoint();
                api.onInitializeCompat();
            }catch (Throwable e) {
                LOGGER.error("Mod {} has a broken flavored implementation", modId, e);
            }
        });

	}
}