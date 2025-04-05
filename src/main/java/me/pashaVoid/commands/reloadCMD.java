package me.pashaVoid.commands;

import me.pashaVoid.config;
import me.pashaVoid.reload;
import me.pashaVoid.utils.chatUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.List;

public class reloadCMD implements TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!sender.hasPermission("minewebhook.reload")) {
            sender.sendMessage(chatUtils.getModifyChatString(config.missing_permissions));
            return true;
        }

        reload.reload();
        sender.sendMessage(chatUtils.getModifyChatString(config.reload_complete));
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return List.of("");
    }
}
