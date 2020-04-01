package com.jse.app;

public class Sum1To100 {

	public static void main(String[] args) {
		Sum1To100();
	}
	static void Sum1To100() {
		
		
			int sum = 0;
			for(int i=0; i<=100; i++) {
				sum += i;
				System.out.println(i);
			}
			System.out.printf("합계 %d", sum);
		}
	}

