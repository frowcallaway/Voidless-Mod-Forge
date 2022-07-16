package net.mammalthebest2.voidless_mod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties VOID_STEAK = (new FoodProperties.Builder().nutrition(6).fast().effect(
            () -> new MobEffectInstance(MobEffects.BLINDNESS, 600, 0), 0.9f).meat().saturationMod(0.5f).build());

}
