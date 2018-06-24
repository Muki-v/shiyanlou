package com.shiyanlou.course;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListTraversal {
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++){
			list.add(i);
		}
		System.out.println("Item in the list:");
		System.out.println(list);
		
		System.out.println("Items in the list with odd index:");
		
		for(int i=1; i<list.size(); i += 2){
			System.out.println(list.get(i) + " ");
		}
	}

}
