package net.naacho.Prueba01Mod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.naacho.Prueba01Mod.Prueba01Mod;
import net.naacho.Prueba01Mod.block.ModBlocks;
import net.naacho.Prueba01Mod.item.custom.RubyDetectorItem;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Prueba01Mod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PRUEBA_TAB = CREATIVE_MODE_TABS.register("prueba_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creatibetab.prueba_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModItems.RAW_RUBY.get());
                        pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                        pOutput.accept(ModBlocks.STORM_BLOCK.get());
                        pOutput.accept(ModItems.RUBY_DETECTOR.get());
                        pOutput.accept(ModBlocks.RUBY_ORE_BLOCK.get());

                        pOutput.accept(ModItems.RUBY_APPLE.get());
                        pOutput.accept(ModItems.HAMB.get());
                        pOutput.accept(ModItems.LETTUCE.get());
                        pOutput.accept(ModItems.TOMATO.get());

                        pOutput.accept(ModItems.RUBY_HELMET.get());
                        pOutput.accept(ModItems.RUBY_CHESTPLATE.get());
                        pOutput.accept(ModItems.RUBY_LEGGINGS.get());
                        pOutput.accept(ModItems.RUBY_BOOTS.get());

                        pOutput.accept(ModItems.RUBY_SWORD.get());
                        pOutput.accept(ModItems.RUBY_PICKAXE.get());
                        pOutput.accept(ModItems.RUBY_AXE.get());
                        pOutput.accept(ModItems.RUBY_SHOVEL.get());
                        pOutput.accept(ModItems.RUBY_HOE.get());


                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
