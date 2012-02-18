package com.gentoomen.ancientrelics;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

import com.gentoomen.ancientrelics.baseobjects.*;

public class RelicManager {

	private List<ItemRelic> itemRelics = new ArrayList<ItemRelic>();
	
	/**
	 * Add a new relic to the list, meaning more than one can be in existence if needed.
	 * @param item
	 * @return
	 */
	public boolean addRelic(ItemRelic item){
		return itemRelics.add(item);
	}
	
	/**
	 * Remove item from the relic list, i.e. existence
	 * @param item
	 * @return
	 */
	public boolean removeRelic(ItemRelic item){
		return itemRelics.remove(item);
	}
	
	/**
	 * Checks if a relic exists
	 * @param item
	 * @return
	 */
	public boolean relicExists(ItemRelic item){
		return itemRelics.contains(item);
	}
	
	/**
	 * Clears the relic list
	 */
	public void clearRelics(){
		itemRelics.clear();
	}
	
	public ItemRelic getRelic(Player owner){
		for(ItemRelic i : itemRelics){
			if(i.getOwner() == owner){
				return i;
			}
		}
		return null;
	}
}
