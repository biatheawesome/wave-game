package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;

public class HUD
{
	public static int HEALTH=100;
	
	public void tick() {
		
		HEALTH=Game.clamp(HEALTH, 0, 100);
		
	}
	
	public void render(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(15, 15, 200, 20);
		
		g.setColor(Color.GREEN);
		g.fillRect(15, 15, HEALTH*2, 20);
		
		g.setColor(Color.WHITE);
		g.drawRect(15, 15, 200, 20);
	}

}
