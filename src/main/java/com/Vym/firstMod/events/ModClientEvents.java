package com.Vym.firstMod.events;


import com.Vym.firstMod.StartingMod;

import com.Vym.firstMod.init.ModBlocks;
import com.Vym.firstMod.init.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = StartingMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent //LivingEntity#func_233580_cy_() ---> LivingEntity#getPosition()
    public static void onJumpWithStick(LivingEvent.LivingJumpEvent event) {
        LivingEntity plr = event.getEntityLiving();
        if (plr.getHeldItemMainhand().getItem() == Items.STICK) {
            StartingMod.LOGGER.info("Player tried to jump with a stick!");
            World world = plr.getEntityWorld();
            world.setBlockState(plr.func_233580_cy_().add(0, -1, 0), ModBlocks.RUBY_BLOCK.get().getDefaultState());
        }
    }

    @SubscribeEvent
    public static void onDamageSheep (AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == ModItems.RUBY.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof SheepEntity) {

                    PlayerEntity plr = event.getPlayer();
                    target.setFire(7);

                    if(!event.getPlayer().getEntityWorld().isRemote) {
                        String msg = TextFormatting.RED + "Burn effect started...";
                        plr.sendMessage(new StringTextComponent(msg), plr.getUniqueID());
                    }
                }
            }
        }
    }


}
