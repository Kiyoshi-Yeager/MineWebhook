package me.pashaVoid;

import me.pashaVoid.commands.reloadCMD;
import me.pashaVoid.commands.webhookCMD;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public final class plugin extends JavaPlugin {

    private static plugin instance;
    public static plugin getInstance() {return instance;}

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        config.getWebHooks();
        config.getConfigMessages();

        webhookCMD webhookCMD = new webhookCMD();
        getCommand("webhook").setExecutor(webhookCMD);
        getCommand("webhook").setTabCompleter(webhookCMD);

        reloadCMD reloadCMD = new reloadCMD();
        getCommand("minewebhook").setExecutor(reloadCMD);
        getCommand("minewebhook").setTabCompleter(reloadCMD);

        int pluginId = 25373;
        Metrics metrics = new Metrics(this, pluginId);
    }
}
