//Description: A student wants to pay his tuition through myNEU account.

//Objects (with Behaviors and State): 

//Object: Student
//State: name, address, myNEUID
//Behavior: loginMyNEU(), logoutMyNEU(), waiveInsurance(), placeCheckForTuition(), payTuition()
	
//Object: MyNEU
//State: Collection of courses, Option of insurance
//Behavior: displayAvailableCourses(), displayTuition(), acceptPayment(), mailBill(), mailInsuranceID() 
	
//Object: Course
//State: name, credit, time, tutor, room 
	
//Object: Insurance
//State: price, ID
	
//Object: Tuition
//State: amount

//Object: Payment
//State: amount	

class Student { 
	String name;
	String address;
    String myNEUID;
	void loginMyNEU(){
		System.out.println(name + ",you have already login " + myNEUID);
	}
    void logoutMyNEU(){
    	System.out.println(name + ", you have already logout " + myNEUID);
    }
	void findTheCourse(){
		System.out.println(name + " finds the courses.");
	}
	boolean waiveInsurance;
	void placeCheckForTuition(Student student, Tuition tuition){
			System.out.println(student.name + ", your tuition is " + tuition.amount);		
	}
	
	void payTuition(Tuition tuition){}	
}

class MyNEU{
	Course[] courses; //Array of course
	void displayAvailableCourses(Course[] courses){
		System.out.println("The following are coursers:");
		for(int i=0;i<courses.length;i++){
			System.out.println(courses[i].name + courses[i].room + courses[i].time + courses[i].tutor + courses[i].credit);
		}
	}
    void displayTuition(Student student, Tuition tuition){}
    void acceptTuition(Student student, Tuition tuition){}
    void mailBill(Student student){
    	System.out.println(student.name + ", we have sent your bill to " + student.address);
    } 
    void mailInsuranceID(Student student, Insurance insurance){
    	System.out.println(student.name + ", we have sent your insurance ID to " + student.address);
    }		
}

class Course{
	String name, time, tutor, room;
	Integer credit;		
}

class Insurance{
    String ID;
    Integer price;
}
class Tuition{
	Integer amount;
}

public class PayTuition{
	
	public static void main(String args[]){
		
		MyNEU myNEU= new MyNEU();
		Tuition tuition = new Tuition();
		
		Course Java = new Course();
		Java.name = "Java";
		Java.credit = 4;
		Java.tutor = " Siva Dosapati ";
		Java.time = " Friday 4:30 ¡§C 7:30";
		Java.room = " 225 Terry Ave N";
		Course Database = new Course();
		Database.name = "Database";
		Database.credit = 4;
		Database.tutor = " Gregory Hay ";
		Database.time = " Wednesday 630 ¡§C 9:30";
		Database.room = " 401 Terry Ave N";
		Course[] courses = {Java, Database};
        
        Insurance insurance = new Insurance();
        insurance.price = 2100;
		
        Student sida = new Student();
		sida.name = "Sida";
        sida.address = "Lake City";
        sida.myNEUID = "niu.sid";
		
		sida.loginMyNEU();
        sida.findTheCourse();
		myNEU.displayAvailableCourses(courses);		
		sida.waiveInsurance = false;
		tuition.amount = (Java.credit + Database.credit) *1475 + insurance.price;
        sida.placeCheckForTuition(sida, tuition);
		sida.payTuition(tuition);
		myNEU.acceptTuition(sida, tuition);
        myNEU.mailBill(sida);
        myNEU.mailInsuranceID(sida, insurance);
        sida.logoutMyNEU();

	}

}