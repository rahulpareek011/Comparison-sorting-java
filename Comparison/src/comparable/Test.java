package comparable;
import java.util.*;

class Student implements Comparable<Student>{
	String name;
	int age;
	String city;
	
	Student(String name,int age, String city){
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	//method implemented from Comparable interface
	public int compareTo(Student o) {
		return this.age - o.age; //numeric comparison
	}
	
	public String toString() {
        return name + " " + age + " " + city;
    }
	
}

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student("Arun",21,"Jaipur");
		Student s2 = new Student("lakshya",24,"Udaipur");
		Student s3 = new Student("Nabeel",26,"Mumbai");
		Student s4 = new Student("Prem",25,"Bikaner");
		Student s5 = new Student("Ridam",27,"Indore");
		Student s6 = new Student("Vikram",29,"Bhopal");
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		
		System.out.println("before sorting");
		System.out.println(students);
		
		System.out.println();
		
		System.out.println("After sorting");
		Collections.sort(students); //calls compareTo
		System.out.println(students);
	}
}