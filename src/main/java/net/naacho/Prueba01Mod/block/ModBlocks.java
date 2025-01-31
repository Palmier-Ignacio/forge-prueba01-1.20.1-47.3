package net.naacho.Prueba01Mod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.naacho.Prueba01Mod.Prueba01Mod;
import net.naacho.Prueba01Mod.item.ModItems;
import net.naacho.Prueba01Mod.item.custom.StormBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Prueba01Mod.MOD_ID);

    //aca creamos los bloques
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> RUBY_ORE_BLOCK = registerBlock("ruby_ore_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).sound(SoundType.AMETHYST_CLUSTER)));

    public static final RegistryObject<Block> STORM_BLOCK = registerBlock("storm_block",
            () -> new StormBlock(
                    BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS) // Usa .of(Material) para crear una instancia.// Establece la dureza y resistencia.
                            .requiresCorrectToolForDrops() // Requiere la herramienta adecuada para romperlo
            )
    );

    // 2 metodos para crear bloques
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
