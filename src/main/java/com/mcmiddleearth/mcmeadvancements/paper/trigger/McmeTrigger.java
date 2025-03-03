package com.mcmiddleearth.mcmeadvancements.paper.trigger;

import org.bukkit.advancement.Advancement;
import org.bukkit.entity.Player;

/**
 * Interface for MCME custom criteria that are not handled internally by the Minecraft server
 */
public class McmeTrigger {

    private final Advancement advancement;
    private final String criterion;

    public McmeTrigger(Advancement advancement, String criterion) {
        this.advancement = advancement;
        this.criterion = criterion;
    }

    public void grantCriterion(Player player) {
        //todo: grant criterion to player by Bukkit API

    }


}
