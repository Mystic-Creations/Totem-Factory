package marcos.mysticcreations.totemfactory.init;

import marcos.mysticcreations.totemfactory.item.*;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import marcos.mysticcreations.totemfactory.TotemFactory;

public class TfItems {
    public static Item TUMBAGA_ALLOY;
    public static Item TUMBAGA_NUGGET;
    public static Item TUMBAGA_SHEET;
	public static Item INACTIVE_TOTEM;
	public static Item TOTEM_HEAD;
	public static Item TOTEM_BODY;
	public static Item INCOMPLETE_TOTEM_BODY;
	public static Item INCOMPLETE_TOTEM_HEAD;
	public static Item TOTEM_HEAD_CASING;
	public static Item TOTEM_BODY_CASING;
	public static Item INCOMPLETE_TOTEM_HEAD_CASING;
	public static Item INCOMPLETE_TOTEM_BODY_CASING;
    public static Item INCOMPLETE_TOTEM_OF_UNDYING;

	public static void load() {
        TUMBAGA_ALLOY = register("tumbaga_alloy", new TumbagaAlloy());
        TUMBAGA_NUGGET = register("tumbaga_nugget", new TumbagaNugget());
        TUMBAGA_SHEET = register("tumbaga_sheet", new TumbagaSheet());
		TOTEM_HEAD = register("totem_head", new TotemHead());
		INCOMPLETE_TOTEM_HEAD = register("incomplete_totem_head", new IncompleteTotemHead());
		TOTEM_HEAD_CASING = register("totem_head_casing", new TotemHeadCasing());
		INCOMPLETE_TOTEM_HEAD_CASING = register("incomplete_totem_head_casing", new IncompleteTotemHeadCasing());
		TOTEM_BODY = register("totem_body", new TotemBody());
		TOTEM_BODY_CASING = register("totem_body_casing", new TotemBodyCasing());
		INCOMPLETE_TOTEM_BODY = register("incomplete_totem_body", new IncompleteTotemBody());
		INCOMPLETE_TOTEM_BODY_CASING = register("incomplete_totem_body_casing", new IncompleteTotemBodyCasing());
		INACTIVE_TOTEM = register("inactive_totem", new InactiveTotem());
        INCOMPLETE_TOTEM_OF_UNDYING = register("incomplete_totem_of_undying", new IncompleteTotemOfUndying());
	}

	public static void clientLoad() {}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.parse(TotemFactory.MODID+":"+registryName), item);
	}
}
