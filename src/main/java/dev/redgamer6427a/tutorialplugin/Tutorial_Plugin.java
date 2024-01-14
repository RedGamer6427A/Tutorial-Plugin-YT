package dev.redgamer6427a.tutorialplugin;

import dev.redgamer6427a.tutorialplugin.Command.BroadCastCommand;
import dev.redgamer6427a.tutorialplugin.Listener.EventPlayerJoin;
import dev.redgamer6427a.tutorialplugin.Listener.EventPlayerQuit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Tutorial_Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Mein Plugin wurde geladen!");
//      Event Listener Definierung
        getServer().getPluginManager().registerEvents(new EventPlayerJoin(),this);
        getServer().getPluginManager().registerEvents(new EventPlayerQuit(),this);
//      Command Definierung
        getCommand("broadcast").setExecutor(new BroadCastCommand());


    }

    @Override
    public void onDisable() {
        System.out.println("Mein Plugin wurde entladen!");
    }
}
