
package com.sniperzciinema.infoboard;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.DisplaySlot;


public class PlayerListener implements Listener {
	
	public InfoBoard	plugin;
	
	public PlayerListener(InfoBoard instance)
	{
		this.plugin = instance;
	}
	
	@EventHandler
	public void onPlayerChangeWorld(PlayerChangedWorldEvent event) {
		event.getPlayer().getScoreboard().clearSlot(DisplaySlot.SIDEBAR);
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		if (event.getPlayer().isOp() && this.plugin.update)
			event.getPlayer().sendMessage(ChatColor.DARK_AQUA + "Theres a new update for InfoBoard(" + ChatColor.YELLOW + this.plugin.name + ChatColor.DARK_AQUA + ").");
	}
}
