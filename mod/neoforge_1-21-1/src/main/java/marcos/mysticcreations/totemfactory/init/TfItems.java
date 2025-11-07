package marcos.mysticcreations.totemfactory.init;

import marcos.mysticcreations.totemfactory.item.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import marcos.mysticcreations.totemfactory.TotemFactory;
import marcos.mysticcreations.totemfactory.item.*;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TfItems {
    // Register items using NeoForge's DeferredRegister for items
    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(Registries.ITEM, TotemFactory.MODID);

    // Register individual items with their corresponding class constructors
    public static final DeferredHolder<Item, TotemHead> TOTEM_HEAD = REGISTER.register("totem_head", TotemHead::new);
    public static final DeferredHolder<Item, IncompleteTotemHead> INCOMPLETE_TOTEM_HEAD = REGISTER.register("incomplete_totem_head", IncompleteTotemHead::new);
    public static final DeferredHolder<Item, TotemHeadCasing> TOTEM_HEAD_CASING = REGISTER.register("totem_head_casing", TotemHeadCasing::new);
    public static final DeferredHolder<Item, IncompleteTotemHeadCasing> INCOMPLETE_TOTEM_HEAD_CASING = REGISTER.register("incomplete_totem_head_casing", IncompleteTotemHeadCasing::new);
    public static final DeferredHolder<Item, TotemBody> TOTEM_BODY = REGISTER.register("totem_body", TotemBody::new);
    public static final DeferredHolder<Item, TotemBodyCasing> TOTEM_BODY_CASING = REGISTER.register("totem_body_casing", TotemBodyCasing::new);
    public static final DeferredHolder<Item, IncompleteTotemBody> INCOMPLETE_TOTEM_BODY = REGISTER.register("incomplete_totem_body", IncompleteTotemBody::new);
    public static final DeferredHolder<Item, IncompleteTotemBodyCasing> INCOMPLETE_TOTEM_BODY_CASING = REGISTER.register("incomplete_totem_body_casing", IncompleteTotemBodyCasing::new);
    public static final DeferredHolder<Item, InactiveTotem> INACTIVE_TOTEM = REGISTER.register("inactive_totem", InactiveTotem::new);
}