package com.intermaticcore.minicraft.level.tile;

import com.intermaticcore.minicraft.entity.AirWizard;
import com.intermaticcore.minicraft.entity.Entity;
import com.intermaticcore.minicraft.gfx.Screen;
import com.intermaticcore.minicraft.level.Level;

public class InfiniteFallTile extends Tile {
	public InfiniteFallTile(int id) {
		super(id);
	}

	public void render(Screen screen, Level level, int x, int y) {
	}

	public void tick(Level level, int xt, int yt) {
	}

	public boolean mayPass(Level level, int x, int y, Entity e) {
		if (e instanceof AirWizard) return true;
		return false;
	}
}
