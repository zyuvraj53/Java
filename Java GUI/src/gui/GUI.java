package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {

	private int count = 0;
	private JFrame frame;
	private JButton button;
	private JLabel label;
	private JPanel panel;
	public ImageIcon image;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public GUI() {

		frame = new JFrame();

		button = new JButton("Click Me");
		button.addActionListener(this);
		
		image = new ImageIcon("C:\\Users\\Yuvraj\\Desktop\\unnamed.png");

		label = new JLabel("Number of Clicks: 0");

		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);

		frame.setIconImage(image.getImage());
		frame.setPreferredSize(new Dimension(400, 400));
		frame.setResizable(false);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
		//--------------------------------------------------------------------------------------------------------------------------
		frame.getContentPane().setBackground(Color.orange);
		
	}

	public static void main(String[] args) {

		new GUI();
		
		JFrame f2 = new JFrame();
		f2.getContentPane().setBackground(Color.black);
		f2.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of Clicks:" + count);

	}

}
