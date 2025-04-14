package com.cts.creatio.crm.language.basics;

import java.util.LinkedList;
import java.util.List;

public class Asssignment4_Groosingmovies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> GrossingmoviesLinkedList = new LinkedList<String>();
		GrossingmoviesLinkedList.add("pushpa");
		GrossingmoviesLinkedList.add("bahubali");
		GrossingmoviesLinkedList.add("Devara");
		GrossingmoviesLinkedList.add("RRR");
		GrossingmoviesLinkedList.add("Kalki");
		
		System.out.println("Top Highest grossing movies are:"+GrossingmoviesLinkedList.size());
		System.out.println(GrossingmoviesLinkedList.get(2));
	}

}
