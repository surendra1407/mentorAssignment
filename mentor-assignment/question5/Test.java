package com.example.question5;

public class Test {

	public static void main(String[] args) {
		
		AccessModifiersExample ex = new AccessModifiersExample();
		
		ex.display();  // here, we can invoke a display method from another class using object of that class and also this method is public modifier
		
		System.out.println(ex.salary);	// salary variable is public, so we can access it anywhere.
		
		System.out.println(ex.description);  // description variable is protected, so we can access it within the package
		
		System.out.println(ex.getId()); // Here id and name is private, we can't invoke the variable using instance of the class
										// but invoke that variables using getters and setters.
		
		System.out.println(ex.getName());
	}

}
