package com.example.question5;

public class AccessModifiersExample {

	private int id;
	// private modifier is accessible within the class where its defined and used
	// for getters and setters
	private String name;

	protected String description; // Within the package, protected modifier is accessible

	public double salary; // easily we can access the public in outside or inside the class and packages

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println(" public access Modifier !!");
	}

	private void display1() {
		System.out.println("private access Modifier!!");
	}

}
