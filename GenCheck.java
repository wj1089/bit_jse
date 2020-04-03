package com.jse.app;
public class GenCheck {

		private int ssnNum;
		private char chNum;
		
		public void setSsnNum(int ssnNum) {
			this.ssnNum = ssnNum;
		}
		public int getSsnNum() {
			return ssnNum;
		}
		public void setChNum(int ssnNum) {
			this.chNum = chNum;
		}
		public int getChNum() {
			return chNum;
		}
	public String Gender() {
	
	String result ="";
	switch(ssnNum) { 
		case '1': 
		case '3':
			result = "Man";
		case '2':
		case '4':
			result = "Woman";
		case '5':	
		case '6':	
			result = "Foreinger";
		default :
			System.out.println("Wrong");
	}
	return result;
	}
		
		
//		switch(ch) {
//			case '1': case '3': 
//				System.out.println("Man");
//				break;
//			case '2': case '4': 
//				System.out.println("Woman");
//				break;
//			case '5': case '6':
//				System.out.println("Foreigner");
//				break;
//				default:
//				System.out.println("Wrong");
		}


