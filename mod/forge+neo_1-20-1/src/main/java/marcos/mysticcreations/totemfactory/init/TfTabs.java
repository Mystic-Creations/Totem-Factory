package marcos.mysticcreations.totemfactory.init;

import net.minecraft.world.item.Items;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import marcos.mysticcreations.totemfactory.TotemFactory;

public class TfTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TotemFactory.MODID);
    public static final RegistryObject<CreativeModeTab> TAB_TOTEM_FACTORY = REGISTER.register("totem_factory",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("item_group." + TotemFactory.MODID + ".totem_factory"))
            .icon(() -> new ItemStack(Items.TOTEM_OF_UNDYING))
            .displayItems((parameters, tabData) -> {
                tabData.accept(TfItems.INACTIVE_TOTEM.get());
                tabData.accept(TfItems.TOTEM_HEAD.get());
                tabData.accept(TfItems.TOTEM_BODY.get());
                tabData.accept(TfItems.TOTEM_HEAD_CASING.get());
                tabData.accept(TfItems.TOTEM_BODY_CASING.get());
            })
            .build()
    );
}
