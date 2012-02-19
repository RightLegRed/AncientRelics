package com.gentoomen.ancientrelics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

import org.bukkit.material.MaterialData;
import org.bukkit.plugin.java.JavaPlugin;

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
			getServer().getPlayer("RightLegRed").getItemInHand().setData(new MaterialData(50));
			Tag tag = Tag.readFrom(new FileInputStream(new File("world/players/RightLegRed.dat")));
			Tag inventory = tag.findTagByName("Inventory");
			inventory.print();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
