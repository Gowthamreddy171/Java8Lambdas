package java8lambdabasics.example2;

import java.util.Arrays;
import java.util.List;

import java8lambdabasics.example1.Person;

public class StreamsExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Thomas", "Carlyle", 51),
				new Person("Charles", "Dickens", 60), 
				new Person("Cewis", "Carroll", 42),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));
		
		people.stream()
			  .filter(p ->p.getLastName().startsWith("C"))
			  .forEach(System.out::println);
		
		people.stream()
			  .filter(p -> p.getLastName().startsWith("C"))
			  .filter(p -> p.getFirstName().startsWith("C"))
			  .forEach(System.out::println);

	}

}
