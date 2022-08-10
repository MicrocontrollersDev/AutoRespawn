package dev.microcontrollers.autorespawn;

import cc.polyfrost.oneconfig.utils.commands.annotations.Command;
import cc.polyfrost.oneconfig.utils.commands.annotations.Main;

@Command(value = "autorespawn", aliases = {"ar"}) // OneConfig aliases don't work yet?
public class ARCommand {
    @Main
    private static void main() {
        AutoRespawn.config.openGui();
    }
}
