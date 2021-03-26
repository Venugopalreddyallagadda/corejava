package com.ojas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeSalary {
	public static int high(int num[]) {
		int high = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > high) {
				high = num[i];
			}
		}
		return high;
	}
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of salaries of employees");
		int size = sc.nextInt();
		System.out.println("Enter the salaries of employees");
		int num[] = new int[size];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Highest salary:"+high(num));
		}catch (NegativeArraySizeException e) {
			 e.printStackTrace();
		}
		 catch(InputMismatchException e) {
			 e.printStackTrace();
		 }
		

	}

}
