package marcos.mysticcreations.totemfactory;

import com.simibubi.create.foundation.data.CreateRegistrate;
import marcos.mysticcreations.totemfactory.init.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class TotemFactory implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "totemfactory";
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MODID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Create: Totem Factory...");
        REGISTRATE.register();
        TfBlocks.load();
        TfItems.load();
		TfTabs.load();
        //HAS TO BE THIS LOADING ORDER!!
	}

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MODID, path);
    }
}
