package wave;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class WaveFrame extends JFrame {
	public WaveFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WavePanel waveSquarePattern = new WavePanel();
		Thread th = new Thread() {

			@Override
			public void run() {
				
			}
			
		};
		add(waveSquarePattern, BorderLayout.CENTER);
		setSize(1500, 500);
		setBackground(Color.black);
		setVisible(true);
	}

	public static void main(String[] args) {
		new WaveFrame();
	}
}
