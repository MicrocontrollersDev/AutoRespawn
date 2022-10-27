package dev.microcontrollers.autorespawn;

import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.annotations.Info;
import cc.polyfrost.oneconfig.config.annotations.Switch;
import cc.polyfrost.oneconfig.config.data.InfoType;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;

public class ARConfig extends Config {
    @Switch(
            name = "Auto Respawn Toggle",
            category = "General", subcategory = "General"
    )
    public static boolean autoRespawn;

    @Switch(
            name = "Instant Respawn",
            category = "General", subcategory = "Extras"
    )
    public static boolean instantRespawn;

    @Info(
            text = "Insant Respawn may be bannable on most servers! Use at your own risk!",
            size = 2,
            type = InfoType.WARNING
    )
    private boolean instantRespawnWarning = false;

    public ARConfig() {
        super(new Mod("Auto Respawn", ModType.UTIL_QOL), "config.json");
        initialize();
    }
}
