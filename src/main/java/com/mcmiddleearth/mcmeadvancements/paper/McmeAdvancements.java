package com.mcmiddleearth.mcmeadvancements.paper;

import com.mcmiddleearth.mcmeadvancements.paper.listener.AdvancementListener;
import com.mcmiddleearth.mcmeadvancements.paper.listener.CriterionListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class McmeAdvancements extends JavaPlugin {

    private static McmeAdvancements instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new AdvancementListener(),this);
        Bukkit.getPluginManager().registerEvents(new CriterionListener(),this);

        /*tests:
        advancement grant event without announcement -> set message to null
        loading advancements from file
        external trigger
         */


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static McmeAdvancements getInstance() {
        return instance;
    }
}
