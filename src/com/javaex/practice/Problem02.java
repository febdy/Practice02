package com.javaex.practice;

import java.util.Scanner;

public class Problem02 {

	static int n = 5;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float inputs[] = new float[n];
		float sum = 0;

		// Using Array.
		for (int i = 0; i < n; i++) {
			inputs[i] = sc.nextFloat();
		}

		for (int i = 0; i < n; i++) {
			sum += inputs[i];
		}

		System.out.println("평균은 " + (sum / n) + "입니다.");

		// not using Array.
		sum = 0;

		for (int i = 0; i < n; i++) {
			sum += sc.nextFloat();
		}

		System.out.println("평균은 " + (sum / n) + "입니다.");
	}
}
