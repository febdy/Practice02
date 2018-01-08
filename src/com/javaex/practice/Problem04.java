package com.javaex.practice;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0, number = 0;
		int[] units = new int[] { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		System.out.print("금액 : ");
		money = sc.nextInt();

		for (int i = 0; i < units.length; i++) {
			if (money >= units[i]) {
				number = money / units[i];
				money -= number * units[i];
				System.out.println(units[i] + "원 : " + number + "개");
			}
		}

	}
}
