package ru.deelter.dateevents;

import org.bukkit.plugin.java.JavaPlugin;
import ru.deelter.dateevents.commands.DateEventsCommand;
import ru.deelter.dateevents.managers.TimerManager;
import ru.deelter.dateevents.utils.Console;

import java.io.File;

public final class DateEvents extends JavaPlugin {

    private static JavaPlugin instance;

    public static JavaPlugin getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        /* Config loader */
        File config = new File(instance.getDataFolder().getPath() + "/config.yml");
        if (!config.exists()) {
            Console.info("&aКонфиг&f успешно загружен");
            saveDefaultConfig();
        }
        Config.load();
        TimerManager.run();

        /* Register commands */
        getCommand("dateevents").setExecutor(new DateEventsCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
