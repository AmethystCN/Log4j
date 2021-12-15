package com.amethyst.kicklog4j;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class log4j implements Listener {
    @EventHandler
    public void log4(AsyncPlayerChatEvent event) {
        if (event.getMessage().contains("${")) {

            event.setCancelled(true);
            Player player = event.getPlayer();
            String playerName = event.getPlayer().getName();
            String Message = event.getMessage();
            System.out.println(playerName + "Try to send " + "// " + Message);
            String commandLine;
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "kick" + playerName + "Log4j has been banned this server!");
        }
    }
}