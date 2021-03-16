package half;

import java.awt.BorderLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class HalfSquarePanel extends JPanel {
	public HalfSquarePanel() {
		setBackground(Color.black);
		setLayout(new BorderLayout());
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(new Color(0));

		// 1
		g.setColor(Color.red);
		g.drawRect(0, 0, 100, 100);
		// 2
		g.setColor(Color.orange);
		g.drawRect(100, 0, 100, 100);

		// 3
		g.setColor(Color.yellow);
		g.drawRect(200, 0, 100, 100);
		g.drawRect(200, 0, 50, 50);
		
		//4
		g.setColor(Color.green);
		g.drawRect(300, 0, 100, 100);
		g.drawRect(300, 0, 100, 50);


		//5
		g.setColor(Color.cyan);
		g.drawRect(400, 0, 100, 100);
		g.drawRect(400, 0, 100, 50);
		g.drawRect(450, 50, 50,50);
		

		//6
		g.setColor(Color.cyan);
		g.drawRect(400, 0, 100, 100);
		g.drawRect(400, 0, 100, 50);
		g.drawRect(450, 50, 50,50);
	}

	@Override
	public void paintAll(Graphics g) {
	}
}
