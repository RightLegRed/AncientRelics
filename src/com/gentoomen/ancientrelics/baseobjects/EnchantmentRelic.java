package com.gentoomen.ancientrelics.baseobjects;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.inventory.ItemStack;

public class EnchantmentRelic extends Enchantment{
	protected Integer type;
	protected int cooldown;
	protected long lastUsed = 0;
	protected ItemRelic parent;
	
	public EnchantmentRelic(Integer id, int cooldown, ItemRelic parent) {
		super(id);
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

	@Override
	public boolean canEnchantItem(ItemStack arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EnchantmentTarget getItemTarget() {
		// TODO Auto-generated method stub
		return EnchantmentTarget.ALL;
	}

	@Override
	public int getMaxLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Firebrand";
	}

	@Override
	public int getStartLevel() {
		// TODO Auto-generated method stub
		return 0;
	}
}
