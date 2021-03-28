package ru.deelter.dateevents.managers;

import org.bukkit.Bukkit;
import ru.deelter.dateevents.Config;
import ru.deelter.dateevents.DateEvents;
import ru.deelter.dateevents.utils.date.MyEvent;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimerManager {

    public static void run() {
        Bukkit.getScheduler().runTaskTimerAsynchronously(DateEvents.getInstance(), () -> MyEvent.getEvents().forEach(event -> {
            /* work with event */
            if (!event.isNow())
                return;

            event.completeCommands();

            /* Cooldown */
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");
            String time = formatter.format(new Date());
            event.setCooldown(time);
        }), 0, Config.CHECK_TIME * 20L);
    }
}
