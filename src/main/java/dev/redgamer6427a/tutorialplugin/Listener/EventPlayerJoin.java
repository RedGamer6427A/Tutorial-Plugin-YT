package dev.redgamer6427a.tutorialplugin.Listener;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.awt.*;

public class EventPlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        e.setJoinMessage(ChatColor.BLUE + "TutorialPlugin > " + ChatColor.GREEN + e.getPlayer().getName()+ " ist gejoint!");

    }

}
