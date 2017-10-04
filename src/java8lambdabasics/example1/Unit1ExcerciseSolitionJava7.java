package java8lambdabasics.example1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcerciseSolitionJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		System.out.println("All People");

		// Q1: Sort list by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		// Q2: Create a method that prints all elements in the list
		printAll(people);
		// Q3: Create a method that prints all that have last name beginning
		// with C
		System.out.println("All People Starting with C");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person P) {
				return P.getLastName().startsWith("C");
			}
		});
		
		System.out.println("All People First name Starting with C");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person P) {
				return P.getFirstName().startsWith("C");
			}
		});
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p))
				System.out.println(p);
		}

	}

	private static void printAll(List<Person> people) {
		for (Person p : people)
			System.out.println(p);
	}

}


