package LabFeb23;
class Bank{
    int getRateOfInterest() {
 return 0;
 }
}
 
class SBI extends Bank{
    int getRateOfInterest(){
    	return 8;}
}
 
class ICICI extends Bank{
    int getRateOfInterest(){
    	return 7;}
}
 
class AXIS extends Bank{
    int getRateOfInterest(){
    	return 9;
    	}
}

class ShowResult{
    public static void main(String args[]){
    SBI s = new SBI();
    ICICI i = new ICICI();
    AXIS a = new AXIS();
    System.out.println("Rate of Interest in SBI is "+s.getRateOfInterest()+"%");
    System.out.println("Rate of Interest in ICICI is "+i.getRateOfInterest()+"%");
    System.out.println("Rate of Interest in AXIS is "+a.getRateOfInterest()+"%");
}
}

