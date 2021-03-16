package square;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class SquareFrame extends JFrame{
	public SquareFrame() {
		SquareCanvasPanel canvasPanel = new SquareCanvasPanel();
		setLayout(new BorderLayout());
		add(canvasPanel, BorderLayout.CENTER);
		setTitle("Canvas");
		setSize(1000, 500);
		setVisible(true);
	}
	public static void main(String []args) {
		new SquareFrame();
	}
}
