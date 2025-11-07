package marcos.mysticcreations.totemfactory.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class IncompleteTotemBody extends Item {
	public IncompleteTotemBody() {
		super(new Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}
