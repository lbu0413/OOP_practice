



public class Cat {
	
	static int bday_month = 04;
	
	void meow() {
		System.out.println("MEOOOOWWWW");
	}
	
	static void jumps() {
		System.out.println("사뿐");
	}
	
	public static void main(String args[]) {
		Cat leon = new Cat();
		Cat levi = new Cat();
		
		leon.meow();
		levi.meow();
		
		leon.jumps(); // should be accessed in a static way;
		levi.jumps(); // should be accessed in a static way;
		
		Cat.jumps();
		// Cat.meow();
	}
}

