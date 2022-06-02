package question1;

public interface Y {
	void y1();
	
	default void y2() {
		System.out.println("default from Y");
	}
	static void y3() {
		System.out.println("static from Y");
	}
}
