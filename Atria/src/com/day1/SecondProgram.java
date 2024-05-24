package com.day1;
import java.util.Scanner;
public class SecondProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name,usn,branch;
 float marks;
 Scanner sc= new Scanner(System.in);
 System.out.println("enter the studnt name,usn,branch,marks");
 name=sc.nextLine();
 usn=sc.nextLine();
 branch=sc.nextLine();
 marks=sc.nextFloat();
 System.out.println("The details are : ");
 System.out.println("the name "+name);
 System.out.println("the usn" +usn);
 System.out.println("the branch"+branch);
 System.out.println("the marks" + marks);
	}

}
