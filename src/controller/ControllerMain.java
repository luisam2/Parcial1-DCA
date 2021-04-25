package controller;

import java.util.LinkedList;

import model.Logic;
import model.Datos;
import processing.core.PApplet;

public class ControllerMain {

	private PApplet app;
	private Logic logic;

	public ControllerMain(PApplet app) {
		this.app = app;
		logic = new Logic(app);
	}
	
	public void selectChar(char c) {
		logic.sortList(c);
	}
	
	public LinkedList<Datos> listDatos(){
		return logic.getList();
		
	}
	
	
}
