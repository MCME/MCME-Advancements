package com.mcmiddleearth.mcmeadvancements.paper.trigger;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class EventQuantityTrigger extends EventTrigger {

    private final Map<UUID, Integer> quantities = new HashMap<>();
    private final int requiredQuantity;

    public EventQuantityTrigger(NamespacedKey advancement, String criterion, int requiredQuantity) {
        super(advancement, criterion);
        this.requiredQuantity = requiredQuantity;
    }

    protected void checkGrantCriterion(Player player) {
        if(player.getAdvancementProgress(Objects.requireNonNull(Bukkit.getAdvancement(getAdvancement())))
                .getDateAwarded(getCriterion()) == null) {
            int quantity = quantities.get(player.getUniqueId());
            if (quantity == requiredQuantity) {
                grantCriterion(player);
            }
            quantities.put(player.getUniqueId(), quantity + 1);
            //todo: save quantity to storage
        }
    }

    @Override
    public void loadPlayerData(UUID uuid) {
        int quantity = 0; //todo: load from storage
        quantities.put(uuid, quantity);
    }

    @Override
    public void unloadPlayerData(UUID uuid) {
        quantities.put(uuid, null);
    }
}
