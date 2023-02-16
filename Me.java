package Lab16Feb.java;
class A{
    public void print_IAm()
    {
        System.out.println("IAm");
    }
}
 
class B extends A {
    public void print_ASoftware() {
    	System.out.println("ASoftware"); }
}
 
class C extends B {
    public void print_Engineer()
    {
        System.out.println("Engineer");
    }}

//Derived class
public class Me {
 public static void main(String[] args)
 {
     C g = new C();
     g.print_IAm();
     g.print_ASoftware();
     g.print_Engineer();
 }
}
