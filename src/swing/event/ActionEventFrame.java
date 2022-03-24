package swing.event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionEventFrame extends JFrame{

	public ActionEventFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(1300, 300);
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");		
		MyActionListener mal = new MyActionListener();
		btn.addActionListener(mal);
		add(btn);
		
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JButton b = (JButton) e.getSource();
			String s = b.getText();
			if(s.equals("Action")) {
				b.setText("엑션");
			} else {
				b.setText("Action");
			}
			
		}

	}
}


