package com.mcmiddleearth.mcmeadvancements.paper.listener;

import com.mcmiddleearth.mcmeadvancements.paper.message.Messager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;

import java.util.Collections;

public class AdvancementListener implements Listener {

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onAdvancementGranted(PlayerAdvancementDoneEvent event) {
        Messager.sendMessage("Advancement done!", Collections.emptySet());

    }
}
