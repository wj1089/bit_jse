package com.jse.app;

import java.util.Random;
import java.util.Scanner;

public class prac {
	public static void main(String[] args) {
		System.out.println("주사위게임을 시작합니다");
		System.out.println("기대하는 값 홀/짝을 입력합니다");
		Scanner scanner = new Scanner(System.in);
		String expect = scanner.next();
		System.out.println(String.format("사용자가 입력한 값 : %s", expect));
		Random ran = new Random(6);
		int dice = ran.nextInt();
		System.out.println(String.format("컴퓨터가 생성한 값 : %d", dice));
		System.out.println("결과 :");
		String result = "";
		
		switch(dice) {
		case 1: case 3: case 5: result= "홀"; break;
		case 2: case 4: case 6: result= "짝"; break;
		}
		System.out.println("컴퓨터 결과 : 짝");
		System.out.println(String.format("결과 : %s", result));

	}
	
}
