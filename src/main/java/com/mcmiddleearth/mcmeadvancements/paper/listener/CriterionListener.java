package com.mcmiddleearth.mcmeadvancements.paper.listener;

import com.destroystokyo.paper.event.player.PlayerAdvancementCriterionGrantEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class CriterionListener implements Listener {

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onCriterionGranted(PlayerAdvancementCriterionGrantEvent event) {
        // store progress in storage

    }
}
