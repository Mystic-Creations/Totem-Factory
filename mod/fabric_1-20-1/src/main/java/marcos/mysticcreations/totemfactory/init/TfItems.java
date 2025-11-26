package marcos.mysticcreations.totemfactory.init;

import marcos.mysticcreations.totemfactory.equipment.*;
import marcos.mysticcreations.totemfactory.item.*;
import marcos.mysticcreations.totemfactory.item.TumbagaAlloy;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import marcos.mysticcreations.totemfactory.TotemFactory;

public class TfItems {
    //Tumbaga (Resource)
    public static Item TUMBAGA_CASING = register("tumbaga_casing", new BlockItem(TfBlocks.TUMBAGA_CASING.get(), new Item.Properties().stacksTo(64)));
    public static Item TUMBAGA_BLOCK = register("tumbaga_block", new BlockItem(TfBlocks.TUMBAGA_BLOCK, new Item.Properties().stacksTo(64)));
    public static Item TUMBAGA_ALLOY = register("tumbaga_alloy", new TumbagaAlloy());
    public static Item TUMBAGA_NUGGET = register("tumbaga_nugget", new TumbagaNugget());
    public static Item TUMBAGA_SHEET = register("tumbaga_sheet", new TumbagaSheet());
    //Tumbaga (Equipment)
    public static Item TUMBAGA_SWORD = register("tumbaga_sword", new TumbagaSword());
    public static Item TUMBAGA_AXE = register("tumbaga_axe", new TumbagaAxe());
    public static Item TUMBAGA_PICKAXE = register("tumbaga_pickaxe", new TumbagaPickaxe());
    public static Item TUMBAGA_SHOVEL = register("tumbaga_shovel", new TumbagaShovel());
    public static Item TUMBAGA_HOE = register("tumbaga_hoe", new TumbagaHoe());
    //Totem
    public static Item TOTEM_HEAD = register("totem_head", new TotemHead());
    public static Item INCOMPLETE_TOTEM_HEAD = register("incomplete_totem_head", new IncompleteTotemHead());
    public static Item TOTEM_HEAD_CASING = register("totem_head_casing", new TotemHeadCasing());
    public static Item INCOMPLETE_TOTEM_HEAD_CASING = register("incomplete_totem_head_casing", new IncompleteTotemHeadCasing());
    public static Item TOTEM_BODY = register("totem_body", new TotemBody());
    public static Item TOTEM_BODY_CASING = register("totem_body_casing", new TotemBodyCasing());
    public static Item INCOMPLETE_TOTEM_BODY = register("incomplete_totem_body", new IncompleteTotemBody());
    public static Item INCOMPLETE_TOTEM_BODY_CASING = register("incomplete_totem_body_casing", new IncompleteTotemBodyCasing());
    public static Item INACTIVE_TOTEM = register("inactive_totem", new InactiveTotem());
    public static Item INCOMPLETE_TOTEM_OF_UNDYING = register("incomplete_totem_of_undying", new IncompleteTotemOfUndying());

	public static void load() {}
	public static void clientLoad() {}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TotemFactory.MODID, registryName), item);
	}
}
