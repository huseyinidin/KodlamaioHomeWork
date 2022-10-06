package arraysDemo;

public class Main {
	
	public static void main(String[] args) {

		String student1 = "Romeo";
		String student2 = "Alfa";
		String student3 = "Tango";
		String student4 = "Juliet";

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);

		System.out.println("------------------");

		String[] students = new String[4];
		students[0] = "Romeo";
		students[1] = "Alfa";
		students[2] = "Tango";
		students[3] = "Juliet";

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

		System.out.println("------------------");

		for (String student : students) {
			System.out.println(student);
		}
	}

}
