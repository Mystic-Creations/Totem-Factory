package marcos.mysticcreationsteam.totemfactory.mixin;

import com.simibubi.create.content.kinetics.deployer.ManualApplicationRecipe;
import com.simibubi.create.foundation.advancement.CreateAdvancement;
import marcos.mysticcreationsteam.totemfactory.createResources.CasingAdvancement;
import marcos.mysticcreationsteam.totemfactory.init.TfBlocks;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ManualApplicationRecipe.class)
public class TumbagaCasing {
    @Inject(method = "awardAdvancements", at = @At("HEAD"), cancellable = true)
    private static void awardTumbagaAdvancement(Player player, BlockState placed, CallbackInfo ci) {
        CreateAdvancement advancement;

        if (TfBlocks.TUMBAGA_CASING.has(placed)) {
            advancement = CasingAdvancement.TUMBAGA_CASING;
        } else return;

        advancement.awardTo(player);
        ci.cancel();
    }
}
