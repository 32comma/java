package half;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class HalfSquareFrame extends JFrame {
	public HalfSquareFrame() {
		HalfSquarePanel waveSquarePattern = new HalfSquarePanel();
		add(waveSquarePattern, BorderLayout.CENTER);
		setSize(1500, 500);
		setBackground(Color.black);
		setVisible(true);
	}

	public static void main(String[] args) {
		new HalfSquareFrame();
	}
}
