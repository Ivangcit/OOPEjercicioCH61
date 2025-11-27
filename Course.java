import java.util.ArrayList;
import java.util.List;

public class Course {
	String courseName;
	String professorName;
	int year;

	List<Student> enrolledStudents = new ArrayList<>();

	// Constructor
	public Course(String courseName, String professorName, int year) {
		this.courseName = courseName;
		this.professorName = professorName;
		this.year = year;
	}

	// Metodos

	public void enroll(Student student) {
		// TODO add the student to the collection
		enrolledStudents.add(student);

	}// enroll

	public void enroll(Student[] students) {
		// TODO add all the students to the collection
		for(int i=0;i<students.length;i++) {
			this.enroll(students[i]);
		}
	}//enroll Overload

	public void unEnroll(Student student) {
		// TODO remove this student from the collection
		// Hint: check if that really is this student
		if (enrolledStudents.contains(student)) {
			enrolledStudents.remove(student);
		} else {
			System.out.println("The student isnt in this course");
		}

	}// unEnroll

	public int countStudents() {
		// TODO implement
		return enrolledStudents.size();
	}

	public int bestGrade() {
		// TODO implement
		int bG = 0;
		String studentBG = "";
		for (int i = 0; i < countStudents(); i++) {
			if (enrolledStudents.get(i).grade > bG) {
				bG = enrolledStudents.get(i).grade;
				studentBG = enrolledStudents.get(i).firstName;
			}
		}
		return bG;
	}

}// class Course
