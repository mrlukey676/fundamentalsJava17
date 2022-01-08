package me.mrlukey676.fundamentalsjava17;

import org.bukkit.plugin.java.JavaPlugin;
import me.mrlukey676.fundamentalsjava17.commands.*;

public final class FundamentalsJava17 extends JavaPlugin {


    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        System.out.println("Loaded Fundamentals for Java 17");
        getCommand("fly").setExecutor(new fly());
        getCommand("vanish").setExecutor(new vanish());
        getCommand("invincible").setExecutor(new invincible());
        getCommand("die").setExecutor(new die());
        getCommand("heal").setExecutor(new heal());
        getCommand("feed").setExecutor(new feed());
        getCommand("nick").setExecutor(new nick());
        getCommand("gmode").setExecutor(new gmode());
        getCommand("compasstarget").setExecutor(new compasstarget());
        getCommand("setspawn").setExecutor(new setspawn());
        getCommand("day").setExecutor(new day());
        getCommand("night").setExecutor(new night());
        getCommand("spawn").setExecutor(new spawn());
        getCommand("world").setExecutor(new world());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Thanks for using Fundamentals for Java 17!");
    }
}
