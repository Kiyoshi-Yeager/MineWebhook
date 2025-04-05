package me.pashaVoid.commands;

import me.pashaVoid.config;
import me.pashaVoid.sendMessage;
import me.pashaVoid.utils.chatUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.Arrays;
import java.util.List;

public class webhookCMD implements TabExecutor { // /webhook <list_of_webhooks> <text> <text> ...
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!sender.hasPermission("minewebhook.send")) {
            sender.sendMessage(chatUtils.getModifyChatString(config.missing_permissions));
            return true;
        }

        if (args.length < 2) {
            sender.sendMessage(chatUtils.getModifyChatString(config.missing_args));
            return true;
        }

        String webhook = args[0];

        if (!config.webHooks.contains(args[0])) {
            sender.sendMessage(chatUtils.getModifyChatString(config.webhook_invalid_name));
            return true;
        }

        String text = String.join(" ", Arrays.copyOfRange(args, 1, args.length));

        boolean complete = sendMessage.sendWebhook(text, config.config.get(webhook));
        if (complete) {
            sender.sendMessage(chatUtils.getModifyChatString(config.send_complete));
        } else {
            sender.sendMessage(chatUtils.getModifyChatString(config.webhook_send_failed));
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String s, String[] args) {
        if (args.length == 1) {
            if (!config.webHooks.isEmpty()) {
                return config.webHooks;
            } else {
                return List.of("none webhooks in config");
            }
        }
        return List.of("message content...");
    }
}
