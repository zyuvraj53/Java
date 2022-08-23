package wxrp.bouncing_ball;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.JFrame;

public class Interface extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Interface() {
		
		setSize(840, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setTitle("Bouncing Ball Animation");
		Image icon = getToolkit().getImage(ClassLoader.getSystemResource("jar_low.jpg"));
		setIconImage(icon);
		add(new Core());
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		new Interface();
	}

}
