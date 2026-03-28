package com.example.mod;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(targets = "io.github.some_example_name.lwjgl3.Lwjgl3Launcher")
public class TestMixin {
    @ModifyConstant(method = "getDefaultConfiguration", constant = @Constant(stringValue = "Genomeia"))
    private static String onStart(String original){
        return "Fabric Genomeia";
    }
}