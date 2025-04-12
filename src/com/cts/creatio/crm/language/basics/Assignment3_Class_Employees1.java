package com.cts.creatio.crm.language.basics;

public class Assignment3_Class_Employees1 extends Assignment_Class_Employees {

	public static void main(String[] args) {
		
		Assignment3_Class_Employees1 obj = new Assignment3_Class_Employees1();
		
		String[] empnames = new String[3];
		empnames[0]=  obj.empname1;
		empnames[1] = obj.empname2;
		empnames[2] = obj.empname3;
		
		int[]empIds = new int[3];
		empIds[0]=  obj.empId1;
		empIds[1] = obj.empId2;
		empIds[2] = obj.empId3;
		
		System.out.println(empnames[0]+" : "+empIds[0]);
		System.out.println(empnames[1]+" : "+empIds[1]);
		System.out.println(empnames[2]+" : "+empIds[2]);
	}

}
