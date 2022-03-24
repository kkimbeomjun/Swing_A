package swing.frame;

import javax.swing.JFrame;

public class MyFrame {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		jf.setTitle("내 프레임");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocation(1300, 300);
		jf.setSize(300, 300);
		jf.setVisible(true);
	}

}
