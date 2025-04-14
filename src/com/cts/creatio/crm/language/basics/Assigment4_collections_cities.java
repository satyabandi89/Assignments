package com.cts.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

public class Assigment4_collections_cities {

	public static void main(String[] args) {
		List<String> LargestCitiesArrayList= new ArrayList<String>();
		LargestCitiesArrayList.add("Hyderabad");
		LargestCitiesArrayList.add("Banglore");
		LargestCitiesArrayList.add("Chennai");
		LargestCitiesArrayList.add("pune");
		LargestCitiesArrayList.add("vijayawada");
		System.out.println("Top largest cities are:"+ LargestCitiesArrayList.size());
        System.out.println(LargestCitiesArrayList.get(3)+"," +(LargestCitiesArrayList.get(4)));
	}

}
