package marcos.mysticcreations.totemfactory.init;

import com.simibubi.create.content.decoration.encasing.CasingBlock;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.tterrag.registrate.util.entry.BlockEntry;
import marcos.mysticcreations.totemfactory.TfSpriteShifts;
import marcos.mysticcreations.totemfactory.blocks.TumbagaBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import marcos.mysticcreations.totemfactory.TotemFactory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;

import static marcos.mysticcreations.totemfactory.TotemFactory.REGISTRATE;

public class TfBlocks {
    public static Block TUMBAGA_BLOCK = register("tumbaga_block", new TumbagaBlock());
    public static final BlockEntry<CasingBlock> TUMBAGA_CASING = REGISTRATE.block("tumbaga_casing", CasingBlock::new)
        .properties(p -> p.mapColor(MapColor.TERRACOTTA_BROWN))
        .transform(BuilderTransformers.casing(() -> TfSpriteShifts.TUMBAGA_CASING))
        .register();

    public static void load() {}
    public static void clientLoad() {}

    private static Block register(String registryName, Block item) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TotemFactory.MODID, registryName), item);
    }
}