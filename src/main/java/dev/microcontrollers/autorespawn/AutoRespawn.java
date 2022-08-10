package dev.microcontrollers.autorespawn;

import cc.polyfrost.oneconfig.utils.commands.CommandManager;
import net.minecraft.command.ICommand;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(name = AutoRespawn.MOD_NAME, modid = AutoRespawn.MOD_ID, version = AutoRespawn.VERSION, acceptedMinecraftVersions = "1.8.9", clientSideOnly = true)
public class AutoRespawn {
    public static final String MOD_NAME = "@NAME@";
    public static final String MOD_ID = "@ID@";
    public static final String VERSION = "@VER@";

    public static ARConfig config;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new Handler());
        CommandManager.INSTANCE.registerCommand(ARCommand.class);

        config = new ARConfig();
    }
}
