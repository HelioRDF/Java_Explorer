package gui;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;

public class JFrameExemplo extends Canvas {

	public static final long serialVersionUID = 1L;
	private static JFrame jframe = new JFrame();
	private final int WIDTH = 160;
	private final int HEIGHT = 120;
	private final int SCALE = 3;

	public JFrameExemplo() {
		this.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		jframe= new JFrame();
		jframe.add(this);
		jframe.setResizable(false);
		jframe.pack();
		jframe.setLocationRelativeTo(null);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrameExemplo obj = new JFrameExemplo();
	}

}
