package com.techzenure.utils;

public class StringCreations {

	public static void main(String[] args) {
		String s1 = "Techzenure";
		String s2 = "Techzenure";
		System.out.println(s1 == s2); //true
		
		String s3 = new String("Techzenure");
		String s4 = new String("Techzenure");
		System.out.println(s3 == s4); //false
	}

}
