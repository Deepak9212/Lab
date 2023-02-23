package MethodOverriding.java;
class TestOverriding{
	void run() {
		System.out.println("running mode on");
	}
	
}
//creating child class-sub class
class Overridding extends TestOverriding{
	//defining same name method as its declared in the parent class
	void run() {
		System.out.println("running mode off");
		
	}
public static void main(String[] args) {
	//creating object of child class
	Overridding a=new Overridding();
	a.run();
}
}

