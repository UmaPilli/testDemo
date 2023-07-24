package Rough;



class Base{
	void sum() {
		System.out.println("Base sum");
	}
}
class child extends Base{
	void sum() {
		System.out.println("Child sum");
	}
}

public class arrFind {
	
	public static void main(String[] args) {
		child obj = new child();
		obj.sum();
		
		

	}

}
