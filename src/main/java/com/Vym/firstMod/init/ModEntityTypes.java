package com.Vym.firstMod.init;

import com.Vym.firstMod.StartingMod;
import com.Vym.firstMod.entities.FireBoarEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, StartingMod.MOD_ID);


    //Entity Types
    public static final RegistryObject<EntityType<FireBoarEntity>> BOAR = ENTITY_TYPES.register("fire_boar",
            () -> EntityType.Builder.create(FireBoarEntity::new, EntityClassification.CREATURE)
                    .size(1.0f, 1.0f)
                    .build(new ResourceLocation(StartingMod.MOD_ID, "fire_boar").toString()));

}
