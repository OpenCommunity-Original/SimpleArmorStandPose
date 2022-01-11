package net.simple.armor.stand.pose;

import net.simple.armor.stand.pose.events.ArmorPose;
import net.simple.armor.stand.pose.events.ArmorSpawn;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new ArmorPose(), this); // ArmorStand Poses
        Bukkit.getPluginManager().registerEvents(new ArmorSpawn(), this); // ArmorStand Spawn change pose
    }

    @Override
    public void onDisable() {
    }
}