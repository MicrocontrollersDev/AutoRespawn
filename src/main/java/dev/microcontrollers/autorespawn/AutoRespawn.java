package dev.microcontrollers.autorespawn;

import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(name = "autorespawn", modid = "autorespawn", version = "1.0.0", acceptedMinecraftVersions = "1.8.9", clientSideOnly = true)
public class AutoRespawn {

    public static MyConfig config;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new Handler());

        config = new MyConfig();
    }
}
