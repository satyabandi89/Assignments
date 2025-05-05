package com.cts.creatio.crm.language.basics;

public class TryandcatchExeption {

	

	public static void main(String[] args) {
	String[] empnames = new String[4];
	
   try{
		empnames[0]="Satya";
		empnames[1]="priya";
		empnames[2]= "dileep";
		empnames[3]= "dakshith";
		empnames[4]= "bandi";
   } catch (Exception e) {
	System.out.println(empnames[0]);
	System.out.println("There is error:"+e.getLocalizedMessage());
	empnames[4]= "bandi";
}finally {
   System.out.println(empnames[1]);
   System.out.println("Execution completed");
}
	}
}


