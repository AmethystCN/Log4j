package com.amethyst.kicklog4j;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class KickLog4j extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new log4j(),this);

            System.out.println(" ");
            System.out.println("Quick_information >  Plugin loaded!");
            System.out.println(" ");

    }

    @Override
    public void onDisable() {

        System.out.println(" ");
        System.out.println("Quick_information >  Plugin uninstalled!");
        System.out.println(" ");
    }
}