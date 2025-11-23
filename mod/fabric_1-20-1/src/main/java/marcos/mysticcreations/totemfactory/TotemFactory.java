package marcos.mysticcreations.totemfactory;

import marcos.mysticcreations.totemfactory.init.TfBlocks;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import marcos.mysticcreations.totemfactory.init.TfTabs;
import marcos.mysticcreations.totemfactory.init.TfItems;

public class TotemFactory implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "totemfactory";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Create: Totem Factory...");
        TfBlocks.load();
        TfItems.load();
		TfTabs.load();
        //HAS TO BE THIS LOADING ORDER!!
	}
}
