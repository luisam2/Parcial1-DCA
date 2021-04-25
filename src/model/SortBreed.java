package model;

import java.util.Comparator;

public class SortBreed implements Comparator<Datos> {



	@Override
	public int compare(Datos o1, Datos o2) {
		// TODO Auto-generated method stub
		return o1.getBreed().compareTo(o2.getBreed());
	}

}
