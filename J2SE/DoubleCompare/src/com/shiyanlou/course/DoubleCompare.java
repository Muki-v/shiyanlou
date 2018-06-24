package com.shiyanlou.course;

public class DoubleCompare {
	public static void main(String[] args){
		String s1 = "123.321";
		String s2 = "567.765";
		
		Double num1 = Double.parseDouble(s1);
		Double num2 = Double.parseDouble(s2);
		
		System.out.println("number 1: " + num1);
		System.out.println("number 2: " + num2);
		
		switch(num1.compareTo(num2)){
		case -1:
			System.out.println("number 1 is smaller than number 2");
			break;
		case 0:
			System.out.println("number 1 is equal to number 2");
			break;
		case 1:
			System.out.println("number 1 is bigger than number 2");
			break;
		}
	}

}
