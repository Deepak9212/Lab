package LabFeb23;
class salary{
	int incrementsalary() {
 return 25000;
 }
}
 
class Employee extends salary{
    int incrementsalary(){
    	return 20000;}
}
 
class Developer extends salary{
    int incrementsalary(){
    	return 23000;}
}
 
class Manager extends salary{
    int incrementalsalary(){
    	return 0;
    	}
}
 
class ShowResultex{
    public static void main(String args[]){
    	Employee e = new Employee();
    	Developer d = new  Developer();
    	Manager m = new Manager();
    System.out.println("Incrementsalary of Employee is "+e.incrementsalary()+" Thousand");
    System.out.println("Incrementsalary of Developer is "+d.incrementsalary()+" Thousand");
    System.out.println("Incrementsalary of manager is "+m.incrementsalary()+" Thousand");
}
}

