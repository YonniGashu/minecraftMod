package com.Vym.firstMod.init;

import com.Vym.firstMod.StartingMod;
import com.Vym.firstMod.items.ItemBase;
import com.Vym.firstMod.items.MeltingCheese;
import com.Vym.firstMod.util.enums.ModArmorMaterial;
import com.Vym.firstMod.util.enums.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StartingMod.MOD_ID);

    //ITEMS


    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);

    public static final RegistryObject<MeltingCheese> MELTING_CHEESE = ITEMS.register("melting_cheese", MeltingCheese::new);

    //TOOLS
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModItemTier.RUBY, 2, -2.4F, new Item.Properties().group(StartingMod.TAB)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModItemTier.RUBY, 0, -2.8F, new Item.Properties().group(StartingMod.TAB)));

    //ARMOR
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(StartingMod.TAB)));

    //Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block",
            () -> new BlockItem(ModBlocks.RUBY_BLOCK.get(), new Item.Properties().group(StartingMod.TAB)));

    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore",
            () -> new BlockItem(ModBlocks.RUBY_ORE.get(), new Item.Properties().group(StartingMod.TAB)));

    public static final RegistryObject<Item> OVEN_ITEM = ITEMS.register("oven",
            () -> new BlockItem(ModBlocks.OVEN.get(), new Item.Properties().group(StartingMod.TAB)));
}
