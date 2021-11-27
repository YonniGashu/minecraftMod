package com.Vym.firstMod.init;

import com.Vym.firstMod.StartingMod;
import com.Vym.firstMod.blocks.Oven;
import com.Vym.firstMod.blocks.RubyBlock;
import com.Vym.firstMod.blocks.RubyOre;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, StartingMod.MOD_ID);


    //Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);

    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);

    public static final RegistryObject<Block> OVEN = BLOCKS.register("oven", Oven::new);
}
