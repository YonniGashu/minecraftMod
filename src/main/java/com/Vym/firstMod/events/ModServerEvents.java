package com.Vym.firstMod.events;

import com.Vym.firstMod.StartingMod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = StartingMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.DEDICATED_SERVER)

public class ModServerEvents {

    @SubscribeEvent
    public static void onServerChat(ServerChatEvent event) { }
}
