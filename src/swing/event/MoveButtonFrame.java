package swing.event;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MoveButtonFrame extends JFrame{

	public MoveButtonFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(1300, 300);
		setSize(300, 300);
		setLayout(new BorderLayout());
		
		setVisible(true);
	}		
}
