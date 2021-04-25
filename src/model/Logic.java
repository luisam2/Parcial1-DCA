package model;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {

	private PApplet app;
	
	private String[] urlTXTEntrada1;
	private String[] urlTXTEntrada2;
	private String[] urlTXTSalida;
	
	private LinkedList <Datos> list;
	
	
	private SortName sortName;
	private SortBreed sortBreed;
	private SortDate sortDate;
	private String[] saveId, saveName, saveDate, saveBreed; 
	
	private String imgName;
	private PImage img;
	private String name;
	private String breed;
	
	private int date;
	private int id;
	
	
	public Logic(PApplet app) {
		// TODO Auto-generated constructor stub
		this.app = app;
		list = new LinkedList<Datos>();
		urlTXTEntrada1 = app.loadStrings("./../data/TXT1.txt");
		sortName = new SortName();
		sortBreed = new SortBreed();
		sortDate = new SortDate();
		
		saveDate = new String[6];
		saveName = new String[6];
		saveId = new String[6];
		saveBreed = new String[6];
		
		for(int i=0; i<urlTXTEntrada1.length; i++) {
			urlTXTSalida = urlTXTEntrada1[i].split(",");
			
			
	
			imgName= urlTXTSalida[0].toLowerCase().replaceAll("\\s", "");
			
			img = app.loadImage("./../dataImages/"+ imgName + ".png");
			
			name = urlTXTSalida[0];
			date = Integer.parseInt(urlTXTSalida[1]);
			id = Integer.parseInt(urlTXTSalida[2]);
			breed = urlTXTSalida[3];
			
			list.add(new Datos(img, name, date, id, breed,app));
		}
	}
	
	public void sortList(char c) {
		switch (c) { 
		case 'l':
				Collections.sort(list);
				for (int i = 0; i < list.size(); i++) {

					String name = list.get(i).getName();
					String date = Integer.toString(list.get(i).getDate());
					String id = Integer.toString(list.get(i).getId());
					String breed = list.get(i).getBreed();
					
					String element = name + "," + date + "," + id + "," + breed ;

					saveId[i] = element;

					app.saveStrings("TXT1.txt", saveId);
				}
			break;
		case 'n':
				Collections.sort(list,sortName);
				for (int i = 0; i < list.size(); i++) {

					String name = list.get(i).getName();
					String date = Integer.toString(list.get(i).getDate());
					String id = Integer.toString(list.get(i).getId());
					String breed = list.get(i).getBreed();
					
					String element = name + "," + date + "," + id + "," + breed ;

					saveName[i] = element;

					app.saveStrings("TXT1.txt", saveName);
				}
			break;
		case 'd':
				Collections.sort(list,sortDate);
				for (int i = 0; i < list.size(); i++) {

					String name = list.get(i).getName();
					String date = Integer.toString(list.get(i).getDate());
					String id = Integer.toString(list.get(i).getId());
					String breed = list.get(i).getBreed();
					
					String element = name + "," + date + "," + id + "," + breed ;

					saveDate[i] = element;

					app.saveStrings("TXT2.txt", saveDate);
				}
			break;
		case 't':
			Collections.sort(list,sortBreed);
			for (int i = 0; i < list.size(); i++) {

				String name = list.get(i).getName();
				String date = Integer.toString(list.get(i).getDate());
				String id = Integer.toString(list.get(i).getId());
				String breed = list.get(i).getBreed();
				
				String element = name + "," + date + "," + id + "," + breed ;

				saveBreed[i] = element;

				app.saveStrings("TXT2.txt", saveBreed);
			}
		break;

		}
		
	}

	// return list
	public LinkedList<Datos> getList() {
		return list;
	}

	// set list
	public void setList(LinkedList<Datos> list) {
		this.list = list;
	}

	
}
