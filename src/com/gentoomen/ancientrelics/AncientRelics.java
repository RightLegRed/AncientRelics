package com.gentoomen.ancientrelics;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import com.gentoomen.ancientrelics.enchantments.EnchantmentCreeperArrow;
import com.gentoomen.ancientrelics.enchantments.EnchantmentRideArrow;
import com.gentoomen.ancientrelics.util.NBTGrabber;

public class AncientRelics extends JavaPlugin{
	public Logger log = Logger.getLogger("Minecraft");
	public NBTGrabber nbtGrabber = new NBTGrabber();
	
	private EnchantmentCreeperArrow creeperEnch = new EnchantmentCreeperArrow(0, null);
	private EnchantmentRideArrow rideEnch = new EnchantmentRideArrow(0, null);

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
		getServer().getPlayer("RightLegRed").getItemInHand().addUnsafeEnchantment(rideEnch, 1);

	}

}
