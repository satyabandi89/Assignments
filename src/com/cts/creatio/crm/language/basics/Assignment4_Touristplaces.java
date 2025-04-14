package com.cts.creatio.crm.language.basics;

import java.util.HashSet;
import java.util.Set;

public class Assignment4_Touristplaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> Attractions = new HashSet<>();
		Attractions.add("Eiffel Tower");
		Attractions.add("Annefrank House");
		Attractions.add("Colosseum");
		Attractions.add("Empire State Building");
		Attractions.add("Louvre Museum");
		Attractions.add("Gardens by the bay");
		Attractions.add("Duomo di milano");
		Attractions.add("Basillica.de la sagrada familia");
		Attractions.add("Sheikh zayed grand mosque centre");
		Attractions.add("cayman crystal caves");
		System.out.println("Top most visited Tourist places are:"+ Attractions.size());
        System.out.println(Attractions);
	}

	

}
