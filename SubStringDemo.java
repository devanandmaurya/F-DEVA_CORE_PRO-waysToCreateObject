package com.dkh.substring.in_java;

public class SubStringDemo {
	public static void main(String[] args) {
String st2= "Devanand Maurya";
		String str = "Devanand maurya";
		String str1= str.substring(1);
		//String str1 = str.substring(7);
	String str2 = str.substring(0,7);
	System.out.println(str2);
		//System.out.println(str1); // The out put is //evanand Maurya
//String here str and str1 created two object as debugs you can change.
	System.out.println("see output");
		String strr=str.substring(0, 4);
	    System.out.println(strr);
		System.out.println(strr==str);
		
	
	}
}
