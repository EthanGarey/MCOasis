package com.mcoasis.events;

import com.mcoasis.MCOasis;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class playerEvents implements Listener {
    MCOasis plugin;
    public playerEvents(MCOasis plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void playerDeathEvent(PlayerDeathEvent event) {

    }

}
