package com.gentoomen.ancientrelics.enchantments;

import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import com.gentoomen.ancientrelics.baseobjects.EnchantmentRelic;

public class EnchantmentCreeperArrow extends EnchantmentRelic implements Listener{
	private static Integer id = 0;
	
	public EnchantmentCreeperArrow(int cooldown) {
		super(id, cooldown);
	}
	
	@EventHandler
	public void onEntityExplosion(EntityExplodeEvent e){
		e.setYield(0);
	}
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e){
		if(e.getAction() == Action.RIGHT_CLICK_AIR){
			e.getPlayer().shootArrow();
		}
	}
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onProjectHit(ProjectileHitEvent e){
		World world = e.getEntity().getWorld();
		world.createExplosion(e.getEntity().getLocation(), 5.0f);
	}
}
