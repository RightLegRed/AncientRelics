package com.gentoomen.ancientrelics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

import org.bukkit.EntityEffect;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.java.JavaPlugin;

import com.gentoomen.ancientrelics.baseobjects.TestEnch;
import com.gentoomen.ancientrelics.util.NBTGrabber;
import com.gentoomen.ancientrelics.util.Tag;

public class AncientRelics extends JavaPlugin{
	public Logger log = Logger.getLogger("Minecraft");
	public NBTGrabber nbtGrabber = new NBTGrabber();
	
	@Override
	public void onDisable() {
		super.onDisable();
		log.info("AncientRelics shutting down");
	}

	@Override
	public void onEnable() {
		super.onEnable();
		log.info("AncientRelics started up");
		try {
			TestEnch tEnch = new TestEnch(100);
			getServer().getPlayer("RightLegRed").getItemInHand().addUnsafeEnchantment(tEnch, 1);
			if(getServer().getPlayer("RightLegRed").getItemInHand().containsEnchantment(tEnch)){
				System.out.println("true");
			}

			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
