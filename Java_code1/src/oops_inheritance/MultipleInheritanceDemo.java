package oops_inheritance;


interface Walkable{
	
	void walk();
	
}

interface Swimable{
	
	void swim();
}

class a implements Walkable,Swimable{
	
	public void walk() {
		System.out.println("we are walking");
	}
		
	public void swim() {
		
		System.out.println("we are swimming");
	}
	
	}


public class MultipleInheritanceDemo {
	public static void main (String[]args) {
		
		a obj = new a();
		
		obj.walk();
		obj.swim();
		
	}
}
		
	

