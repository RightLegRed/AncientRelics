package com.gentoomen.ancientrelics.enchantments;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.util.Vector;

import com.gentoomen.ancientrelics.baseobjects.EnchantmentRelic;

public class EnchantmentRideArrow extends EnchantmentRelic implements Listener{
	private static Integer id = 100;
	
	public EnchantmentRideArrow(int cooldown) {
		super(id, cooldown);
	}
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onEntityDamageByEntity(EntityDamageByEntityEvent e){
		if(e.getCause() == DamageCause.PROJECTILE && e.getEntity() != e.getDamager()){
			e.getEntity().setVelocity(new Vector(0, 100000, 0));
		}
	}
}
