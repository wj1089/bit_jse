package com.jse.app;
import java.util.Random;
import java.util.Scanner;
public class Engine {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true) { //while(true)에서 멈추지 않는다면 무한루프로 계속돈다.	
			System.out.println("0.종료  1.가위바위보 2.주사위게임을 시작합니다");
			int flag = scanner.nextInt();
			switch(flag) {
				case 0: System.out.println("종료"); return; // return은 그냥 Statement를 빠져나간다.
				case 1: game();break;//break를 하면 스위치를 빠져나가고 다시 
				case 2: switchDice(); break;//위 System.out.println("0.종료  1.계산기 2.달력");
			}
		}
	}
		static void game() {
			
			System.out.println("가위 바위 보게임을 시작합니다.");
			System.out.println("1.가위, 2.바위, 3.보 ");
			Scanner scanner = new Scanner(System.in);
			int expect = scanner.nextInt();
			System.out.println("사용자의 값은 "+expect+"입니다.");
			Random ran = new Random();
			int num = ran.nextInt(3)+1;
				System.out.println("컴퓨터의 값은 "+num+"입니다.");
			if(expect<num) {
				System.out.println("컴퓨터 승!!");
			}else if(expect==num){
				System.out.println("비겼습니다");
			}else{
				System.out.println("사용자 승!!");
			}
		}


		static void switchDice() {
			System.out.println("주사위게임을 시작합니다");
			System.out.println("기대하는 값 홀/짝을 입력합니다");
			Scanner scanner = new Scanner(System.in);
			String expect =  scanner.next();
			System.out.println("사용자 홀짝 예상 : "+ expect);
			Random ran = new Random();
			int dice = ran.nextInt(6)+1;
			System.out.println("컴퓨터가 생성한 값 : "+dice);
			String result = "";
			switch(dice) {
			case 1: case 3: case 5: 
				System.out.println("홀");
				break;
			case 2:	case 4:case 6:
				System.out.println("짝");
				break;
		}
			main(null);
	}
}
