package me.mrlukey676.fundamentalsjava17;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import me.mrlukey676.fundamentalsjava17.commands.*;

public final class FundamentalsJava17 extends JavaPlugin {


    @Override
    public void onEnable() {
        // Plugin startup logic
        FundamentalsJava17 plugin = this;
        Bukkit.getLogger().info("Fundamentals for Java 17 has been enabled!");
        plugin.getCommand("fly").setExecutor(new fly());
        plugin.getCommand("vanish").setExecutor(new vanish());
        plugin.getCommand("invincible").setExecutor(new invincible());
        plugin.getCommand("kill").setExecutor(new kill());
        plugin.getCommand("heal").setExecutor(new heal());
        plugin.getCommand("feed").setExecutor(new feed());
        plugin.getCommand("nick").setExecutor(new nick());
        plugin.getCommand("gmode").setExecutor(new gmode());
        plugin.getCommand("compasstarget").setExecutor(new compasstarget());
        plugin.getCommand("setspawn").setExecutor(new setspawn());
        plugin.getCommand("day").setExecutor(new day());
        plugin.getCommand("night").setExecutor(new night());
        plugin.getCommand("spawn").setExecutor(new spawn());
        plugin.getCommand("world").setExecutor(new world());
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Fundamentals for Java 17 has been disabled!");
    }
}
