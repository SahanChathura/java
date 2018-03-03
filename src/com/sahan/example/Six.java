package com.sahan.example;

public class Six {
	public static void main(String[] args) {
		int[] numbers = new int[]{4,5,9,11,6,3,2};
		int largest = numbers[0];
		int samllest = numbers[0];
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]>largest){
				largest = numbers[i];
			} else if (samllest>numbers[i]){
				samllest=numbers[i];
			}
		}
		System.out.println("largest elemetn is : "+largest);
		System.out.println("smallest elemetn is : "+samllest);
	}
}
