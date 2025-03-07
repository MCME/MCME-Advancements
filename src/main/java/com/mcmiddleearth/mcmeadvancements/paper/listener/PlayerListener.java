package com.mcmiddleearth.mcmeadvancements.paper.listener;

import com.mcmiddleearth.mcmeadvancements.core.manager.AdvancementManager;
import com.mcmiddleearth.mcmeadvancements.core.manager.TriggerManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        AdvancementManager.loadAdvancementProgress(event.getPlayer().getUniqueId());
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        TriggerManager.unloadPlayerData(event.getPlayer().getUniqueId());
    }
}
