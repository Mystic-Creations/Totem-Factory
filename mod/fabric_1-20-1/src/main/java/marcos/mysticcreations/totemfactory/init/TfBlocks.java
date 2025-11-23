package marcos.mysticcreations.totemfactory.init;

import marcos.mysticcreations.totemfactory.blocks.TumbagaBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import marcos.mysticcreations.totemfactory.TotemFactory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

public class TfBlocks {
    public static Block TUMBAGA_BLOCK;

    public static void load() {
        TUMBAGA_BLOCK = register("tumbaga_block", new TumbagaBlock());
    }

    public static void clientLoad() {}

    private static Block register(String registryName, Block item) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TotemFactory.MODID, registryName), item);
    }
}