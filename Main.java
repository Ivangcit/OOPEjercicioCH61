
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ivan = new Student("Ivan","Gutierrez",1,80,5);
		Student oscar = new Student("Oscar","Fernandez",2,90,6);
		Student pedro = new Student("Pedro","Lopez",3,60,7);
		Student isaac = new Student("Isaac","Aguirre",4,10,8);
		
		ivan.printFullName();
		System.out.println(isaac.isApproved());
		System.out.println(oscar.grade);
		System.out.println(oscar.isApproved());
		oscar.changeYearIfApproved();
		
		Course math=new Course("Martha Torres","Math",6);
		Course sports=new Course("Julian Casablancas","Sports",6);
		Course english=new Course("Mambu Fernandez","English",6);
		Course history=new Course("Flor Guerras","History",6);
		
		math.enroll(isaac);
		System.out.println(math.countStudents());
		math.enroll(ivan);
		System.out.println(math.countStudents());
		sports.enroll(isaac);
		System.out.println(sports.countStudents());
		math.unEnroll(isaac);
		System.out.println(math.countStudents());
		math.enroll(pedro);
		math.enroll(oscar);
		System.out.println(math.bestGrade());
		
		Student[] students= {oscar,isaac,pedro};
		
		
		System.out.println(english.countStudents());
		english.enroll(students);
		System.out.println(english.countStudents());
		System.out.println(english.averageGrade());
		
		System.out.println(math.aboveAverage(isaac));
		System.out.println(math.aboveAverage(oscar));
		
		//english.ranking();
		
		
		
		
		
		
	}//main

}//class Main
