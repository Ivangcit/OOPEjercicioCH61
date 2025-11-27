
   public class Student {
       String firstName;
       String lastName;
       int registration;
       int grade;
       int year;
       
       
       //Constructores
       public Student(String firstName,String lastName,int registration,int grade,int year) {
		// TODO Auto-generated constructor stub
    	   this.firstName=firstName;
           this.lastName=lastName;
           this.registration=registration;
           this.grade=grade;
           this.year=year;
	}
       
       
       
       
       
       
       //Metodos
       public void printFullName(){
    	      //TODO implement
    	  System.out.println("Full name: "+firstName+" "+lastName);
    	   }

    	   public boolean isApproved(){
    	       //TODO implement: should return true if grade >= 60
    		   return (grade>=60);
    	   }

    	   public int changeYearIfApproved(){
    	       //TODO implement: the student should advance to the next year if he/she grade is >= 60
    	       // Make year = year + 1, and print "Congragulations" if the student has been approved
    		   
    		   if(isApproved()) {
    			   this.year++;
    			   System.out.println("Congragulations");
    		   }
    		   
    	       return year;
    	   }
   }//class Student
   