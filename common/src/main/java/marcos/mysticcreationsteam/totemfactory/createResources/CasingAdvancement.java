package marcos.mysticcreationsteam.totemfactory.createResources;

import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.content.kinetics.deployer.ItemApplicationRecipe;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;
import com.simibubi.create.foundation.advancement.AllAdvancements;
import com.simibubi.create.foundation.advancement.CreateAdvancement;
import marcos.mysticcreationsteam.totemfactory.init.TfBlocks;

import java.util.function.UnaryOperator;

public class CasingAdvancement extends ItemApplicationRecipe {
    public CasingAdvancement(ProcessingRecipeBuilder.ProcessingRecipeParams params) {
        super(AllRecipeTypes.ITEM_APPLICATION, params);
    }

    private static CreateAdvancement create(String id, UnaryOperator<CreateAdvancement.Builder> b) {
        return new CreateAdvancement(id, b);
    }
    public static final CreateAdvancement START = null,
        TUMBAGA_CASING = create("tumbaga_casing", b -> b.icon(TfBlocks.TUMBAGA_CASING)
            .title("Ancient Age")
            .description("Apply Tumbaga Alloy to a bamboo block, taking a step into decorative side of immortality")
            .after(AllAdvancements.BLAZE_BURNER)
            .whenIconCollected()),
    END = null;
}
