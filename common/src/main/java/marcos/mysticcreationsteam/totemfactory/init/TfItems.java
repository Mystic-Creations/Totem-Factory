package marcos.mysticcreationsteam.totemfactory.init;

import dev.architectury.injectables.annotations.ExpectPlatform;
import marcos.mysticcreationsteam.totemfactory.TotemFactory;
import marcos.mysticcreationsteam.totemfactory.equipment.*;
import marcos.mysticcreationsteam.totemfactory.item.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import java.util.function.Supplier;

public class TfItems {
    //Tumbaga (Resource)
    public static Supplier<Item> TUMBAGA_BLOCK = register("tumbaga_block", () -> new BlockItem(TfBlocks.TUMBAGA_BLOCK.get(), new Item.Properties().stacksTo(64)));
    public static Supplier<Item> TUMBAGA_ALLOY = register("tumbaga_alloy", () -> new TumbagaAlloy());
    public static Supplier<Item> TUMBAGA_NUGGET = register("tumbaga_nugget",  () -> new TumbagaNugget());
    public static Supplier<Item> TUMBAGA_SHEET = register("tumbaga_sheet",  () -> new TumbagaSheet());
    //Tumbaga (Equipment)
    public static Supplier<Item> TUMBAGA_SWORD = register("tumbaga_sword",  () -> new TumbagaSword());
    public static Supplier<Item> TUMBAGA_AXE = register("tumbaga_axe",  () -> new TumbagaAxe());
    public static Supplier<Item> TUMBAGA_PICKAXE = register("tumbaga_pickaxe",  () -> new TumbagaPickaxe());
    public static Supplier<Item> TUMBAGA_SHOVEL = register("tumbaga_shovel",  () -> new TumbagaShovel());
    public static Supplier<Item> TUMBAGA_HOE = register("tumbaga_hoe",  () -> new TumbagaHoe());
    public static Supplier<Item> TUMBAGA_HELMET = register("tumbaga_helmet",  () -> new TumbagaHelmet());
    public static Supplier<Item> TUMBAGA_CHESTPLATE = register("tumbaga_chestplate",  () -> new TumbagaChestplate());
    public static Supplier<Item> TUMBAGA_LEGGINGS = register("tumbaga_leggings",  () -> new TumbagaLeggings());
    public static Supplier<Item> TUMBAGA_BOOTS = register("tumbaga_boots",  () -> new TumbagaBoots());
    //Totem
    public static Supplier<Item> TOTEM_HEAD = register("totem_head",  () -> new TotemHead());
    public static Supplier<Item> INCOMPLETE_TOTEM_HEAD = register("incomplete_totem_head",  () -> new IncompleteTotemHead());
    public static Supplier<Item> TOTEM_HEAD_CASING = register("totem_head_casing",  () -> new TotemHeadCasing());
    public static Supplier<Item> INCOMPLETE_TOTEM_HEAD_CASING = register("incomplete_totem_head_casing",  () -> new IncompleteTotemHeadCasing());
    public static Supplier<Item> TOTEM_BODY = register("totem_body",  () -> new TotemBody());
    public static Supplier<Item> TOTEM_BODY_CASING = register("totem_body_casing",  () -> new TotemBodyCasing());
    public static Supplier<Item> INCOMPLETE_TOTEM_BODY = register("incomplete_totem_body",  () -> new IncompleteTotemBody());
    public static Supplier<Item> INCOMPLETE_TOTEM_BODY_CASING = register("incomplete_totem_body_casing",  () -> new IncompleteTotemBodyCasing());
    public static Supplier<Item> INACTIVE_TOTEM = register("inactive_totem",  () -> new InactiveTotem());
    public static Supplier<Item> INCOMPLETE_TOTEM_OF_UNDYING = register("incomplete_totem_of_undying",  () -> new IncompleteTotemOfUndying());

    public static void load() {}
    public static void clientLoad() {}

    @ExpectPlatform
    public static Supplier<Item> register(String registryName, Supplier<Item> item) {
        throw new IllegalStateException();
    }
}
