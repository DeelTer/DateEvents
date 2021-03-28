package ru.deelter.dateevents.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import ru.deelter.dateevents.Config;
import ru.deelter.dateevents.utils.Colors;

public class DateEventsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command,String label, String[] args) {
        if (args.length < 1)
            return true;

        /* reload command */
        if (args[0].equalsIgnoreCase("RELOAD")) {
            Config.reload();
            sender.sendMessage(Colors.set("&aКонфиг&f перезагружен"));
        }

        return true;
    }
}
