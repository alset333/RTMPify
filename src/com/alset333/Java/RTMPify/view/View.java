package com.alset333.Java.RTMPify.view;

import javax.swing.JFrame;

public class View {

	private JFrame window;
	
	public View() {
		window = new JFrame("RTMPify");
//		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
