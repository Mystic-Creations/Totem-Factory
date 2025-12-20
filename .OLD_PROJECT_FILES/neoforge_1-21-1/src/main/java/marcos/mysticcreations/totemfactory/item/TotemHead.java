package marcos.mysticcreations.totemfactory.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class TotemHead extends Item {
	public TotemHead() {
		super(new Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
