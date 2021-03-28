package ru.deelter.dateevents.utils.date;

import org.bukkit.Bukkit;
import ru.deelter.dateevents.DateEvents;

import java.text.SimpleDateFormat;
import java.util.*;

public class MyEvent {

    /** all events */
    private static final Map<String, MyEvent> events = new HashMap<>();

    private List<String> times = new ArrayList<>(), days = new ArrayList<>();
    private final List<String> commands;

    private final String id;
    private TimeZone zone;

    private String lastTime = "";

    public MyEvent(String id, List<String> commands) {
        this.id = id;
        this.commands = commands;
    }

    public void setCooldown(String lastTime) {
        this.lastTime = lastTime;
    }

    public MyEvent day(List<String> day) {
        this.days = day;
        return this;
    }

    public MyEvent time(List<String> time) {
        this.times = time;
        return this;
    }

    public MyEvent zone(String id) {
        this.zone = TimeZone.getTimeZone(id);
        return this;
    }

    public void register() {
        events.put(id, this);
    }

    public static Collection<MyEvent> getEvents() {
        return events.values();
    }

    public void completeCommands() {
        commands.forEach(command -> Bukkit.getScheduler().runTask(DateEvents.getInstance(), () -> Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command)));
    }

    public boolean isNow() {
        Calendar calendar = new GregorianCalendar();
        calendar.setTimeZone(zone);

        /* If days list is empty -> auto true */
        if (!days.isEmpty()) {
            SimpleDateFormat formatter = new SimpleDateFormat("EEEE", Locale.ENGLISH);
            String day = formatter.format(calendar.getTime()).toUpperCase();
            if (!days.contains(day))
                return false;
        }

        /* If time list is empty -> auto true */
        if (!times.isEmpty()) {
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");
            String time = formatter.format(calendar.getTime());
            if (!times.contains(time))
                return false;

            return !lastTime.equals(time);
        }

        return true;
    }
}
