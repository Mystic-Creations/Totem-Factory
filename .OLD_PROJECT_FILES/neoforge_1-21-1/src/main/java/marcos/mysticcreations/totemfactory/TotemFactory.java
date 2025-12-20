package marcos.mysticcreations.totemfactory;

import marcos.mysticcreations.totemfactory.init.TfItems;
import marcos.mysticcreations.totemfactory.init.TfTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Mod("totemfactory")
public class TotemFactory {
	public static final Logger LOGGER = LogManager.getLogger(TotemFactory.class);
	public static final String MODID = "totemfactory";

	public TotemFactory(IEventBus modBus) {
		TfItems.REGISTER.register(modBus);
		TfTabs.REGISTER.register(modBus);
	}
}
