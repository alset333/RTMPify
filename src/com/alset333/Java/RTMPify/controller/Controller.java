package com.alset333.Java.RTMPify.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {

	public Controller() {
		// TODO Auto-generated constructor stub
	}
	
	public static void CommandTest() throws IOException, InterruptedException {
//		Runtime rt = Runtime.getRuntime();
//		try {
////			Process pr = rt.exec(new String[] {"C:\\Users\\Public\\Documents\\ffmpeg.exe", "-i", "C:\\Users\\Public\\Documents\\test.mp4", "test_rtmpify_output.mp4"});
//			Process pr = rt.exec(new String[] {"C:\\Users\\Public\\Documents\\ffmpeg.exe", "-version"});
//			
//			pr.waitFor();
//			
//			
//		} catch (IOException | InterruptedException e) {
//			e.printStackTrace();
//			System.exit(10);
//		}
		
		
		ProcessBuilder ps = new ProcessBuilder("C:\\Users\\Public\\Documents\\ffmpeg.exe", "-i", "C:\\Users\\Public\\Documents\\test.mp4", "test_rtmpify_output.mp4");

//		ProcessBuilder ps = new ProcessBuilder("C:\\Users\\Public\\Documents\\ffmpeg.exe", "-version");
		ps.redirectErrorStream(true);
		
		Process pr = ps.start();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		
		
		char c;
		while(true) {
			c = (char) in.read();
			System.out.print(c);
		}
		
		
//		String line;
//		
//		
//		
//		while(true) {
//			line = in.readLine();
//			System.out.println(line);
//		}
		
		
//		pr.waitFor();
		
//		System.out.println(line);
		
		
	}

}
