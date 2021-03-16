package rainbow;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class RainbowPanel extends JPanel {
	public RainbowPanel() {
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0 * 100, 10, 1 * 100, 5);
		g.setColor(Color.red);
		g.fillRect(1 * 100, 10, 2 * 100, 5);
		g.setColor(Color.orange);
		g.fillRect(2 * 100, 10, 3 * 100, 5);
		g.setColor(Color.yellow);
		g.fillRect(3 * 100, 10, 5 * 100, 5);
		g.setColor(Color.green);
		g.fillRect(5 * 100, 10, 7 * 100, 5);
		g.setColor(Color.blue);
		g.fillRect(7 * 100, 10, 11 * 100, 5);
		g.setColor(Color.black);
		g.fillRect(11 * 100, 10, 12 * 100, 5);

	}

	@Override
	public void paintAll(Graphics g) {
	}
}
