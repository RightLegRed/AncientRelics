package com.gentoomen.ancientrelics;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.OfflinePlayer;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.gentoomen.ancientrelics.enchantments.EnchantmentCreeperArrow;
import com.gentoomen.ancientrelics.enchantments.EnchantmentRideArrow;

public class AncientRelics extends JavaPlugin{
	public Logger log = Logger.getLogger("Minecraft");
	
	private EnchantmentCreeperArrow creeperEnch = new EnchantmentCreeperArrow(0);
	private EnchantmentRideArrow rideEnch = new EnchantmentRideArrow(0);

	@Override
	public void onDisable() {
		super.onDisable();
		log.info("AncientRelics shutting down");
	}

	@Override
	public void onEnable() {
		super.onEnable();
		log.info("AncientRelics started up");
		getServer().getPluginManager().registerEvents(creeperEnch, this);
		//getServer().getPlayer("RightLegRed").getItemInHand().addUnsafeEnchantment(rideEnch, 1);
		doesEnchantmentExist(null);
	}
	
	public boolean doesEnchantmentExist(Enchantment enchantment){
		for(OfflinePlayer op : getServer().getOfflinePlayers()){
			// FUCK YOU I'M NOT DONE HERE
		}
		return false;
	}

}
