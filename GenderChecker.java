package com.jse.app;

import java.util.Scanner;

public class GenderChecker {

	public static void main(String[] args) {
		find();
	}
	static void find() {
		System.out.print("주민번호를 입력해주세요.(011231-1111222)");
		Scanner scanner = new Scanner(System.in);
		String ssn = scanner.next();
//		System.out.println(ssn);
		char ch = ssn.charAt(7);
		// String a = "";
		// char c = '';
		// case '1'
//		char c = 0;
		switch(ch) {
			case '1': case '3': 
				System.out.println("Man");
				break;
			case '2': case '4': 
				System.out.println("Woman");
				break;
			case '5': case '6':
				System.out.println("Foreigner");
				break;
				default:
				System.out.println("Wrong");
		}
// 1, 3
// 2, 4
// 5, 6
// 0, 7, 8, 9
		
		main(null);
	}
}
