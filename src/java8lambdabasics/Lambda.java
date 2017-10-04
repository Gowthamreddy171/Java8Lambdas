package java8lambdabasics;

public class Lambda {

	public static void main(String[] args) {
		Printline print = () -> System.out.println("print lambda"); 
	print.printScreen();
	Stringlength findLength = s -> s.length();
	System.out.println(findLength.getLength("Gowtham Reddy"));

	}
	
	interface Stringlength{
		int getLength(String s);
	}

}
