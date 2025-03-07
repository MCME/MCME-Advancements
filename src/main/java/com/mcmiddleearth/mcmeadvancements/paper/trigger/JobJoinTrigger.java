package com.mcmiddleearth.mcmeadvancements.paper.trigger;

import com.mcmiddleearth.thegaffer.events.JobJoinEvent;
import org.bukkit.NamespacedKey;
import org.bukkit.event.EventHandler;

public class JobJoinTrigger extends EventQuantityTrigger {

    public JobJoinTrigger(NamespacedKey advancement, String criterion, int requiredQuantity) {
        super(advancement, criterion, requiredQuantity);
    }

    @EventHandler
    public void onJobJoin(JobJoinEvent event) {
        checkGrantCriterion(event.getPlayer());
    }
}
