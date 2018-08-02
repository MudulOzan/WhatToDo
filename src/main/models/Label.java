package main.models;

public class Label {
	public int ID;
	public LabelType LabelType;
	
	enum LabelType {
		GREEN,
		YELLOW,
		ORANGE,
		RED,
		PURPLE,
		BLUE,
		BLACK,
		NONE
	}
}
