package com.intermaticcore.minicraft.crafting;

import com.intermaticcore.minicraft.entity.Player;
import com.intermaticcore.minicraft.item.ResourceItem;
import com.intermaticcore.minicraft.item.resource.Resource;

public class ResourceRecipe extends Recipe {
	private Resource resource;

	public ResourceRecipe(Resource resource) {
		super(new ResourceItem(resource, 1));
		this.resource = resource;
	}

	public void craft(Player player) {
		player.inventory.add(0, new ResourceItem(resource, 1));
	}
}
