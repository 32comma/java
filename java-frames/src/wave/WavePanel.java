package wave;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class WavePanel extends JPanel {
	public WavePanel() {
		setBackground(Color.black);
		setLayout(new BorderLayout());
		setSize(1500, 500);
	}

	@Override
	public void paint(Graphics g) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				try {
					for (int x = 0, i = 1; x < 30; x++, i = i * -1) {
						g.setColor(new Color(32, (256 - 32) / 30 * x, 32));
						g.drawArc(x * 50, 50, 50, 50, 0, 180 * (i));
						Thread.sleep(100);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		Thread th = new Thread(r);
		th.run();
	}
}
