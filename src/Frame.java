import javax.swing.JFrame;

public class Frame extends JFrame {

	public Frame(int count) {
		
		this.add(new GamePanel(count, (int)(Math.random() * count)));
		
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Frame(30);
	}

}
