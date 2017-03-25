package com.markaldrich.jgl.testGames;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import com.markaldrich.jgl.JGLGame;
import com.markaldrich.jgl.JGLGameController;
import com.markaldrich.jgl.JGLGameProperties;

@SuppressWarnings("serial")
public class SampleGame1 extends JGLGame {
	
	private static final Font TITLE_FONT = new Font("Times New Roman", Font.BOLD, 24);
	private static final String TITLE = "Sample Game";
	
	private static final int WIDTH = 800, HEIGHT = 600;
	
	private int x, y;
	private int speed;

	public SampleGame1(JGLGameProperties props) {
		super(props);
	}

	@Override
	public void initGame() {
		x = 50;
		y = 50;
		speed = 2;
	}

	@Override
	public void render(Graphics2D g) {
		g.setColor(Color.RED);
		g.setFont(TITLE_FONT);
		g.drawString(TITLE, WIDTH / 2 - g.getFontMetrics().stringWidth(TITLE) / 2, 36);
		
		g.setColor(Color.WHITE);
		g.fillRect(x, y, 20, 20);
		
	}

	@Override
	public void update() {
		if (checkIfKeyIsDown(KeyEvent.VK_RIGHT)) {
			x += speed;
		}
		
		if (checkIfKeyIsDown(KeyEvent.VK_LEFT)) {
			x -= speed;
		}
		
		if (checkIfKeyIsDown(KeyEvent.VK_DOWN)) {
			y += speed;
		}
		
		if (checkIfKeyIsDown(KeyEvent.VK_UP)) {
			y -= speed;
		}
	}
	
	public static void main(String[] args) {
		JGLGameProperties props = new JGLGameProperties("Sample Game 1", WIDTH, HEIGHT);
		JGLGame game = new SampleGame1(props);
		JGLGameController.startGame(game, props);
	}

}
