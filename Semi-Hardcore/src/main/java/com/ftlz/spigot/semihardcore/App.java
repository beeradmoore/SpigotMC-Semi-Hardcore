package com.ftlz.spigot.semihardcore;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Hello world!
 *
 */
public class App extends JavaPlugin
{
    public void onEnable()
    {
        saveDefaultConfig();

        PluginManager pluginManager = getServer().getPluginManager();
        pluginManager.registerEvents(new PlayerMoveListener(this), this);
        this.getCommand("shc").setExecutor(new CommandShc());
    }
}
