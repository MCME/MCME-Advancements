package com.mcmiddleearth.mcmeadvancements.paper.trigger;

import com.mcmiddleearth.mcmeadvancements.paper.McmeAdvancements;
import org.bukkit.Bukkit;
import org.bukkit.advancement.Advancement;
import org.bukkit.event.Listener;

public class EventTrigger extends McmeTrigger implements Listener {

    public EventTrigger(Advancement advancement, String criterion) {
        super(advancement, criterion);
        Bukkit.getPluginManager().registerEvents(this, McmeAdvancements.getInstance());
    }

    public void unregister() {
        //todo: needs to be called when an advancement is removed from the server
    }
}
