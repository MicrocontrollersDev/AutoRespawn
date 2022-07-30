package dev.microcontrollers.autorespawn;

import cc.polyfrost.oneconfig.utils.Multithreading;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGameOver;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.concurrent.TimeUnit;

public class Handler {

    @SubscribeEvent
    public void GuiOpenEvent(GuiOpenEvent event) {
        if(event.gui instanceof GuiGameOver && MyConfig.autoRespawn) {
            Multithreading.schedule(() -> Minecraft.getMinecraft().thePlayer.respawnPlayer(), 1, TimeUnit.SECONDS);
        }

    }
}
