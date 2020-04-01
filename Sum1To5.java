package com.jse.app;

import java.util.Scanner;

public class Sum1To5 {
	public static void main(String[] args) {
		sum();
	}
	static void sum() {
		
		int sum = 0;
		for(int i=0; i<=10; i++) {
			sum += i;
			System.out.println(i);
		}
			System.out.printf("합계 %d : ", sum);

	}
}

