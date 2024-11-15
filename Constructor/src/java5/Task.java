package java5;

public class Task {
	
	public Task() {
		System.out.println("I'm chhaya");
	}
	
	public Task(int a) {
		this("20");
		System.out.println("my profession is student");
	}
	
	public Task(String b) {
		this();
		System.out.println("my age is " + b);
	}
	
	public static void main(String[] args) {
		Task aTask = new Task(20);
	}
}
