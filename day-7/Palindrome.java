package com.techzenure.sevices;

public class Palindrome {
	boolean checkPalindrome(String str){
		/*
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String strRev = sb.toString();
		return str.equalsIgnoreCase(strRev);
		*/
		
		String revStr="";
		for(int i=str.length()-1; i>=0; i--) {
			revStr += str.charAt(i);
		}
		return str.equalsIgnoreCase(revStr);
	}
}
