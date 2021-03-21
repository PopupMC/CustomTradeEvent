package com.popupmc.customtradeevent;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.VillagerAcquireTradeEvent;
import org.jetbrains.annotations.NotNull;

public class CustomTradeEvent extends Event implements Cancellable {

    public CustomTradeEvent(VillagerAcquireTradeEvent event) {
        this.relayEvent = event;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    public VillagerAcquireTradeEvent getRelayEvent() {
        return relayEvent;
    }

    private static final HandlerList handlerList = new HandlerList();
    private boolean cancelled = false;
    private final VillagerAcquireTradeEvent relayEvent;
}
