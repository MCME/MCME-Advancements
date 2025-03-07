package com.mcmiddleearth.mcmeadvancements.core.manager;

import com.mcmiddleearth.mcmeadvancements.core.data.AdvancementData;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AdvancementManager {

    private static Map<String, AdvancementData> advancementDataMap = new HashMap<>();

    public static void loadAdvancements() {
        //at server startup
        //todo: read advancements from json files
        //todo: update (add or remove) advancements from server via Bukkit API
        //todo: load custom triggers
    }

    public static void loadAdvancementProgress(UUID player) {
        //todo: load Advancement progress from storage and update server data via Bukkit API

        //done: load custom criterion player data:
        TriggerManager.loadPlayerData(player);
    }

    public static void addAdvancement(String key, String advancementJson) {
        //todo: load Advancement via Bukkit API
        //todo: load custom triggers via TriggerManager
    }

    public static void removeAdvancement(String key) {
        //todo: remove Advancement via Bukkit API (don't forget to reload server!)
        //todo: remove custom triggers via TriggerManager
    }

}
