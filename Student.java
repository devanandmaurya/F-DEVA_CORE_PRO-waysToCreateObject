package five.way.create.obj.java;
public class Student implements Cloneable {
	public int id;
    Student() {
	System.out.println("student class default  constructor called ::IT create by "
			+ " clone() and implement Cloneable interface");
     }
	@Override
	protected Object clone() throws CloneNotSupportedException {
	return super.clone();
	}
}
