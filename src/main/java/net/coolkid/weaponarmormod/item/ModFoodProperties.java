package net.coolkid.weaponarmormod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties WARDEN_TENDRIL = new FoodProperties.Builder().nutrition(0).saturationModifier(0f)
            .effect(() -> new MobEffectInstance(MobEffects.DARKNESS, 8000), 1f).build();

}
