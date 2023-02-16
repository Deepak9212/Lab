package Lab16Feb.java;
 class Teacher {


	String designation = "Teacher";
    String collegeName = "DCTM";
    void does(){
	System.out.println("Teaching");
	}
    }
    public class ITTeacher extends Teacher{
	String mainSubject = "Math";

    public static void main(String args[]){
	ITTeacher obj = new ITTeacher();
	System.out.println(obj.collegeName);
	System.out.println(obj.designation);
    System.out.println(obj.mainSubject);
   obj.does();
}}