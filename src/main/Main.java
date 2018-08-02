package main;

import main.managers.*;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(800, 600);;
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		ListManager list = new ListManager();
		mainFrame.add(list.add("test"));
	}
}
