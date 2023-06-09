package club.sk1er.oldanimations.mixins;

import club.sk1er.oldanimations.config.OldAnimationsSettings;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(value = GuiPlayerTabOverlay.class, priority = 999)
public class MixinGuiPlayerTabOverlay {

    @ModifyVariable(method = "renderPlayerlist", at = @At("STORE"), index = 11)
    private boolean checkTabSetting(boolean original) {
        return !OldAnimationsSettings.oldTab && original;
    }
}
