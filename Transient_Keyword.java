package LabApril6;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* used with data members of class in order to avoid serialization */

class Test implements Serializable{
	transient int id;// this will not serialized
	String name;
	public Test(int i,String n) {
		this.id=i;
		this.name=n;
	}
}
public class Transient_Keyword {
	public static void main(String[] args) throws Exception {
		Test obj=new Test(4,"Deepak");
		 
		//Serialization
        FileOutputStream f=new FileOutputStream("D:\\new.txt");
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(obj);
		o.flush();
		o.close();
		f.close();
		System.out.println("done");
		
		//Deserialization
		
		ObjectInputStream oi=new ObjectInputStream(new FileInputStream("D:\\new.txt"));
		Test obj1=(Test)oi.readObject();
		System.out.println(obj1.id+" "+obj.name);
		oi.close();
		
	}

}
