package me.pashaVoid.utils;

import org.bukkit.ChatColor;

public class chatUtils {
    public static String getModifyChatString(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
