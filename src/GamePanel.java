import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	JButton[] buttons;
	private int searchedNumber = 12;
	public GamePanel(int count, int searchedNumber) {
		buttons = new JButton[count];
		this.searchedNumber = searchedNumber;
		ClickAction clickAction = new ClickAction();
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(""+i);
			buttons[i].addActionListener(clickAction);
			this.add(buttons[i]);
		}
		
	}
	private class ClickAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			for(int i = 0;i<buttons.length;i++) {
				if(Integer.parseInt(e.getActionCommand())<searchedNumber && i<=Integer.parseInt(e.getActionCommand())) {
					buttons[i].setEnabled(false);
					buttons[i].setBackground(Color.RED);
				}
				if(Integer.parseInt(e.getActionCommand())>searchedNumber && i>=Integer.parseInt(e.getActionCommand())) {
					buttons[i].setEnabled(false);
					buttons[i].setBackground(Color.RED);
				}
				if(Integer.parseInt(e.getActionCommand())==searchedNumber && i==0) {
					buttons[Integer.parseInt(e.getActionCommand())].setBackground(Color.GREEN);
					JOptionPane.showMessageDialog(buttons[Integer.parseInt(e.getActionCommand())], "Win");
				}
			}
		}
		
	}
}
