package net.ronan.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties MEDS = new FoodProperties.Builder().alwaysEat().effect(()->new MobEffectInstance(MobEffects.WITHER, 200)).build();
}
