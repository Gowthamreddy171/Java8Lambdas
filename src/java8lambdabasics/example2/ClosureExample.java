package java8lambdabasics.example2;

public class ClosureExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		doProcess(a, i -> System.out.println(a + b));
		// in this method b is not initialized in doProcess but it is still
		// being used. This process of using variables from another method will
		// freeze the value of b and it is called Closure.
	}
	private static void doProcess(int a, Process p) {
		p.process(a);

	}

}

interface Process {
	void process(int i);
}
