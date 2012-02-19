package com.gentoomen.ancientrelics.enchantments;

import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

import com.gentoomen.ancientrelics.baseobjects.EnchantmentRelic;
import com.gentoomen.ancientrelics.baseobjects.ItemRelic;

public class EnchantmentCreeperArrow extends EnchantmentRelic implements Listener{
	
	public EnchantmentCreeperArrow(Integer type, int cooldown, ItemRelic parent) {
		super(type, cooldown, parent);
	}
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onProjectHit(ProjectileHitEvent e){
		if(canUse()){
			return;
		}
		World world = e.getEntity().getWorld();
		world.createExplosion(e.getEntity().getLocation(), 2.0f);
	}
}
