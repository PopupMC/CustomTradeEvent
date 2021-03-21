package com.popupmc.customtradeevent;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class CustomTradeEventPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        plugin = this;

        Bukkit.getPluginManager().registerEvents(new OnVillagerAquireTradeEvent(), this);
        getLogger().info("CustomTradeEventPlugin is enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("CustomTradeEventPlugin is disabled");
    }

    public static CustomTradeEventPlugin plugin;
}
