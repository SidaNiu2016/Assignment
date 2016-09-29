//Description : A tourist is trying to find the cheapest flight to LA.

//Objects (with Behaviors and State): 

//Object : Tourist
//State : name, ID, email
//Behavior : openSearchEngine(),searchFlight(), selectCheapestFlight(), reserveTheFlight(), payForFlight()

//Object : Flight
//State: airline, departure, arrive, departDate, arriveDate, price,

//Object: SearchEngine
//State: name, collection of flight
//Behavior: displayFlightDetail(), sendOrderInformation(), acceptPayment()

//Object : Payment
//State : amount

class Tourist{
	String name, ID, email;
	void openSearchEngine(SearchEngine se){}
	void searchFlight(Flight flight){}
	void selectCheapestFlight(Flight[] flights){
		Flight min = flights[0];
		for(int i = 0; i<flights.length;i++){
			if(flights[i].price<min.price) min=flights[i];
			}
			System.out.println("The cheapest flight is " + min.airline );
	}
	void reserveTheFlight(Flight flight){} 
	void payForFlight(Flight flight){}
}

class Flight{
	String airline, departure, arrive, departDate, arriveDate;
	Integer price;
}

class SearchEngine{
	String name;
	Flight flights[];//Array of flight
	void displayFlightDetail(Flight[] flights){}
	void acceptPayment(float p){}
    void sendOrderInformation(Tourist t){
    	System.out.println("We have resrved the flight for you and send order information to " + t.email);
    }
}

class Payment{
	float amount;
}


public class TravelToLA {

	public static void main(String[] args) {
		Tourist sida = new Tourist();
		sida.name = "sida";
		sida.ID = "WA**98125";
		sida.email = "niu.sid@husky.neu.edu";
		
		SearchEngine Google = new SearchEngine();
		Google.name = "Google";
		
		Flight Delta = new Flight();
		Delta.airline = "Delta"; 
		Delta.arrive = "LA"; 
		Delta.arriveDate = "09/14/2016 10am"; 
		Delta.departure = "Seattle";
		Delta.departDate = "09/14/2016 10pm";
		Delta.price = 1000;
		
		Flight Alaska = new Flight();
		Alaska.airline = "Alaska"; 
		Alaska.arrive = "LApackage com.demo;"; 
		Alaska.arriveDate = "09/14/2016 12am"; 
		Alaska.departure = "Seattle";
		Alaska.departDate = "09/14/2016 8pm";
		Alaska.price = 1500;
		
		Flight Hainan = new Flight();
		Hainan.airline = "Alaska"; 
		Hainan.arrive = "LA"; 
		Hainan.arriveDate = "09/14/2016 11am"; 
		Hainan.departure = "Seattle";
		Hainan.departDate = "09/14/2016 8pm";
		Hainan.price = 900;
		
		Flight[] flights = {Delta,Alaska,Hainan}; 
		
		sida.openSearchEngine(Google);
        
		sida.searchFlight(Delta);
        Google.displayFlightDetail(flights);
        sida.selectCheapestFlight(flights);
        sida.reserveTheFlight(Hainan);
        sida.payForFlight(Hainan);
        float p = Hainan.price;
		Google.acceptPayment(p);
        Google.sendOrderInformation(sida);
	}

}