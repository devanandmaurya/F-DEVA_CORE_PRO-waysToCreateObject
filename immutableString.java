package why_stringis_immutable.com.dk;

import java.util.HashMap;

/*start
class A
{
int a=10;
int b=20;
A s=A();

s.a= 10 ;
s.b=20;
here the object state will be change if we put a=43 and b=87 ,

//but IF WE NOT BE ABLE TO CHANGE THE STATE OF OBJECT OR STRING OBJET OR OBJECT . LIKE
 * 
 * String st= "devanand";
 * 
 * str >> content can not change 
 * 
 * if we trying to like this 
 * String str ="devanand";
 * str.concate("maurya");
 * then it create new object will create with the modified object .
 * sout(str);  then output is devanand 
 * and if we do like this 
 * String sss=str.concate("maurya");
 * sout(sss); then give output >>> devanand maurya but new object created here
 * 
 * THE FOUR WAY TO REPRESENT STRING 1 STRING 2 STRING BUFFER 3 STRING BUILDER 4 ARRAY
 * STRING IS A SEQUENCE OF CHARACTER THAT PRESENT JAVA.LANG PACKAGE IT IS A CLASS.
 * 
 * IT REPRESENT TWO WAY BY NEW KEYWORD AND BY STRING LITERAL  IN DOUBLE QOTE
 * 
 * STRING S="DEVA";
 * STRING S= NEW STRING("RAM"); 
 * STRING ST[]={"RAM" ,"SHYAM" ,"12"};
 * 
 * WHY STRING IS IMMUTABLE IN JAVA ??? 
 * STRING HASHBASE CATCHING -- 
 * 


STRINF S= "RAM";
JVM FIRST CALCULATE THE HASCODE OF CONTENT  IN INTEGER THAT IS RAM THEN once it done then it return the value of s.
and by hashing catching is improve the performance.becauese the hashcode is calculate only one time .

end
*/
class Demo {
//	 @Override
//	 public int hashCode()
//
//	{
//		System.out.println("the hash code");
//		 return hashCode();
//	}

}

public class immutableString {

	public immutableString() {
		// System.out.println("("string is immutable string s="deva" + is goes in scp
		// and s=new s("raj ) go in heap area")");
	}

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();
		Demo d = new Demo();
		hm.put("deva", 1);
		System.out.println(hm);
		System.out.println(hm.hashCode());
		//hm.get(d);
System.out.println("------------------------------------");
		String s = "ram";
		int p = s.hashCode();
	
		System.out.println("the hashcode of ram obj::"+p + "the value of string obj s::"+s);

	}
}
