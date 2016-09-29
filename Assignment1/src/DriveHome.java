//Description : A student is driving home from school.

//Objects (with Behaviors and State): 

//Object : Student
//State : name, homeAddress, schoolAddress
//Behavior : startCar(),parkCar()

//Object: Car
//State:  make, model 
//Behavior: run()

//Object: GoogleMap
//State: departure,destination,navigation
//Behavior: navigation()

class Student{
	String name, homeAddress, schoolAddress;
    void startCar(){
		System.out.println(name + " starts his car!" );
	}
    void parkCar(){
    	System.out.println(name + " arrives home and parks his car!");
    }
    void check(){}
}

class Car{
	String make,modle;
	void introduce(){
		System.out.println("The car is " + make + " " + modle);
	}
	void run(){		
		System.out.println("Keep running");
	}
	void currentLocation(){}
}

class GoogleMap{
	String departure,destination;
	boolean nav;
	void navigation(){
		if(nav){
			System.out.println("Navigating from the " + departure + " to the " + destination);
		}
		if (!nav){
			System.out.println("Arrive at " + destination + " and navigation end");
		}
	}	
}

public class DriveHome{
  
	public static void main(String args[]){
    Car car = new Car();
    car.make = "BMW";
    car.modle = "X3";
    
    Student sida = new Student();
    sida.name = "sida";
    sida.homeAddress = "Lake City";
    sida.schoolAddress = "225 Terry Ave N";
    sida.startCar();
    car.introduce();
    
    GoogleMap gm = new GoogleMap();
    gm.departure = sida.schoolAddress;
    gm.destination = sida.homeAddress;
    
    int i=9;//Lake city is about 9 miles away from 225 Terry Ave N
    do{
    	gm.nav = true;
    	gm.navigation();
        car.run();
        i--;
    }while(i>0);
    gm.nav = false;
    gm.navigation();
    sida.parkCar();             
  }
}