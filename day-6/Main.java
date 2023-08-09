package com.techzenure;

import java.util.Arrays;

import com.techzenure.utils.Largest;

public class Main {

	public static void main(String[] args) {
		Largest larObj = new Largest();
		
		//int[] data = {74,56,51,48,90,12,5};
		//int[] data = {-74,-56,-51,-48,-90,-12,-5};
		int[] data = {};
		int lar = larObj.findLargest(data);
		System.out.println("largest of " + Arrays.toString(data) + " = " + lar);
	}

}
