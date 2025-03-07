package com.mcmiddleearth.mcmeadvancements.core.manager;

import com.mcmiddleearth.mcmeadvancements.core.TriggerType;
import com.mcmiddleearth.mcmeadvancements.core.data.ConditionData;
import com.mcmiddleearth.mcmeadvancements.paper.trigger.McmeTrigger;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class TriggerManager {

    private static final Set<McmeTrigger> triggers = new HashSet<>();

    public static void addTrigger(String advancement, String criterion, TriggerType type,
                                  Map<String, ConditionData> conditions) {
        //todo: create trigger and add to triggers set
    }

    public static void removeTrigger(String advancement, String criterion) {
        //todo: call trigger.unregister
        //todo: remove from triggers set
    }

    public static void loadPlayerData(UUID player) {
        triggers.forEach(trigger -> trigger.loadPlayerData(player));
    }

    public static void unloadPlayerData(UUID player) {
        triggers.forEach(trigger -> trigger.unloadPlayerData(player));
    }

}
