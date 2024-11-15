package java5;

public class Supermarket {
	
	public Supermarket() {
	
		System.out.println("non parameterized or default constructor");
	}
	
	public Supermarket(int a) {
		this("welcome");
		System.out.println(" this is an integer:" +a);
	}
	
	public Supermarket(String b) {
		this();
		System.out.println(" this is a string:" +b);
	}
	
	public static void main(String[] args) {
		
		Supermarket aSupermarket = new Supermarket(4567);
	
	}

}
