package comparator;

import java.util.*;

class Student {
	String name;
	int age;
	String city;
	
	Student(String name, int age, String city){
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public String toString() {
		return name+ " " + age + " " + city;
	}
	
}

public class Test{
	public static void main(String[] args) {
		
		Student s1 = new Student("Arun", 28, "Jaipur");
		Student s2 = new Student("Varun", 23, "Bhopal");
		Student s3 = new Student("Aman", 27, "Raipur");
		Student s4 = new Student("Jaggu", 24, "Pune");
		Student s5 = new Student("Vijay", 21, "Indore");
		Student s6 = new Student("Rohit", 25, "Banglore");
		
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		
		System.out.println("Before Sorting");
		System.out.println(students);
		
		System.out.println();
		
		Comparator<Student> ageSort = new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				return s1.age - s2.age;
			}
		};
		
		Collections.sort(students,ageSort);
		
		System.out.println("After Age Sorting");
		System.out.println(students);

		
		Comparator<Student> nameSort = new Comparator<>() {
			public int compare(Student s1, Student s2) {
				return s1.name.compareTo(s2.name);
			}
		};
		
		Collections.sort(students,nameSort);
		
		System.out.println();
		
		System.out.println("After Name Sorting");
		System.out.println(students);
		
	}
}