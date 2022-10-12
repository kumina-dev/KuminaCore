package ml.kumina.api;

import org.bukkit.plugin.java.JavaPlugin;

public class Core {
	private static JavaPlugin plugin;

	public static JavaPlugin getPlugin() {
		return plugin;
	}

	public static void setPlugin(JavaPlugin plugin) {
		Core.plugin = plugin;
	}

}