package com.mcmiddleearth.mcmeadvancements.paper.trigger;

import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;

import java.util.UUID;

/**
 * Interface for MCME custom criteria that are not handled internally by the Minecraft server
 */
public class McmeTrigger {

    private final NamespacedKey advancement;
    private final String criterion;

    public McmeTrigger(NamespacedKey advancement, String criterion) {
        this.advancement = advancement;
        this.criterion = criterion;
    }

    public void grantCriterion(Player player) {
        //todo: grant criterion to player by Bukkit API
    }

    public NamespacedKey getAdvancement() {
        return advancement;
    }

    public String getCriterion() {
        return criterion;
    }

    public void loadPlayerData(UUID uuid) { /*intentionally empty*/  }

    public void unloadPlayerData(UUID uuid) { /*intentionally empty*/  }

    public void unregister() { /*intentionally empty*/ }
}
