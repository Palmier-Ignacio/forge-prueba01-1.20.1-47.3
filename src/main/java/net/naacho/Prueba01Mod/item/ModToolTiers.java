package net.naacho.Prueba01Mod.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.naacho.Prueba01Mod.Prueba01Mod;
import net.naacho.Prueba01Mod.until.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier RUBY = TierSortingRegistry.registerTier(
            new ForgeTier(5,1500, 8.5f, 4f, 25,
                    ModTags.Blocks.NEEDS_RUBY_TOOL, () -> Ingredient.of(ModItems.RUBY.get())),
            new ResourceLocation(Prueba01Mod.MOD_ID, "ruby"), List.of(Tiers.NETHERITE), List.of()
    );


}
