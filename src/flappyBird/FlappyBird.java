package flappyBird;

import java.awt.Graphics;

import javax.swing.JFrame;

public class FlappyBird {
	
	public static FlappyBird flappyBird;
	
	public final int WIDTH = 800, HEIGHT = 800;
	
	public Renderer renderer;
	
	public FlappyBird() {
		JFrame jframe = new JFrame();
		
		renderer = new Renderer();
		// this is just a comment
		// i just want to try more
		// now i know
		jframe.add(renderer);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH,HEIGHT);
		jframe.setResizable(false);
		jframe.setVisible(true);
	}
	
	public void repaint(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		flappyBird = new FlappyBird();
		
	}


}
