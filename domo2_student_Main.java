package five.way.create.obj.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class domo2_student_Main {

	domo2_student_Main() {
		System.out.println("domo2_student_Main costructore");
	}

	public static void main(String[] args) throws CloneNotSupportedException, 
	IOException, ClassNotFoundException {

		Student st = new Student();

		st.id = 12;

		System.out.println(st.id);

		System.out.println("the obje add" + st);

		System.out.println("using object cloning to create the object....");

		// FOR CLONE WE NEDD TO IMPLEMENT THE CLONABLE INTERFACE AND OUR CLASS SHOULD
		// OVERRID THE PROTECTED CLONE METHOD() INSIDE IT.
		// creating a object by using the object class clone(),
		// by clone method constructor does not call
		// object will difference in clone method also
		Student std = (Student) st.clone();
		std.id = 600;
		System.out.println(std.id);
		// print the object ref in the console
		// calling the st class property using id.

		// OBJECT CREATEION BY USING DESILIRIZTION USING THIS constructor does not call
		// object creation handle by the read object method as like Student s6=
		// (Student)ois.readObject();
		// BY THIS METHOD ALSO CONSTRUCTOR ALSO NOT CALL
		//

		System.out.println("*****************by serilization*****************");

		// Serialize here
		FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\Mindgate\\\\Desktop\\\\asd.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Student s1 = new Student();

		oos.writeObject(s1);
		// Now Desierilaization here

		FileInputStream fis = new FileInputStream("C:\\Users\\Mindgate\\Desktop\\asd.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		// creating and getting the student class object
		Student s6 = (Student) ois.readObject();
		// printing to the console
		System.out.println(s6);
		//calling st id property
		s6.id=900;
		System.out.println(s6.id);

	}

}
