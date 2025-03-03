package com.mcmiddleearth.mcmeadvancements.core.storage;

import org.bukkit.advancement.Advancement;
import org.bukkit.entity.Player;

public interface StorageConnector {

    void grantCriterion(Player player, Advancement advancement, String criterion);

    void advancementDone(Player player, Advancement advancement);

}
