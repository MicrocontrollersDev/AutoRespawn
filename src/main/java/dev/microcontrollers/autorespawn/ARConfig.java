package dev.microcontrollers.autorespawn;

import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.annotations.Switch;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;

public class ARConfig extends Config {
    @Switch(
            name = "Auto Respawn Toggle",
            category = "General", subcategory = "General"
    )
    public static boolean autoRespawn;

    @Switch(
            name = "Instant Respawn (most likely bannable)",
            category = "General", subcategory = "General"
    )
    public static boolean instantRespawn;

    public ARConfig() {
        super(new Mod("Auto Respawn", ModType.UTIL_QOL), "config.json");
        initialize();
    }
}
