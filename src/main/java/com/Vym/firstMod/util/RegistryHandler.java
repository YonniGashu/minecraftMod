package com.Vym.firstMod.util;

import com.Vym.firstMod.StartingMod;
import com.Vym.firstMod.armor.ModArmorMaterial;
import com.Vym.firstMod.blocks.BlockItemBase;
import com.Vym.firstMod.blocks.RubyBlock;
import com.Vym.firstMod.items.ItemBase;
import com.Vym.firstMod.items.MeltingCheese;
import com.Vym.firstMod.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, StartingMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, StartingMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

     //Items
     public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
     public static final RegistryObject<Item> TANNED_LEATHER = ITEMS.register("tanned_leather", ItemBase::new);
     public static final RegistryObject<MeltingCheese> MELTING_CHEESE = ITEMS.register("melting_cheese", MeltingCheese::new);

     //Blocks
     public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
     //Tools
     public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
             new SwordItem(ModItemTier.RUBY, 2, -2.4F, new Item.Properties().group(StartingMod.TAB)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(ModItemTier.RUBY, 0, -2.8F, new Item.Properties().group(StartingMod.TAB)));

    //ARMOR
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(StartingMod.TAB)));

     //Block Items
     public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
}
