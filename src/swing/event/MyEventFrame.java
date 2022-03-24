package swing.event;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyEventFrame extends JFrame implements ActionListener{

	private JButton btn;		// 인스턴스 변수 
	private JButton btn2;
	
	public MyEventFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(1300, 300);
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		btn = new JButton("Action");		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("AAAA");
			}
		});
		
		add(btn);
		
		btn2 = new JButton("클릭");
		btn2.addActionListener(this);
		add(btn2);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == btn) {
			String s = btn.getText();
			if(s.equals("Action")) {
				btn.setText("엑션");
			} else {
				btn.setText("Action");
			}
		} else if(obj == btn2) {
			btn.setBackground(Color.RED);
		}
	}
}
