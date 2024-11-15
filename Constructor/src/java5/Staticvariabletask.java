package java5;

public class Staticvariabletask {
	
	public static void main(String[] args) { // main method
		
		Staticvariabletask a = new Staticvariabletask(); // instance to call non-static method
		
		System.out.println(a.rollno());//instance methods (like rollno()) require an object to be called.
		System.out.println(name()); 
	}
	
	public final int rollno() { 
		//When a method is declared as final, it means that this method cannot be overridden by any subclass
		//When a variable is declared as final, it can be assigned only once. 
		
		
		int id = 34;
		System.out.println(id);
		return 45;
	}
	
	public static String name() {
		return "welcome to trendnologies"; 
	}
	
	final int b = 34;
	final int a = 45;

}
