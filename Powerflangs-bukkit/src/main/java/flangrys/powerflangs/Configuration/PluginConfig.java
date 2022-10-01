package flangrys.powerflangs.Configuration;

import flangrys.powerflangs.PowerflangsBukkit;

import java.io.File;

public class PluginConfig {

    private final PowerflangsBukkit plugin;

    public PluginConfig(PowerflangsBukkit plugin) { this.plugin = plugin; }

    public void registerConfig() {
        File configFile = new File(this.plugin.getDataFolder(), "config.yml");
        String pluginConfigRoute = configFile.getPath();

        if (!configFile.exists()) {
            this.plugin.getConfig().options().copyDefaults(true);
            this.plugin.saveConfig();
        }
    }
}
