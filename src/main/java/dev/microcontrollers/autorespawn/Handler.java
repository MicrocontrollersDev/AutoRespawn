package dev.microcontrollers.autorespawn;

import cc.polyfrost.oneconfig.utils.Multithreading;
import cc.polyfrost.oneconfig.utils.hypixel.HypixelUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGameOver;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.concurrent.TimeUnit;

public class Handler {
    @SubscribeEvent
    public void GuiOpenEvent(GuiOpenEvent event) {
        if (event.gui instanceof GuiGameOver && ARConfig.autoRespawn) {
            Multithreading.schedule(() -> Minecraft.getMinecraft().addScheduledTask(() -> Minecraft.getMinecraft().thePlayer.respawnPlayer()), ARConfig.instantRespawn && !HypixelUtils.INSTANCE.isHypixel() ? 0 : 1, TimeUnit.SECONDS);
        }
    }
}
