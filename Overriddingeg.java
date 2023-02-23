package MethodOverriding.java;

class Exam{
	int marks() {
		return 0;
	}
}
class comp extends Exam{//child class first component
	int marks() {
		return 80;
	}
}
class math extends Exam{//child class first component
	int marks() {
		return 70;
	}
}
class science extends Exam{//child class first component
	int marks() {
		return 60;
	}
}
class eng extends Exam{//child class first component
	int marks() {
		return 90;
	}
}
public class Overriddingeg {//main class
	public static void main(String[] args) {
		//same name method calling by different child object
		/*comp c=new comp();
		math m=new math();
		science s=new science();
		eng e=new eng();
		System.out.println("computer marks is:"+c.marks());
		System.out.println("math marks is:"+c.marks());
		s.marks();
		s.marks();*/
		Exam exam;//parent class reference point
			exam=new science();
			
			System.out.println(exam.marks());
			exam =new eng();
			System.out.println(exam.marks());
		}
	}


