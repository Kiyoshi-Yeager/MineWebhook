package me.pashaVoid;

import org.bukkit.configuration.ConfigurationSection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class config {

    public static String send_complete;
    public static String reload_complete;
    public static String missing_args;
    public static String webhook_invalid_name;
    public static String webhook_send_failed;
    public static String missing_permissions;

    public static List<String> webHooks = new ArrayList<>();
    public static Map<String, String> config = new HashMap<>();

    public static void getWebHooks() {
        ConfigurationSection webhooksSection = plugin.getInstance().getConfig().getConfigurationSection("webhooks");

        if (webhooksSection != null) {
            for (String key : webhooksSection.getKeys(false)) {
                String url = webhooksSection.getString(key);
                webHooks.add(key);
                config.put(key, url);
            }
        }
    }

    public static void getConfigMessages() {
        ConfigurationSection configSection = plugin.getInstance().getConfig().getConfigurationSection("messages");

        send_complete = configSection.getString("send_complete");
        reload_complete = configSection.getString("reload_complete");
        missing_args = configSection.getString("missing_args");
        webhook_invalid_name = configSection.getString("webhook_invalid_name");
        webhook_send_failed = configSection.getString("webhook_send_failed");
        missing_permissions = configSection.getString("missing_permissions");
    }
}
