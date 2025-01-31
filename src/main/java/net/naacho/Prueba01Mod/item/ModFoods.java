package net.naacho.Prueba01Mod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RUBY_APPLE = new FoodProperties.Builder().alwaysEat().nutrition(6).saturationMod(1.0F).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 4),1.0f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 2),1.0f).build();
    public static final FoodProperties LETTUCE = new FoodProperties.Builder().fast().nutrition(4).saturationMod(0.6f).build();
    public static final FoodProperties HAMB = new FoodProperties.Builder().fast().nutrition(10).saturationMod(0.8f).build();
    public static final FoodProperties TOMATO = new FoodProperties.Builder().fast().nutrition(4).saturationMod(0.4f).build();
}
