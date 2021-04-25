package view;

import controller.ControllerMain;
import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}

	private ControllerMain controller;
	
	public void settings() {
		size(600,600);
	}
	
	public void setup() {
		controller = new ControllerMain(this);
	}
	
	public void draw() {
		background(0);
		for(int i=0; i< controller.listDatos().size(); i++) {
			controller.listDatos().get(i).paint(i * 100, 150);
		}
		
		
		text("Press  ", 100, 500);
		text("Press ", 100, 525);
		text("Press  ", 100, 550);
		text("Press  ", 100, 575);

	}
	
	public void mousePressed() {
		
	}
	
	public void keyPressed() {
		System.out.println("null");
		controller.selectChar(key);
	}

}
