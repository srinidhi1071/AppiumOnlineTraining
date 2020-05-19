package com.tyss.appiumtraining.tests;

import java.util.Scanner;

public class Lion_Deer_Assignment {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int lionX=  sc.nextInt();
		int lionY= sc.nextInt();
		int deerZ= sc.nextInt();
		
		 int x = Math.abs(deerZ-lionX);
		 int y= Math.abs(deerZ-lionY);
		 
		 if(x>y) {
			 System.out.println("Lion Y wins");
		 }
		 else if(x<y) {
			 System.out.println("Lion X wins");
		 }
		 else if(x==y) {
			 System.out.println("Deer Z wins");
		 }

	}

}
