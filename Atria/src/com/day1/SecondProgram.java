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
 marks=sc.nextInt();
 //System.out.print("the student details are\n" +name+usn+branch+marks);
 System.out.println("the name " +name);
 System.out.println("the usn" +usn);
 System.out.println("the branch"+branch);
 System.out.println("the mrks" + marks);
	}

}
