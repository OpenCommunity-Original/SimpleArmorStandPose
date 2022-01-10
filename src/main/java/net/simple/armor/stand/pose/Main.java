package net.simple.armor.stand.pose;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new ArmorStand(this), this);
    }

    @Override
    public void onDisable() {

    }
}
