package com.cts.creatio.crm.language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class FirstHelloWorld {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Hello,World!");
		
		//print the content and then go to next line 
		System.out.println("Hello.dileep");
		System.out.println("Hello.sa");
		
		//print the content and then stay on same line
		System.out.print("Hello");
		System.out.print(" World!");
		System.out.println();
		//print the formated content and then stay on same line
		System.out.printf("%s is completed Btech, empid is %d and visa status is %b","Satya",1236,false);
		System.out.println();
		
		//join multiple print statements together
		System.out.append("Satya reddy") .append(", My empid is 1234");
		System.out.println();
		
	    System.out.format("Total Bill is %.2f %n",100.93453657);
	    System.out.println();
	    
	    System.out.write(65);
	    System.out.println();
	    
	    Logger log = Logger.getLogger("MyLogger");
	    log.info("Current line is 44");
	    log.warning("there is a mistake in line 34, please check");
	    System.err.println("Error : Expected result is not matching withb actual result");
	    
	    PrintWriter Writer = new PrintWriter("C:\\Automation Training\\AutomationProject\\logs.txt");
	    Writer.println(LocalDateTime.now()+"Currently Line 54 is running");
	    Writer.println(LocalDateTime.now()+"Currently Line 54 is running");
	    Writer.close();
	 
	

	}

}
