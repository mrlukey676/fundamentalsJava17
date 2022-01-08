package me.mrlukey676.fundamentalsjava17.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;

public class ping implements CommandExecutor {
    @Override
    public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.hasPermission("fundamentals.ping")) {
                if (args.length == 0) {
                    player.sendMessage("§aYour ping is §e" + player.getPing() + "§a.");
                } else {
                    Player target = Bukkit.getPlayerExact(args[0]);
                    if (target == null) {
                        player.sendMessage("§cPlayer not found.");
                    } else {
                        player.sendMessage("§a" + target.getName() + "'s ping is §e" + target.getPing() + "§a.");
                    }
                }
            }else{
                player.sendMessage("§cYou do not have permission to use this command.");
            }
        }
        return false;
    }
}
