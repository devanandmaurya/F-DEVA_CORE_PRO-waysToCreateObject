package five.way.create.obj.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class demo1 {

	public demo1() {
	
	}
public static void main(String[] args) 
		
		throws InstantiationException, 
		IllegalAccessException, 
		ClassNotFoundException,
		NoSuchMethodException, 
		SecurityException, 
		IllegalArgumentException, 
		InvocationTargetException {
	
	bynewkeyword b= new bynewkeyword();
	//b.id;
	System.out.println(b);
	//calling st property here
	b.id=121;
	System.out.println(b.id);
System.out.println("+++++++++++2 way++++++++++++");	

System.out.println("using new instannce method create object of class class ");
//newInstance()>> method present in java.lang package 

bynewkeyword newins= (bynewkeyword)Class.forName("five.way.create.obj.java.bynewkeyword").newInstance();
//print the object into the console here
System.out.println(newins);
//calling id  property here
newins.id=1234;
System.out.println(newins.id);


System.out.println("This is third way +++++++++++++++ creating an object using newinstance() of constructor classs    #############3###########");

//now using the the new instance method of  constructor  class;

//DIFERNCE BETWEEN CLASS.NEWINSTACE() AND CONSTRUCTOR.NEWINSTANCE();
//CLASS CLASS.NEW INSTANCE IS ALWAYS LOOK THE CONSTRUCTR WHICH IS PUBLIC AND DEFAULT  ,,AND CONSTRUCTOR.NEWINSTANCE METHOD INVOKED ANY
//PARAMITIERIZED CONSSTRUCTOR, AND CONSTROCTR ALWAYS WRAP THE THROWN EXP WITH AND 
//INVOCATION TARGET EXPTION 
//CONSTROCTOR.NEWiNSTANCE()>>>CAN ALSO INVOKED PRIVATE CONSTRUCR IN CERTAIN CASSES.
//AND CLASS.NEWINSTANCE() CAN ONLY INVOKED THE NO ARGU CONSTRUCTRO ,,IT REQUIRED THAT THE CONSTRUCTOR SHOULD BE VISIBLE ,,AND THE
//CLASS.CLASS.NEWINSTANE METHOD THROWS ANY EXPECTION THROWN BY THE CONSTRUCTOR AND IT S CHECKED EXP

//LOAD  THE CLASS bynewkeyword 

//creating an object using newInstance() of constructor classs
Constructor<bynewkeyword> cons= bynewkeyword.class.getConstructor();
bynewkeyword sss=cons.newInstance();
//printing the value in console
System.out.println(sss);
//calling id 
sss.id=6765;
System.out.println(sss.id);

}
}
