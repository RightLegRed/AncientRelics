package com.gentoomen.ancientrelics.baseobjects;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import com.gentoomen.ancientrelics.util.Tag;

public class ItemRelic {
	
	protected String name;
	protected ItemStack itemType;
	protected List<EnchantmentRelic> enchantments = new ArrayList<EnchantmentRelic>();
	protected Player owner;
	protected boolean degrades = true;
	
	public ItemRelic(String name, ItemStack itemType, List<EnchantmentRelic> enchantments,
			Player owner, boolean degrades) {
		super();
		this.name = name;
		this.itemType = itemType;
		this.enchantments = enchantments;
		this.owner = owner;
		this.degrades = degrades;
		onCreate();
	}

	public ItemRelic(String name, ItemStack itemType, List<EnchantmentRelic> enchantments,
			Player owner) {
		super();
		this.name = name;
		this.itemType = itemType;
		this.enchantments = enchantments;
		this.owner = owner;
		onCreate();
	}

	public ItemRelic(String name, ItemStack itemType, Player owner) {
		super();
		this.name = name;
		this.itemType = itemType;
		this.owner = owner;
		onCreate();
	}

	public ItemRelic(String name, ItemStack itemType, Player owner, boolean degrades) {
		super();
		this.name = name;
		this.itemType = itemType;
		this.owner = owner;
		this.degrades = degrades;
		onCreate();
	}
	
	/**
	 * Called when the item relic is picked up (created)
	 */
	public void onCreate(){
		Bukkit.getServer().broadcastMessage(ChatColor.RED + owner.getName() + " has a ossem swords");
	}
	
	public void attachToItem(){
		
	}
	
	/**
	 * Called when the player attacks, and has an item relic.
	 */
	public void onAttack(EntityDamageByEntityEvent event){
		for(EnchantmentRelic e : enchantments){
			if(e.getType() == 0){
				
			}
		}
	}
	
	/**
	 * Called when the player uses the relic.
	 */
	public void onUse(PlayerInteractEvent event){
		for(EnchantmentRelic e : enchantments){
			if(e.getType() == 1){
				
			}
		}	
	}
	
	public void onArrowLand(ProjectileHitEvent event){
		for(EnchantmentRelic e : enchantments){
			if(e.getType() == 2){

			}
		}	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public boolean isDegrades() {
		return degrades;
	}

	public void setDegrades(boolean degrades) {
		this.degrades = degrades;
	}

	public ItemStack getItemType() {
		return itemType;
	}

	public List<EnchantmentRelic> getEnchantments() {
		return enchantments;
	}
	
}
