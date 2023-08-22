package com.mcoasis;

import com.mcoasis.events.playerEvents;
import org.bukkit.plugin.java.JavaPlugin;

public final class MCOasis extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        new playerEvents(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
