package com.example.demo;

class Name{
	String newname = "Pankaj";
}

class Test {
	int age;
	Name name;
	
	public void display() {
		System.out.println("name "+this.name);
	}
	
}

class Main{
	public static void main(String[] args) {
		Test t = new Test();
		t.display();
	}
}