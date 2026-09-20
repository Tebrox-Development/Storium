package de.tebrox.storium.bootstrap;

import org.bukkit.plugin.java.JavaPlugin;

public final class StoriumPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Storium enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("Storium disabled.");
    }
}
