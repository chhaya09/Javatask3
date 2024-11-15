package java5;

public class Casting extends Parent{
	
	public static void main(String[] args) {
		Parent aParent = new Casting();//upcasting
		aParent.flower();//advantage
		//aparent.method();//disadvantage
		
	}	
		
		public void method() {
			System.out.println("this is normal method");
		
	}
		public void flower() {
			System.out.println("apple");
		}
		
		
	 

}
