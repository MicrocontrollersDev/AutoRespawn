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

    @Info(
            text = "Insant Respawn may be bannable on most servers! Use at your own risk! This feature is disabled when on Hypixel.",
            size = 2,
            type = InfoType.WARNING,
            category = "General", subcategory = "Extras"
    )
    private boolean instantRespawnWarning = false;

    @Switch(
            name = "Instant Respawn",
            category = "General", subcategory = "Extras"
    )
    public static boolean instantRespawn;

    public ARConfig() {
        super(new Mod("Auto Respawn", ModType.UTIL_QOL), "config.json");
        initialize();
    }
}
