package java5;

public class Variable {
	
	public static void main(String[] args) {
		
		Variable c = new Variable();
		
		  String name = "anu";
		  System.out.println("local variable:" +name);
		  System.out.println("class variable:" +c.a);
		  
		  System.out.println("static variable:" + b);
		  System.out.println(Variable.b);//calling class name for static
				  
	}
	int a = 15;
	static int b = 55;
	public void rollno() {
	
		
		System.out.println();
	}

}
