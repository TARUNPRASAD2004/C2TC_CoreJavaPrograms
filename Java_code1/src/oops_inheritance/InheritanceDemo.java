package oops_inheritance;

class A{
	void display() {
		System.out.println("hello world");
	}
}

class B extends A{}
class C extends A{}

public class InheritanceDemo {

	public static void main(String[]args) {
	
		C obj = new C();
		System.out.println(obj instanceof C);
		
		obj.display();
		// TODO Auto-generated constructor stub
	}

}
