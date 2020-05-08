package com.nerokraft.nerodungeons;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerLoadouts implements Listener {
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {
		Player p = event.getPlayer();
		if(event.getAction() == Action.RIGHT_CLICK_BLOCK
				&& event.getClickedBlock().getType() == Material.ITEM_FRAME) {
			p.sendMessage("You pressed a button");
			Location l = event.getClickedBlock().getLocation();
			l.getWorld().spawnParticle(Particle.CAMPFIRE_COSY_SMOKE, l.getX(), l.getY(), l.getZ(), 100);
		}
	}
}
