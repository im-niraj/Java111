package question1;

public interface X {
	void x1();
	
	default void x2() {
		System.out.println("default from X");
	}
	static void x3() {
		System.out.println("static from X");
	}

}
