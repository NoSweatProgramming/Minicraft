package com.intermaticcore.minicraft.entity;

import com.intermaticcore.minicraft.gfx.Color;

public class Lantern extends Furniture {
	public Lantern() {
		super("Lantern");
		col = Color.get(-1, 000, 111, 555);
		sprite = 5;
		xr = 3;
		yr = 2;
	}

	public int getLightRadius() {
		return 8;
	}
}