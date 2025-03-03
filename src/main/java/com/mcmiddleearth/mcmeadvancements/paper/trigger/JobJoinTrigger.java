package com.mcmiddleearth.mcmeadvancements.paper.trigger;

import com.mcmiddleearth.thegaffer.events.JobJoinEvent;
import org.bukkit.advancement.Advancement;
import org.bukkit.event.EventHandler;

public class JobJoinTrigger extends EventTrigger {

    public JobJoinTrigger(Advancement advancement, String criterion) {
        super(advancement, criterion);
    }

    @EventHandler
    public void onJobJoin(JobJoinEvent event) {
        grantCriterion(event.getPlayer());
    }
}
