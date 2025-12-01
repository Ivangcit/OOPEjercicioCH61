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
		//enrolledStudents.add(student);
		
		//Se tiene que validar que no sea nullo y que el estudiante no exista en la lista
		if((student!=null)&&(enrolledStudents.contains(student)==false)) {
			enrolledStudents.add(student);
		}//if null
		
		
		

	}// enroll

	public void enroll(Student[] students) {
		// TODO add all the students to the collection
		for (int i = 0; i < students.length; i++) {
			this.enroll(students[i]);
		}
	}// enroll Overload

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
	}// countStudents

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
	}// bestGrade

	public int averageGrade() {
		int aG = 0;

		for (int i = 0; i < countStudents(); i++) {
			aG = aG + enrolledStudents.get(i).grade;
		}
		return (aG / countStudents());
	}// averageGrade

	public boolean aboveAverage(Student student) {
		int average = this.averageGrade();
		int studentGrade = student.grade;

		return (studentGrade > average);
	}// aboveAverage

	public void ranking() {

		ArrayList<String> stuOrd = new ArrayList();
		List<Student> stuUnord = enrolledStudents;

		int bG = 0;
		int indice = 0;
		String studentBG = "";

		for (int j = 0; j < stuUnord.size(); j++) {

			for (int i = 0; i < stuUnord.size(); i++) {
				if (stuUnord.get(i).grade > bG) {
					bG = enrolledStudents.get(i).grade;
					studentBG = enrolledStudents.get(i).firstName;
					indice = i;
				}
			} // for

			if (stuOrd.contains(studentBG)) {

			} else {
				stuOrd.add(studentBG);
				stuUnord.remove(indice);

			}

		} // for

		for (int i = 0; i < countStudents(); i++) {
			System.out.println(stuOrd.get(i));
		} // for

	}

}// class Course
