
public class Student {
	String firstName;
	String lastName;
	int registration;
	int grade;
	int year;

	// Constructores
	
	
	
	public Student(String firstName, String lastName, int registration, int grade, int year) {

		this.firstName = firstName.toUpperCase();
		this.lastName = lastName.toUpperCase();
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}//constructor1

	public Student(String firstName, String lastName) {
		
		this(firstName,lastName,1,1,1);
	}//constructor2

	public Student(String firstName) {
		this(firstName,"Doe",1,1,1);
	}//constructor3


	// Metodos
	public void printFullName() {
		// TODO implement
		System.out.println("Full name: " + firstName + " " + lastName);
	}//printFullName

	public boolean isApproved() {
		// TODO implement: should return true if grade >= 60
		return (grade >= 60);
	}//isAprovd

	public int changeYearIfApproved() {
		// TODO implement: the student should advance to the next year if he/she grade
		// is >= 60
		// Make year = year + 1, and print "Congragulations" if the student has been
		// approved

		if (isApproved()) {
			this.year++;
			System.out.println("Congratulations");
		}

		return year;
	}//changeYearIfApproved
}// class Student
