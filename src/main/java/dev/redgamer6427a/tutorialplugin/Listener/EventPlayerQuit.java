package dev.redgamer6427a.tutorialplugin.Listener;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class EventPlayerQuit implements Listener {

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e){
        e.setQuitMessage(ChatColor.BLUE + "TutorialPlugin > " + ChatColor.GREEN + e.getPlayer().getName()+ " ist geleavt!");
    }
}
