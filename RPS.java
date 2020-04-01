package com.jse.app;

import java.util.Random;
import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		game();
		
	}
	static void game() {
		int num = 0;
		System.out.println("가위 바위 보게임을 시작합니다.");
		System.out.println("1.가위, 2.바위, 3.보 ");
		Scanner scanner = new Scanner(System.in);
		int expect = scanner.nextInt();
		System.out.println("사용자의 값은 "+expect+"입니다.");
		Random ran = new Random();
		num = ran.nextInt(3)+1;
			System.out.println("컴퓨터의 값은 "+num+"입니다.");
		if(expect<num) {
			System.out.println("컴퓨터 승!!");
		}else if(expect==num){
			System.out.println("비겼습니다");
		}else{
			System.out.println("사용자 승!!");
		}
		System.out.println();
		main(null);
	}
}
