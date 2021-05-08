package com.alset333.Java.RTMPify.view;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {

	private JFrame window;
	private JPanel panel;
	private JPanel srcPanel;
	private JPanel destPanel;

	public View() {
		window = new JFrame("RTMPify");
		

		window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.Y_AXIS));
		
//		panel = new JPanel();
//		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		
		srcPanel = new JPanel();
		srcPanel.add(new JLabel("Video file"));
		srcPanel.add(new JTextField(10));
		srcPanel.add(new JButton("Browse..."));
		
		
		destPanel = new JPanel();
		destPanel.add(new JLabel("Stream URL"));
		destPanel.add(new JTextField(10));
		destPanel.add(new JButton("Button"));
		
		
//		statusPanel = new JPanel();

		


		window.add(srcPanel);
		window.add(destPanel);

		
		
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
