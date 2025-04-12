package com.cts.creatio.crm.language.basics;

import java.io.PrintStream;

public class ArrayConcepts {

	private static final String[][][] Subjects = null;
	private static final String[][][] Data = null;
	private static final String[][][] Marks = null;

	public static void main(String[] args) {
		
		String [][][] semisters = new String[5][2][6];//5 semesters,each semester 2 groups(sub,marks) each group have 6 subjects
		//semester 1
		
		//subjects
		Subjects[0][0][0] = "Mathematics 1";
		Subjects[0][0][1] = "Physics";
		Subjects[0][0][2] = "Chemistery";
		Subjects[0][0][3] = "Computer programming";
		Subjects[0][0][4] = "Engineering Drawing";
		Subjects[0][0][5] = "Basic Elecrical Eng.";
		
		//Marks
		Marks[0][1][0] = "Pass(78)";
		Marks[0][1][1] = "Pass(85)";
		Marks[0][1][2] = "Fail(21)";
		Marks[0][1][3] = "Pass(74)";
		Marks[0][1][4] = "Pass(88)";
		Marks[0][1][5] = "Pass(79)";
		
		//Semester2
		Subjects[1][0][0] = "Mathematics II";
		Subjects[1][0][1] = "Mechanics";
		Subjects[1][0][2] = "Environmental Sci.";
		Subjects[1][0][3] = "Basic Electronics";
		Subjects[1][0][4] = "Engineering Physics";
		Subjects[1][0][5] = "Engineering Graphics";
		
		Marks[1][1][0] = "Pass(82)";
		Marks[1][1][1] = "Pass(77)";
		Marks[1][1][2] = "Pass(93)";
		Marks[1][1][3] = "Fail(19)";
		Marks[1][1][4] = "Fail(24)";
		Marks[1][1][5] = "Pass(90)";
		
		//Semister3
		
		semisters[1][0][4] = "Basic electronics";
		semisters[1][0][5] = "Engineering Physics";
		semisters[3][1][2] = "fail 19";
		semisters[3][1][5] = "pass 87"; 
		
		System.out.append(semisters[1][0][4] ).append(semisters[1][0][5]);
		System.out.println();
		System.out.append(semisters[3][1][2] )	 .append(semisters[3][1][5]);
		
		
	}

}
