package club.sk1er.oldanimations.mixins;

import club.sk1er.oldanimations.config.OldAnimationsSettings;
import net.minecraft.client.renderer.entity.layers.LayerArmorBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LayerArmorBase.class)
public class LayerArmorBaseMixin {
    @Inject(method = "shouldCombineTextures", at = @At("HEAD"), cancellable = true)
    private void applyRedArmor(CallbackInfoReturnable<Boolean> cir) {
        if (OldAnimationsSettings.redArmor) cir.setReturnValue(true);
    }
}
