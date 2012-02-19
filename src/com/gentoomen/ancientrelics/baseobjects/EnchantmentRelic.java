package com.gentoomen.ancientrelics.baseobjects;

import org.bukkit.event.Event;

public class EnchantmentRelic {
	protected Integer type;
	protected int cooldown;
	protected long lastUsed = 0;
	protected ItemRelic parent;
	
	public EnchantmentRelic(Integer type, int cooldown, ItemRelic parent) {
		super();
		this.type = type;
		this.cooldown = cooldown;
		this.parent = parent;
	}
	
	public boolean canUse(){
		if(lastUsed - System.currentTimeMillis() > 5000){
			return true;
		}
		return false;
	}
	
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
}
