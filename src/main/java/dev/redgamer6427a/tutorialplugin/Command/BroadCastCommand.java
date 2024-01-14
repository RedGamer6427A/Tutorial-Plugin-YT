package dev.redgamer6427a.tutorialplugin.Command;

import dev.redgamer6427a.tutorialplugin.Tool.Text;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class BroadCastCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {

        if(commandSender instanceof Player player && !player.isOp()){
            player.sendMessage( ChatColor.BLUE +"Tutorialplugin > "+ChatColor.RED +"Du hast nicht die nötigen Rechte!");
            return true;
        }
        if(commandSender instanceof Player player && args.length == 0){
            player.sendMessage( ChatColor.BLUE +"Tutorialplugin > "+ChatColor.GRAY +"Nutzung: /broadcast [message]");
            return true;
        }
        if(!(commandSender instanceof Player player )&& args.length == 0){
            System.out.println( "Tutorialplugin > "+"Nutzung: /broadcast [message]");
            return true;
        }
        String message = "";
        for(String string : args){
            message = message +" "+ string;
        }
        message = Text.convertedColor(message);

        for(Player player2 : Bukkit.getOnlinePlayers()){
            player2.sendMessage(ChatColor.BLUE +"BroadCast > " +ChatColor.GREEN+message);
        }
        if(commandSender instanceof Player player){
            player.sendMessage(ChatColor.BLUE +"Tutorialplugin > "+ChatColor.GREEN+"Deine Ankündigung wurde gesendet!");
        }
        return true;
    }
}

