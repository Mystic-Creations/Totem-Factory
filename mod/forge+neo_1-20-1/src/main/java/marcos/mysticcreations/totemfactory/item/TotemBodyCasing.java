package marcos.mysticcreations.totemfactory.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class TotemBodyCasing extends Item {
	public TotemBodyCasing() {
		super(new Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
