package marcos.mysticcreations.totemfactory.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.minecraft.world.item.Items;
import marcos.mysticcreations.totemfactory.TotemFactory;

public class TfTabs {
	public static final ResourceKey<CreativeModeTab> TAB_TOTEM_FACTORY =
		ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.parse(TotemFactory.MODID+":totem_factory"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_TOTEM_FACTORY,
			FabricItemGroup.builder()
				.title(Component.translatable("item_group." + TotemFactory.MODID + ".totem_factory"))
				.icon(() -> new ItemStack(Items.TOTEM_OF_UNDYING))
				.build()
		);
		ItemGroupEvents.modifyEntriesEvent(TAB_TOTEM_FACTORY).register(tabData -> {
            tabData.accept(TfItems.TUMBAGA_ALLOY);
            tabData.accept(TfItems.TUMBAGA_NUGGET);
            tabData.accept(TfItems.TUMBAGA_SHEET);
			tabData.accept(TfItems.INACTIVE_TOTEM);
			tabData.accept(TfItems.TOTEM_HEAD);
			tabData.accept(TfItems.TOTEM_BODY);
			tabData.accept(TfItems.TOTEM_HEAD_CASING);
			tabData.accept(TfItems.TOTEM_BODY_CASING);
		});
	}
}
