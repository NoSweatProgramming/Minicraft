package com.intermaticcore.minicraft.level.tile;

import com.intermaticcore.minicraft.entity.ItemEntity;
import com.intermaticcore.minicraft.entity.Player;
import com.intermaticcore.minicraft.gfx.Color;
import com.intermaticcore.minicraft.gfx.Screen;
import com.intermaticcore.minicraft.item.Item;
import com.intermaticcore.minicraft.item.ResourceItem;
import com.intermaticcore.minicraft.item.ToolItem;
import com.intermaticcore.minicraft.item.ToolType;
import com.intermaticcore.minicraft.item.resource.Resource;
import com.intermaticcore.minicraft.level.Level;
import com.intermaticcore.minicraft.sound.Sound;

public class DirtTile extends Tile {
	public DirtTile(int id) {
		super(id);
	}

	public void render(Screen screen, Level level, int x, int y) {
		int col = Color.get(level.dirtColor, level.dirtColor, level.dirtColor - 111, level.dirtColor - 111);
		screen.render(x * 16 + 0, y * 16 + 0, 0, col, 0);
		screen.render(x * 16 + 8, y * 16 + 0, 1, col, 0);
		screen.render(x * 16 + 0, y * 16 + 8, 2, col, 0);
		screen.render(x * 16 + 8, y * 16 + 8, 3, col, 0);
	}

	public boolean interact(Level level, int xt, int yt, Player player, Item item, int attackDir) {
		if (item instanceof ToolItem) {
			ToolItem tool = (ToolItem) item;
			if (tool.type == ToolType.shovel) {
				if (player.payStamina(4 - tool.level)) {
					level.setTile(xt, yt, Tile.hole, 0);
					level.add(new ItemEntity(new ResourceItem(Resource.dirt), xt * 16 + random.nextInt(10) + 3, yt * 16 + random.nextInt(10) + 3));
					Sound.monsterHurt.play();
					return true;
				}
			}
			if (tool.type == ToolType.hoe) {
				if (player.payStamina(4 - tool.level)) {
					level.setTile(xt, yt, Tile.farmland, 0);
					Sound.monsterHurt.play();
					return true;
				}
			}
		}
		return false;
	}
}
