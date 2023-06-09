package com.intermaticcore.minicraft.crafting;

import java.lang.reflect.InvocationTargetException;

import com.intermaticcore.minicraft.entity.Player;
import com.intermaticcore.minicraft.item.Item;

public class ItemRecipe extends Recipe {
	private Class<? extends Item> clazz;

	public ItemRecipe(Class<? extends Item> clazz) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		super(clazz.getConstructor().newInstance());
		this.clazz = clazz;
	}

	public void craft(Player player) {
		try {
			player.inventory.add(clazz.getConstructor().newInstance());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
