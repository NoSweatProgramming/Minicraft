package com.intermaticcore.minicraft.entity;

import com.intermaticcore.minicraft.crafting.Crafting;
import com.intermaticcore.minicraft.gfx.Color;
import com.intermaticcore.minicraft.screen.CraftingMenu;

public class Workbench extends Furniture {
	public Workbench() {
		super("Workbench");
		col = Color.get(-1, 100, 321, 431);
		sprite = 4;
		xr = 3;
		yr = 2;
	}

	public boolean use(Player player, int attackDir) {
		player.game.setMenu(new CraftingMenu(Crafting.workbenchRecipes, player));
		return true;
	}
}