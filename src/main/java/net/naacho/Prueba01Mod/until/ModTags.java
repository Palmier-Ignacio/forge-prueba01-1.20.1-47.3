package net.naacho.Prueba01Mod.until;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.naacho.Prueba01Mod.Prueba01Mod;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> RUBY_DETECTOR_VALUABLES = tag("ruby_detector_valuables");
        public static final TagKey<Block> NEEDS_RUBY_TOOL = tag("needs_ruby_tool");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(Prueba01Mod.MOD_ID, name));
        }
    }

    public static class Items{
        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(Prueba01Mod.MOD_ID, name));
        }
    }
}
