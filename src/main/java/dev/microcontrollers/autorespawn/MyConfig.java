package dev.microcontrollers.autorespawn;

import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.annotations.Switch;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;

public class MyConfig extends Config {

    @Switch(
            name = "AutoRespawn Toggle",
            category = "General", subcategory = "General"
    )
    public static boolean autoRespawn;

    public MyConfig() {
        super(new Mod("Auto Respawn", ModType.UTIL_QOL), "config.json");
        initialize();
    }
}
