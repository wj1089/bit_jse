package com.jse.app;

public class RPSgame {

	public String RPSgame() {
		private int userVal;
		private int comVal;
		
		
		
		
		
		
		
		
		
		
		System.out.println("가위바위보 게임");
		System.out.println("(1)가위   (2)바위   (3)보  ");

		int use = scanner.nextInt();
		System.out.println("플레이어의 선택"+ use);
		Random ran =new Random();
		int com = ran.nextInt(3)+1;
//		int com = scanner.nextInt();
		System.out.println("컴퓨터의 선택"+ com);
		String end = "";
		if(use==com) {
			end = "무승부";
		}else if(use == 1) {
			if(com == 2) {
			end = "패배";
			}else {
			end = "승리";
			}
		}else if(use == 2) {
			if(com == 1) {
			end = "승리";
			}else {
			end = "패배";
			}
		}else if(use == 3) {
			if(com == 1) {
			end = "패배";
			}else {
			end = "승리";
		}
	}
	System.out.println(end);	

	}
}
	
