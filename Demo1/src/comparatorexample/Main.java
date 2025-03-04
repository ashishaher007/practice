package comparatorexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		students.add(new Student("Alice", "Brown", 22));
		students.add(new Student("Charlie", "Smith", 20));
		students.add(new Student("Bob", "Davis", 21));

		students.sort((s1, s2) -> s1.getFirstname().compareTo(s2.getFirstname()));
		students.forEach(System.out::println);

		System.out.println("111-------------------------------------------------------------------");
		students.sort(Comparator.comparing(s -> s.firstname));
		students.forEach(System.out::println);
		System.out.println("-222------------------------------------------------------------------");

		students.sort(Comparator.comparing(Student::getFirstname));
		students.forEach(System.out::println);
		System.out.println("-333------------------------------------------------------------------");

		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {

				return s1.firstname.compareTo(s2.firstname);
			}
			
		});
		students.forEach(System.out::println);
		System.out.println("-444------------------------------------------------------------------");
		
		
		
		students.sort(Comparator.comparing(s -> s.firstname, Comparator.reverseOrder()));
		students.forEach(System.out::println);
		System.out.println("-555------------------------------------------------------------------");
		students.sort((s1, s2) -> s2.firstname.compareTo(s1.firstname));
		students.forEach(System.out::println);
		
	}

}
