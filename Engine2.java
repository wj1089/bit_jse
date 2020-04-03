package com.jse.app;
import java.util.Random;
import java.util.Scanner;
import com.jse.app.Member;
import com.jse.app.RPSgame7;
public class Engine2 {
	public static String test;
	public static void main(String[] args) {//파라미터 
		
		Scanner scanner = new Scanner(System.in);
		Member member = new Member();
		Calculate cal = new Calculate();
		Dice01 dicenum = new Dice01();
		Random ran = new Random();
		RPSgame7 rpsgame = new RPSgame7();
		while(true) { //while(true)에서 멈추지 않는다면 무한루프로 계속돈다.	
			System.out.println(
					  " 1. 회원가입  "
					+ " 2. 로그인 "
					+ " 3. 계산기 "
					+ " 4. 1부터 100까지의 합  "
					+ " 5. 가위바위보게임  "
					+ " 6. 홀짝게임 "
					+ " 0. 종료");
			int flag = scanner.nextInt();//프리미트드 타입 변수
			switch(flag) {
				case 0: System.out.println("종료"); return; // return은 그냥 Statement를 빠져나간다.
				case 1: System.out.println("회원가입");
					System.out.println("아이디 입력");
					String userid = scanner.next();
					member.setId(userid); // 내용은 상관없이 타입이 같으면 된다.
					break;
				
				case 2: 
					System.out.println("로그인");
					System.out.println("아이디 입력");
					String id2 = scanner.next();
					String returnId = member.getId();
					System.out.println("로그인용 아이디 : "+ returnId);
					if(id2.equals(returnId)) {
						System.out.println("로그인 성공");
					}else {
						System.out.println("로그인 실패");
					}
					break;
					
				case 3: 
					System.out.println("계산기를 실행합니다");
					int a,b,c;
					System.out.println("첫번째 수 입력");
					a= scanner.nextInt();
					cal.setNum1(a);
					System.out.println("두번째 수 입력");
					b= scanner.nextInt();
					cal.setNum2(b);
					System.out.println("세번째 수 입력");
					c= scanner.nextInt();
					cal.setNum3(c);
					int sum = cal.calculate();
					System.out.println("모든수의 합은?: "+sum);
					break;
					
					
					
					
				case 5:	
					System.out.println("가위바위보 게임");
					System.out.println("(1)가위   (2)바위   (3)보  ");
					int user = scanner.nextInt();
					System.out.println("플레이어의 선택"+ user);
					rpsgame.setUserVal(user);
					
					int com = ran.nextInt(3)+1;
					System.out.println("컴퓨터의 선택"+ com);
					rpsgame.setcomVal(com);
					String gameResult = rpsgame.game();
					System.out.println(gameResult);
					break;
					
		
		
		
		
				case 6 :
					System.out.println("주사위게임을 시작합니다");
					System.out.println("기대하는 값 홀/짝을 입력합니다");
					String expect =  scanner.next();
					System.out.println(String.format("사용자 홀짝 예상 : %s%n", expect));
					int diceNum = ran.nextInt(6)+1;
					System.out.printf(String.format("컴퓨터가 생성한 값 : %s%n", diceNum));
					String result1 = "";
					if(diceNum == 1) {
						result1 = "홀";
					}else if(diceNum == 2 ) {
						result1 = "짝";
					}else if(diceNum == 3 ) {
						result1 = "홀";
					}else if(diceNum == 4 ) {
						result1 = "짝";
					}else if(diceNum == 5 ) {
						result1 = "홀";
					}else {
						result1 = "짝";
					}
					System.out.println("컴퓨터 홀짝 결과 : " + result1);;
					if(expect.equals(result1)) {
						System.out.println("매칭 결과 : 맞음 ");
					}else {
						System.out.println("매칭 결과 : 틀림 ");
					}
					
						
			}
		}
	}
}