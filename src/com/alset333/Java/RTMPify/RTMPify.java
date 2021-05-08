/**
 * 
 */
package com.alset333.Java.RTMPify;

import java.io.IOException;

import com.alset333.Java.RTMPify.controller.Controller;
import com.alset333.Java.RTMPify.view.View;

/**
 * @author Peter Maar
 * @version 0.1.0
 *
 */
public class RTMPify {

	/**
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		System.out.println("Hello, world!");
		
//		View v = new View();
		
		
		try {
			Controller c = new Controller();
			Controller.CommandTest();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
