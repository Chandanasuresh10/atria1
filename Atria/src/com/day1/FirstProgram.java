package com.day1;
import java.util.Scanner;
public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int n1,n2,sub,mul,div;
	 float res1,res2,res3,res4;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter the n1 n2");
	 n1=sc.nextInt();
	 n2=sc.nextInt();
	 res1=n1+n2;
	 res2=n1-n2;
	 res3=n1*n2;
	 res4=n1/n2;
	 System.out.println("the sum is" +res1);
	 System.out.println("the sum is" +res2);
	 System.out.println("the sum is" +res3);
	 System.out.println("the sum is" +res4);
	}

}
