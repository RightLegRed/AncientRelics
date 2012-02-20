package com.gentoomen.ancientrelics.enchantments;

import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

import com.gentoomen.ancientrelics.baseobjects.EnchantmentRelic;

public class EnchantmentCreeperArrow extends EnchantmentRelic implements Listener{
	private static Integer id = 0;
	
	public EnchantmentCreeperArrow(int cooldown) {
		super(id, cooldown, cooldown);
	}
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onProjectHit(ProjectileHitEvent e){
		World world = e.getEntity().getWorld();
		world.createExplosion(e.getEntity().getLocation(), 25.0f);
	}
}
