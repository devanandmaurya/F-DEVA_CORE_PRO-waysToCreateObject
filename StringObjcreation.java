package com.dkh.StringobjectCreation;

public class StringObjcreation {
	public static void main(String[] args) {
		String s1 = new String("Devanand Maurya");
		String s2 = new String("Devanand Maurya");
//by new keyword two object create in heap area s1 and s2 pointing different object ref
		if (s1 == s2) {
			System.out.println(s1.hashCode());
			System.out.println("both of object S1 And S2 pointing same object");
		} else {
			System.out.println(s2.hashCode());

			System.out.println("both object S1 and S2 Pointing difference ref");

			System.out.println("********************************************");
		}
		String s3 = ("Devanand Maurya");
		String s4 = ("Devanand Maurya");
//by  string literal one object create in  string constant pool AND PONINTING SAME REFE
		// s2 and s4 pointing SAME object refERANCE.
		if (s3 == s4) {
			System.out.println(s3.hashCode());
			System.out.println("both of object S3 And S4 pointing same object in SCP");
		} else {
			System.out.println(s4.hashCode());

			System.out.println("both object S3 and S4 Pointing difference ref IN HEAP");
			System.out.println("**************************************************8");
		}

		// STRING CONCTANTION >>NUMBER+STRING= STRING. 10+"JAVA"==10JAVA
		// STRING +NUMBER= STRING >> "JAVA" +10 ==JAVA10
		// BY STRING API HAVE ONE METHOD CONCAT();
		// String s1="devanand";
		// String s2=s1.concat("maurya");
		// s2= "devanand maurya"; output

		String s5 = "Ram";
		String s6 = "Jeet";
		// String s7=s5+s6;
		String s7 = s5 + " " + s6;
		System.out.println(s7);
		System.out.println("bellow by concanat method");
		String s8 = s5.concat(s6); // without space of two word
		// String s8 =s5.concat(" "+s6); //for space
		System.out.println(s8);
	}

}
