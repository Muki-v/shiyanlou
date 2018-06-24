package com.shiyanlou.course;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookByMap {
	public static void main(String[] args){
		HashMap<String, String> phonebook = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		
		String keyword = new String();
		
		phonebook = initPhoneBook(phonebook);
		
		System.out.println("Please input a name that you want to search:");
		
		keyword = scan.nextLine();
		while(keyword.isEmpty()){
			System.out.println("Please input a name!");
			keyword = scan.nextLine();
		}
		
		System.out.println("The result is :");
		System.out.println(queryPhone(phonebook, keyword));
		scan.close();
		 
	}
	
	private static HashMap<String, String> initPhoneBook(HashMap<String, String> phonebook){
		
		phonebook.put("Steve", "13012345678");
		phonebook.put("Bob", "028-80001234");
		phonebook.put("Peter", "182222233333");
		
		return phonebook;
	}
	
	private static String queryPhone(HashMap<String, String> phonebook, String keyword){
		String result = new String();
		result = phonebook.get(keyword);
		
		if(result==null)
			return "Can not find this user.";
		
		return result;
	}

}
