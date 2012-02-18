package com.gentoomen.ancientrelics;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class AncientRelics extends JavaPlugin{
	public Logger log = Logger.getLogger("Minecraft");
	
	@Override
	public void onDisable() {
		super.onDisable();
		log.info("AncientRelics shutting down");
	}

	@Override
	public void onEnable() {
		super.onEnable();
		log.info("AncientRelics started up");
	}

}
