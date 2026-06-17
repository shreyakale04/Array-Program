package com.calculator;

import java.util.Scanner;

public class ScientificCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose Operation");
		
		System.out.println("1, Square");
		System.out.println("2, Cube");
		System.out.println("3, SquareRoot");
		System.out.println("4, Power");
		System.out.println("5, log(10)");
		System.out.println("6, log");
		System.out.println("7, sin");
		System.out.println("8, cos");
		System.out.println("9, tan");
		System.out.println("10, Addition");
		System.out.println("11, Substraction");
		System.out.println("12, Multiplication");
		System.out.println("13, Division");
		
		int choice = sc.nextInt();
		
			switch(choice){
				//square
				case 1: 
					System.out.println("Enter a number");
					int num = sc.nextInt();
					
					System.out.println("Square of  " + num +" = "+ Math.pow(num, 2));
					break;
				
					//cube
				case 2:
					System.out.println("Enter a number");
					int num1 = sc.nextInt();
					
					System.out.println("cube of  " + num1 +" = "+ Math.pow(num1, 3));
					
					break;
					
					//sqrt
				case 3:
					System.out.println("Enter a number");
					int no = sc.nextInt();
					
					System.out.println("Square root of  " + no +" = "+ Math.sqrt(no));
					
					break;
					
					//power
				case 4:
					System.out.println("Enter a base");
					int b = sc.nextInt();
					System.out.println("Enter a exponent");
					int e = sc.nextInt();
					
					System.out.println("power of " + b + e + Math.pow(b, e));
					
					break;
					
					//log base 10
				case 5:
					System.out.println("Enter a num");
					double n = sc.nextInt();
					
					System.out.println("log of base 10 = " + Math.log10(n) );
					
					break;
					
					
					//simple log
				case 6:
					
					System.out.println("Enter a num");
					double n1 = sc.nextInt();
					
					System.out.println("log of " + n1 + " = " + Math.log(n1) );
										
                   break;
					
                   //Sin
				case 7 :
					System.out.println("Enter a angle");
					int s = sc.nextInt();
					
					System.out.println(" Sin " + s + " = " + Math.toRadians(s));
                   
					break;
					
					//cos
				case 8 :
					System.out.println("Enter a angle");
					int c = sc.nextInt();
					
					System.out.println(" Cos " + c + " = " + Math.toRadians(c));
					
					break;
					
					//tan
				case 9:
					System.out.println("Enter a angle");
					int t = sc.nextInt();
					
					System.out.println(" Tan " + t + " = " + Math.toRadians(t));
					
					break;
					
					
					//Add
					
				case 10:
					System.out.println("Enter a no1");
					double number1 = sc.nextDouble();
					
					System.out.println("Enter a no2");
					double number2 = sc.nextDouble();
					
					System.out.println("Addition of two nos = " + (number1 + number2));
					
					break;
					
					//substarction
				case 11:
					System.out.println("Enter a no1");
					double nos1 = sc.nextDouble();
					
					System.out.println("Enter a no2");
					double nos2 = sc.nextDouble();
					
					System.out.println("Substraction of two nos = " + (nos1 - nos2));
					
					break;
					
					//Mul
				case 12:
					System.out.println("Enter a no1");
					double val1 = sc.nextDouble();
					
					System.out.println("Enter a no2");
					double val2 = sc.nextDouble();
					
					System.out.println("Addition of two nos = " + (val1 * val2));
					
					break;
					
					//division
				case 13:
					System.out.println("Enter a no1");
					double a = sc.nextDouble();
					
					System.out.println("Enter a no2");
					double d = sc.nextDouble();
					
					if(d > 0){
						
						System.out.println("Division of nos = " + (a/d));
					}
					else{
						
						System.out.println("no2 is not valid");
					}
					
					break;
					
				
						
					
		}
			sc.close();

	}

}
