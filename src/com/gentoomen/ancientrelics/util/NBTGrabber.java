package com.gentoomen.ancientrelics.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.bukkit.entity.Player;

public class NBTGrabber {

	
	public InputStream grabPlayerFile(Player player){		
		try {
			return new FileInputStream(new File(player.getWorld().getWorldFolder() + "/players/" + player.getName() + ".dat"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
