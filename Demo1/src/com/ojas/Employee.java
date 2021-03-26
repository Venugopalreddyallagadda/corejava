package com.ojas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of employee");
		int size = sc.nextInt();
		System.out.println("Please enter  emp salaries");
		try {
			int num[] = new int[size];
			double total = 0;
			for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();

				total = total+num[i];
			}
			double avg = total / num.length;
			System.out.println(avg);

		} catch (InputMismatchException e) {
			
			e.printStackTrace();
		
		}
		
	}
}
////Helllo Venu