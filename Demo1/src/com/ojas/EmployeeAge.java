package com.ojas;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeAge {
	public static void sortAge(int num[]) {
		int temp = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}

		}
		for (int i : num)
			System.out.println(i);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  no of employees age");
		int size = sc.nextInt();
		int temp = 0;
		System.out.println("Enter the age of employees");
		int num[] = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();

		}
		sortAge(num);
	}

}
