package square;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class SquareCanvasPanel extends JPanel {
	public SquareCanvasPanel() {
		setLayout(new BorderLayout());
		setSize(1000, 500);
		setBackground(Color.black);
	}

	@Override
	public void paint(Graphics g) {
		g.drawRect(0, 0, 100, 100);
	}

	@Override
	public void paintAll(Graphics g) {
	}
}
