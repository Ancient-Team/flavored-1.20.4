package team.ancient;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Flavored implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("flavored");
	public static final String MODID = "flavored";

	@Override
	public void onInitialize() {


		LOGGER.info(Flavored.MODID);
	}
}