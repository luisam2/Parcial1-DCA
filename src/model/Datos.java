package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Datos implements Comparable<Datos>{

	private PApplet app;
	private PImage img;
	private int date;
	private String name;
	private int id;
	private String breed;
	private int x;
	private int y;
	
	//All data for create the interface
	public Datos(PImage img, String name, int date, int id, String breed, PApplet app) {
		this.app = app;
		this.img = img;
		this.name = name;
		this.date = date;
		this.id = id;
		this.breed = breed;
	}

	//return  app
	public PApplet getApp() {
		return app;
	}

	//param app the app to set
	public void setApp(PApplet app) {
		this.app = app;
	}


	//return images
	public PImage getImg() {
		return img;
	}

	//set images
	public void setImg(PImage img) {
		this.img = img;
	}

	//return  date
	public int getDate() {
		return date;
	}

	//set date
	public void setDate(int date) {
		this.date = date;
	}

	//return name
	public String getName() {
		return name;
	}

	//set name
	public void setName(String name) {
		this.name = name;
	}

	//get id
	public int getId() {
		return id;
	}

	//set id
	public void setId(int id) {
		this.id = id;
	}

	//return breed
	public String getBreed() {
		return breed;
	}

	//set breed
	public void setBreed(String breed) {
		this.breed = breed;
	}

	//get x
	public int getX() {
		return x;
	}

	//set x
	public void setX(int x) {
		this.x = x;
	}

	//get y
	public int getY() {
		return y;
	}

	//set y
	public void setY(int y) {
		this.y = y;
	}

	// paint data in the canvas
	public void paint(int x, int y) {
		this.x = x;
		this.y = y;
		app.fill(255);
		
		app.image(img, x, y,50,100);
		app.text(name,x,y+125);
		app.text(date,x,y+150);
		app.text(id + "%", x, y+175);
		app.text(breed, x, y+200);
		
	}

	@Override
	public int compareTo(Datos o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}

}
