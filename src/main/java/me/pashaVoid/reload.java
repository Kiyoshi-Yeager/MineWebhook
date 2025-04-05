package me.pashaVoid;

public class reload {
    public static void reload() {
        plugin.getInstance().reloadConfig();
        config.getWebHooks();
        config.getConfigMessages();
    }
}
