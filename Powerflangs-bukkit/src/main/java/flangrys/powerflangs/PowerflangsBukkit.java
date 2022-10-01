package flangrys.powerflangs;

import flangrys.powerflangs.Configuration.PluginConfig;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public final class PowerflangsBukkit extends JavaPlugin {

    public final PluginDescriptionFile pdf = getDescription();

    public String pluginVersion = pdf.getVersion();
    public String pluginName = ChatColor.RED +
            "$$$$$$$\\                                               $$$$$$\\  $$\\                                         \n" +
            "$$  __$$\\                                             $$  __$$\\ $$ |                                        \n" +
            "$$ |  $$ | $$$$$$\\  $$\\  $$\\  $$\\  $$$$$$\\   $$$$$$\\  $$ /  \\__|$$ | $$$$$$\\  $$$$$$$\\   $$$$$$\\   $$$$$$$\\ \n" +
            "$$$$$$$  |$$  __$$\\ $$ | $$ | $$ |$$  __$$\\ $$  __$$\\ $$$$\\     $$ | \\____$$\\ $$  __$$\\ $$  __$$\\ $$  _____|\n" +
            "$$  ____/ $$ /  $$ |$$ | $$ | $$ |$$$$$$$$ |$$ |  \\__|$$  _|    $$ | $$$$$$$ |$$ |  $$ |$$ /  $$ |\\$$$$$$\\  \n" +
            "$$ |      $$ |  $$ |$$ | $$ | $$ |$$   ____|$$ |      $$ |      $$ |$$  __$$ |$$ |  $$ |$$ |  $$ | \\____$$\\ \n" +
            "$$ |      \\$$$$$$  |\\$$$$$\\$$$$  |\\$$$$$$$\\ $$ |      $$ |      $$ |\\$$$$$$$ |$$ |  $$ |\\$$$$$$$ |$$$$$$$  |\n" +
            "\\__|       \\______/  \\_____\\____/  \\_______|\\__|      \\__|      \\__| \\_______|\\__|  \\__| \\____$$ |\\_______/ \n" +
            "                                                                                        $$\\   $$ |          \n" +
            "                                                                                        \\$$$$$$  |          \n" +
            "                                                                                         \\______/";

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(
                "[+] Starting ..." + pluginName + "\n[*] Dev Version: " + pluginVersion
        );

        PluginConfig _pluginConfig = new PluginConfig(this);
        _pluginConfig.registerConfig();

        //getCommand(commandName).setExecutor(new Command());

        //this.getServer().getPluginManager().registerEvents(new Listener, this);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("[+] Good Bye :)");
    }

}
