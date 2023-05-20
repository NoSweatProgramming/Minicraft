package com.intermaticcore.minicraft.crafting;

import com.intermaticcore.minicraft.entity.Player;
import com.intermaticcore.minicraft.item.ToolItem;
import com.intermaticcore.minicraft.item.ToolType;

public class ToolRecipe extends Recipe {
	private ToolType type;
	private int level;

	public ToolRecipe(ToolType type, int level) {
		super(new ToolItem(type, level));
		this.type = type;
		this.level = level;
	}

	public void craft(Player player) {
		player.inventory.add(0, new ToolItem(type, level));
	}
}
