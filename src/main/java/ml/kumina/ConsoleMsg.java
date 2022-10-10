package ml.kumina;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class ConsoleMsg {
	public static void tell(CommandSender sender, String message) {
		sender.sendMessage(colorize(message));
	}

	public static void log(String message) {
		tell(Bukkit.getConsoleSender(), "[" + Core.getPlugin().getName() + "] " + message);
	}

	public static String colorize(String message) {
		return ChatColor.translateAlternateColorCodes('&', message);
	}

}
