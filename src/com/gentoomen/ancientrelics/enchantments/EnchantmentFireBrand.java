package com.gentoomen.ancientrelics.enchantments;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.Event;
import org.bukkit.event.player.PlayerInteractEvent;

import com.gentoomen.ancientrelics.baseobjects.EnchantmentRelic;

public class EnchantmentFireBrand extends EnchantmentRelic{
	
	
	
	
	@Override
	public void excute(Event event) {
		super.excute(event);
		PlayerInteractEvent playerEvent = (PlayerInteractEvent) event;
		if(playerEvent.getClickedBlock() != null){
			World world = playerEvent.getPlayer().getWorld();
			Block aboveBlock = playerEvent.getPlayer().getWorld().getBlockAt(playerEvent.getClickedBlock().getLocation().add(new Location(world, 0, 1, 0)));
			if(!(aboveBlock.getType() == Material.AIR)){
				return;
			}
			aboveBlock.setType(Material.FIRE);
		}
	}
	
	
}
