package net.naacho.Prueba01Mod.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.naacho.Prueba01Mod.Prueba01Mod;
import net.naacho.Prueba01Mod.item.custom.RubyDetectorItem;

public class ModItems {
    //esto es para crear un registro diferido con los ITEMS
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Prueba01Mod.MOD_ID);

    // MATERIALS
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties()));

    // FOODS
    public static final RegistryObject<Item> RUBY_APPLE = ITEMS.register("ruby_apple",
            () -> new Item(new Item.Properties().food(ModFoods.RUBY_APPLE)));
    public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce",
            () -> new Item(new Item.Properties().food(ModFoods.LETTUCE)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoods.TOMATO)));
    public static final RegistryObject<Item> HAMB = ITEMS.register("hamb",
            () -> new Item(new Item.Properties().food(ModFoods.HAMB)));

    // TOOLS
    public static final RegistryObject<Item> RUBY_DETECTOR = ITEMS.register("ruby_detector",
            () -> new RubyDetectorItem(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModToolTiers.RUBY, 4, -2.6f,  new Item.Properties()));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUBY, 1, 1,  new Item.Properties()));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModToolTiers.RUBY, 7, 1,  new Item.Properties()));
    public static final RegistryObject<Item> RUBY_SHOVEL= ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModToolTiers.RUBY, 0, 0,  new Item.Properties()));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModToolTiers.RUBY, 0, 0,  new Item.Properties()));

    // ARMOR
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Properties()));

    // metodo register para registrar esos items
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
