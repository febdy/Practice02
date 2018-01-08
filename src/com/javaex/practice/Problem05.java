package com.javaex.practice;

public class Problem05 {
	public static void main(String[] args) {
		int[] numbers = new int[46];
		int number = 0, cnt = 0;

		while (cnt != 6) {
			number = (int) (Math.random() * 45 + 1);

			if (numbers[number] == 0) {
				System.out.print(number + " ");
				numbers[number] = 1;
				cnt++;
			}
		}
	}
}
