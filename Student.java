//without this keyword.

public class Student {

	int id;
	String name;

	Student(int id, String name) {
		id = id; // instance variable.
		name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Student s1 = new Student(11, "RAM");
		Student s2 = new Student(11, "SHYAM");
		Student s3 = new Student(11, "Krishna");

		s1.display();
		s2.display();
		s3.display();
	}

}

Output:-
...................
0 null
0 null
0 null
