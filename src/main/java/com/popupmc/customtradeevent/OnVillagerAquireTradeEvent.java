package com.popupmc.customtradeevent;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.VillagerAcquireTradeEvent;

import java.util.Random;

public class OnVillagerAquireTradeEvent implements Listener {
    @EventHandler
    public void OnEvent(VillagerAcquireTradeEvent event) {
        if(random.nextInt(100 + 1) > 10)
            return;

        if(event.getEntity().getWorld().getName().equalsIgnoreCase("imperial_city"))
            return;

        CustomTradeEventPlugin.plugin.getLogger().info("Custom Trade Event");

        CustomTradeEvent customTradeEvent = new CustomTradeEvent(event);
        Bukkit.getPluginManager().callEvent(customTradeEvent);
    }

    public static final Random random = new Random();
}
