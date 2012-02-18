package com.gentoomen.ancientrelics.baseobjects;

public class EnchantmentRelic {
	private Integer type;
	private int cooldown;
	private long lastUsed = 0;
	
	public void excute(){
		if(lastUsed - System.currentTimeMillis() > 5000){
			
		}
		
	}
	
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
}
