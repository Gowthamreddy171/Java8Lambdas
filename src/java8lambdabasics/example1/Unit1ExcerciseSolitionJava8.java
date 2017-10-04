package java8lambdabasics.example1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExcerciseSolitionJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		// Q1: Sort list by last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		System.out.println("All People using lambdas");
		// Q2: Create a method that prints all elements in the list
		printConditionally(people, P -> true, p -> System.out.println(p));
		// Q3: Create a method that prints all that have last name beginning
		// with C
		System.out.println("\nAll People Starting with C using lambdas");
		printConditionally(people, P -> P.getLastName().startsWith("C"), p -> System.out.println(p));

		System.out.println("\nAll People First name Starting with C using lambdas");
		printConditionally(people, P -> P.getFirstName().startsWith("C"), p -> System.out.println(p.getFirstName()));
	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p))
				consumer.accept(p);
		}

	}

}
