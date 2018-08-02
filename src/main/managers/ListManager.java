package main.managers;

import main.models.List;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ListManager {
	public List list;
	
	public Component add(String name) {
		JPanel listPanel = new JPanel();
		listPanel.setSize(200, 100);
		listPanel.setBounds(50, 50, 200, 100);
		JLabel label = new JLabel("test");
		label.setBounds(50, 50, 50, 50);
		listPanel.add(label);
		listPanel.setBackground(Color.BLACK);
		return listPanel;
	}
}
