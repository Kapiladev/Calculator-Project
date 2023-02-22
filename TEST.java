package com.projrct;

import java.util.Scanner;

interface Calculator{
	int add(int a,int b);
	int sub(int a,int b);
	int mul(int a,int b);
	int div(int a,int b);
}
class CalculatorIMP implements Calculator{
	 public int add(int a,int b) {
		return a+b;
	}
	 public int sub(int a,int b) {
			return a-b;
		}
	 public int mul(int a,int b) {
			return a*b;
		}
	 public int div(int a,int b) {
			return a/b;
		}
	 
}
public class TEST {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	Calculator cal=new CalculatorIMP();
	System.out.println("welcome to calculator");
	while(true) {
		System.out.println("1:ADDITION\n2:SUBTRACTION\n3:MULPLICATION\n4:DIVISION\n5:EXIT");
		System.out.println("enter the choice : -");
		int choice=scan.nextInt();
		int a=0;
		int b=0;
		if(choice>=1&&choice<=4) {
			System.out.println("enter the 1st number : -");
			a=scan.nextInt();
			System.out.println("enter the 2nd number : -");
			b=scan.nextInt();
		}
		switch(choice) {
		case 1:
			int sum=cal.add(a, b);
			System.out.println("SUM OF DEGITS : -"+sum);
			break;
		case 2:
			int diff=cal.sub(a, b);
			System.out.println("DIFF OF DEGITS : -"+diff);
			break;
		case 3:
			int product=cal.mul(a, b);
			System.out.println("PRODUCT OF DEGITS : -"+product);
			break;
		case 4:
		System.out.println("Quotient : -"+cal.div(a, b));
		break;
		case 5:
			System.out.println("THANK YOU!");
			System.exit(0);
			default :
				System.out.println("INVALID CHOICE");
		}
		System.out.println("=========================");
		
	}
}
}
