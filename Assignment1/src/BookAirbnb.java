//Description : A tourist wants to book a house on Airbnb app.

//Objects (with Behaviors and State): 

//Object : Tourist
//State : name, email
//Behavior : visitApp(), findHouses(), placeOrderForHouse(), payMoneyToApp()

//Object: App
//State:  collection of houses, name
//Behavior: displayAvailableHouses(),acceptPayment(), sendOrderInformation()

//Object: House
//State: type, price, address, availableDate,owner
//Behavior: getInformation()

//Object: Order
//State: ID, date, price

//Object: Money
//State: amount

class Tourist{
	String name, email;
    void visitApp(App app){
    	System.out.println("you are now searching on app!");
    }
    void findHouses(House[] house){}
    void placeOrderForHouse(House house){}
    void payMoneyToApp(float money){}
}

class App{
	String name;
	House[] houses; //Array of house
	House[] displayAvailableHouse(){
		return houses;}
	void acceptPayment(Tourist t, float money){
		System.out.println("Payment accept!");
	}
	void sendOrderInformation(Tourist t){
		System.out.println("Odrder information has send to your email!");
	}
}

class House{
	String name,type, price, address, availableDate,owner;
	void getInformation(){
		System.out.println(name + ":" + "\r" + "type : " + type + "\r"+"price : " + price + "\r"+"address : " + address + "\r" + "owner : " + owner + "\r" + "available date : " + availableDate );
	}
}

class Money{
	float amount;
}

public class BookAirbnb {

	public static void main(String[] args) {
		
		App Airbnb = new App();
		
		House UW = new House();
		UW.name = "UW"; UW.type = "2b2b"; 
		UW.address = "Udistrict"; UW.price = "$100/D"; UW.availableDate = "09/01/2016 - 09/29/2016"; UW.owner = "Unversity of Washionton";
		House NEU = new House();
		NEU.name = "NEU"; NEU.type = "1b1b"; 
		NEU.address = "Downtown"; NEU.price = "$200/D"; NEU.availableDate = "09/10/2016 - 09/17/2016"; NEU.owner = "Northeastern unversity";
		House[] houses = {UW,NEU};
		
		Tourist sida = new Tourist();
		sida.name = "sida";
		sida.email = "niu.sid@husky.neu.edu";
		
		sida.visitApp(Airbnb);
		sida.findHouses(houses);
		Airbnb.displayAvailableHouse();
		UW.getInformation();
		NEU.getInformation();
		sida.placeOrderForHouse(NEU);
		float money = (float) (200*(1+0.15) * 4);
		sida.payMoneyToApp(money);
		Airbnb.acceptPayment(sida, money);
		Airbnb.sendOrderInformation(sida);
	}

}