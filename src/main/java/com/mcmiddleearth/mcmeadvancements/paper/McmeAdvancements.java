package com.mcmiddleearth.mcmeadvancements.paper;

import com.mcmiddleearth.mcmeadvancements.paper.listener.AdvancementListener;
import com.mcmiddleearth.mcmeadvancements.paper.listener.CriterionListener;
import com.mcmiddleearth.mcmeadvancements.paper.listener.PlayerListener;
import com.mcmiddleearth.mcmeadvancements.core.manager.AdvancementManager;
import com.mcmiddleearth.mcmeadvancements.core.storage.FileStorage;
import com.mcmiddleearth.mcmeadvancements.core.storage.StorageConnector;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class McmeAdvancements extends JavaPlugin {

    private static McmeAdvancements instance;

    private static StorageConnector storage;

    @Override
    public void onEnable() {
        // Plugin startup logic
        storage = new FileStorage(new File(this.getDataFolder(), "storage.yml"));

        AdvancementManager.loadAdvancements();

        Bukkit.getPluginManager().registerEvents(new AdvancementListener(),this);
        Bukkit.getPluginManager().registerEvents(new CriterionListener(),this);
        Bukkit.getPluginManager().registerEvents(new PlayerListener(),this);


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

    public static StorageConnector getStorage() {
        return storage;
    }

    public static McmeAdvancements getInstance() {
        return instance;
    }

}
