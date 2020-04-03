package com.jse.app;

public class Member { 		//<정말중요!!>()가 없잖아! 이건 클래스야!
	private String id;//"id 인스턴스" 아래 id와 동급이라 시블링(형제관계)
	public Member() { 	
		
	}
	public void setId(String id) { // "id로컬변수"  //여기저기 돌아다니면 안되기때문에 void설정
		System.out.println("지역변수 진입 " + id);
		this.id = id; //this 이필드안에있는 
		System.out.println("인스턴스안에 저장" + this.id);
	}
	public String getId() { //return은 위에 private String id;/public String getId() String이 이름이 같아야한다
		return this.id;
	}
}

