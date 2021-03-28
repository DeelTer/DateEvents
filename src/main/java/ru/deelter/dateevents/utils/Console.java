package ru.deelter.dateevents.utils;

import org.bukkit.Bukkit;
import ru.deelter.dateevents.Config;

public class Console {

    /** Send message to console with prefix */
    public static void info(String s) {
        Bukkit.getLogger().info(Colors.set(s));
    }

    public static void debug(String s) {
        if (Config.DEBUG)
            info("&o&a" + s);
    }
}
