package com.shiyanlou.course;

import java.io.File;
import java.lang.reflect.Constructor;

public class Test {
	
	public static void main(String[] args){
		try{
			Constructor<File> constructor = File.class.getDeclaredConstructor(String.class);
			System.out.println("Create File Object with reflection.");
			
			File file = constructor.newInstance("/home/shiyanlou/Desktop/Myfile.txt");
			System.out.println("Use File Object to create Myfile.txt.");
			
			
			file.createNewFile();
			System.out.println("File is created ?" + file.exists());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
