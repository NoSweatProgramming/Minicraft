package com.intermaticcore.minicraft.item;

import com.intermaticcore.minicraft.entity.Player;
import com.intermaticcore.minicraft.gfx.Color;
import com.intermaticcore.minicraft.gfx.Font;
import com.intermaticcore.minicraft.gfx.Screen;
import com.intermaticcore.minicraft.level.Level;
import com.intermaticcore.minicraft.level.tile.Tile;
import com.intermaticcore.minicraft.screen.MapMenu;

public class Map extends Item {
	public int getColor() {
		return Color.get(-1, 999, 444, 444);
	}

	public int getSprite() {
		return 14 + 4 * 32;
	}

	public void renderIcon(Screen screen, int x, int y) {
		screen.render(x, y, getSprite(), getColor(), 0);
	}

	public void renderInventory(Screen screen, int x, int y) {
		screen.render(x, y, getSprite(), getColor(), 0);
		Font.draw(getName(), screen, x + 8, y, Color.get(-1, 555, 555, 555));
	}

	public String getName() {
		return "Map";
	}

	public boolean interactOn(Tile tile, Level level, int xt, int yt, Player player, int attackDir) {
		player.game.setMenu(new MapMenu(level, player));
		return true;
	}
}