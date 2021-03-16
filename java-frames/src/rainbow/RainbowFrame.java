package rainbow;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class RainbowFrame extends JFrame {
	public RainbowFrame() {
		RainbowPanel waveSquarePattern = new RainbowPanel();
		add(waveSquarePattern, BorderLayout.CENTER);
		setSize(1500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RainbowFrame();
	}
}
