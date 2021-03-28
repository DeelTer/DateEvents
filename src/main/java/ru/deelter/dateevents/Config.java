package ru.deelter.dateevents;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import ru.deelter.dateevents.utils.Console;
import ru.deelter.dateevents.utils.date.MyEvent;

import java.util.List;

public class Config {

    public static int CHECK_TIME = 25;
    public static boolean DEBUG;

    public static void reload() {
        DateEvents.getInstance().reloadConfig();
        MyEvent.getEvents().clear();
        load();
    }

    public static void load() {
        JavaPlugin plugin = DateEvents.getInstance();

        FileConfiguration config = plugin.getConfig();
        CHECK_TIME = config.getInt("check-time");
        DEBUG = config.getBoolean("debug");

        ConfigurationSection events = config.getConfigurationSection("events");
        for (String id : events.getKeys(false)) {
            ConfigurationSection event = events.getConfigurationSection(id);

            List<String> time = event.getStringList("time"), day = event.getStringList("day"), commands = event.getStringList("commands");
            String zone = event.getString("zone");

            new MyEvent(id, commands).day(day).time(time).zone(zone).register();
        }
        Console.debug("Конфиг загружен");
    }
}
