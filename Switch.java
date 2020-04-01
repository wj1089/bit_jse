package com.jse.app;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("주민등록번호를 입력해주세요(641221-1237789)>>");
		Scanner sc = new Scanner(System.in);
		String gennum = sc.next();
		char num = gennum.charAt(7);
		switch(num) {
		case '1': case'3':
			System.out.println("남자");
			break;

		case '2': case'4':
			System.out.println("여자");
			break;

		case '5': case'6':
			System.out.println("외국인");
			break;
			default:
				System.out.println("wrong");
		}
	}
}