package com.gentoomen.ancientrelics.enchantments;

import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.event.Event;
import org.bukkit.event.entity.EntityShootBowEvent;

import com.gentoomen.ancientrelics.baseobjects.EnchantmentRelic;
import com.gentoomen.ancientrelics.baseobjects.ItemRelic;

public class EnchantmentCreeperArrow extends EnchantmentRelic{
	
	public EnchantmentCreeperArrow(Integer type, int cooldown, ItemRelic parent) {
		super(type, cooldown, parent);
	}
	
	@Override
	public void excute(Event event) {
		super.excute(event);
		EntityShootBowEvent entityEvent = (EntityShootBowEvent) event;
		Entity arrowbomb = entityEvent.getProjectile();
		World world = arrowbomb.getWorld();
		if(arrowbomb.getVelocity().getBlockZ() <= 1.0f){
			world.createExplosion(arrowbomb.getLocation(), 2.0f);
		}
	}
}
