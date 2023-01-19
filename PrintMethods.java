package com.monocept.test;

import java.lang.reflect.*;

public class PrintMethods {

	public static void main(String[] args) throws Exception {
//		String path ="java.lang."+args[0];
		
		Class c = Class.forName(args[0]);
		
		Method[] m = c.getDeclaredMethods();
		
		System.out.println("Methods in "+args[0]+ " class are: ");
		
		for(Method m1 : m)
		{
			System.out.println(m1.getName());
		}
		
		
		Field[] field = c.getDeclaredFields();
		
		System.out.println("Fields in "+args[0]+ " class are: ");
		
		for(Field f : field) {
			System.out.println(f.getName());
		}
		
		Constructor[] constructor = c.getConstructors();
		
		System.out.println("Constructors in "+args[0]+ " class are: ");
		
		for(Constructor con : constructor) {
			System.out.println(con.getName());
		}
	}

}
