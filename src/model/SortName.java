package model;

import java.util.Comparator;

public class SortName implements Comparator<Datos> {

	@Override
	public int compare(Datos o1, Datos o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}



}
