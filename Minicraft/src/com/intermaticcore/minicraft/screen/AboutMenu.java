package com.intermaticcore.minicraft.screen;

import com.intermaticcore.minicraft.gfx.Color;
import com.intermaticcore.minicraft.gfx.Font;
import com.intermaticcore.minicraft.gfx.Screen;

public class AboutMenu extends Menu {
	private Menu parent;

	public AboutMenu(Menu parent) {
		this.parent = parent;
	}

	public void tick() {
		if (input.attack.clicked || input.menu.clicked) {
			game.setMenu(parent);
		}
	}

	public void render(Screen screen) {
		screen.clear(0);

		Font.draw("About Minicraft", screen, 2 * 8 + 4, 1 * 8, Color.get(0, 555, 555, 555));
		Font.draw("Minicraft was made", screen, 0 * 8 + 4, 3 * 8, Color.get(0, 333, 333, 333));
		Font.draw("by Intermaticcore", screen, 0 * 8 + 4, 4 * 8, Color.get(0, 333, 333, 333));
		Font.draw("in May of 2023 with", screen, 0 * 8 + 4, 5 * 8, Color.get(0, 333, 333, 333));
		Font.draw("Java", screen, 0 * 8 + 4, 6 * 8, Color.get(0, 333, 333, 333));
	}
}
