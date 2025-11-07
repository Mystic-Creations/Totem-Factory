package marcos.mysticcreations.totemfactory.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import marcos.mysticcreations.totemfactory.TotemFactory;
import marcos.mysticcreations.totemfactory.item.TotemHead;
import marcos.mysticcreations.totemfactory.item.TotemHeadCasing;
import marcos.mysticcreations.totemfactory.item.TotemBody;
import marcos.mysticcreations.totemfactory.item.TotemBodyCasing;
import marcos.mysticcreations.totemfactory.item.IncompleteTotemHead;
import marcos.mysticcreations.totemfactory.item.IncompleteTotemHeadCasing;
import marcos.mysticcreations.totemfactory.item.IncompleteTotemBody;
import marcos.mysticcreations.totemfactory.item.IncompleteTotemBodyCasing;
import marcos.mysticcreations.totemfactory.item.InactiveTotem;

public class TfItems {
    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, TotemFactory.MODID);

    public static final RegistryObject<Item> TOTEM_HEAD = REGISTER.register("totem_head", TotemHead::new);
    public static final RegistryObject<Item> INCOMPLETE_TOTEM_HEAD = REGISTER.register("incomplete_totem_head", IncompleteTotemHead::new);
    public static final RegistryObject<Item> TOTEM_HEAD_CASING = REGISTER.register("totem_head_casing", TotemHeadCasing::new);
    public static final RegistryObject<Item> INCOMPLETE_TOTEM_HEAD_CASING = REGISTER.register("incomplete_totem_head_casing", IncompleteTotemHeadCasing::new);
    public static final RegistryObject<Item> TOTEM_BODY = REGISTER.register("totem_body", TotemBody::new);
    public static final RegistryObject<Item> TOTEM_BODY_CASING = REGISTER.register("totem_body_casing", TotemBodyCasing::new);
    public static final RegistryObject<Item> INCOMPLETE_TOTEM_BODY = REGISTER.register("incomplete_totem_body", IncompleteTotemBody::new);
    public static final RegistryObject<Item> INCOMPLETE_TOTEM_BODY_CASING = REGISTER.register("incomplete_totem_body_casing", IncompleteTotemBodyCasing::new);
    public static final RegistryObject<Item> INACTIVE_TOTEM = REGISTER.register("inactive_totem", InactiveTotem::new);
}
