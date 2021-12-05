package com.Vym.firstMod.world.gen;

import com.Vym.firstMod.StartingMod;
import com.Vym.firstMod.init.ModEntityTypes;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = StartingMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntitySpawns {

    @SubscribeEvent
    public static void spawnEntities(FMLLoadCompleteEvent event){
        for(Biome biome : ForgeRegistries.BIOMES) {
            if(biome.getCategory() != Biome.Category.OCEAN) {
                biome.getSpawns(EntityClassification.CREATURE)
                        .add(new Biome.SpawnListEntry(ModEntityTypes.IRON_HOG.get(), 10, 3, 5));
            }
        }

    }
}
