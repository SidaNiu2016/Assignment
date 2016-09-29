//Description : A consumer is going to order a delivery through phone calls.

//Objects (with Behaviors and State): 

//Object : Consumer
//State : name, phoneNumber, email, orderID
//Behavior : inputNumberToPhone(), orderDelivery(), payForOrder(), receiveDelivery()

//Object : CustomerService
//State : Collection of orders, servicePhoneNumber
//Behavior : getOrderDetails(), acceptPayment(), sendDelivery()

//Object : Order
//State : ID, item, number, delieveryAddress,

//Object : Phone
//State : phoneNumber
//Behavior : call()

//Object : Payment
//State : amount

class Consumer{
	String name, phoneNumber, email, orderID;
	void inputNumberToPhone(Phone p, String phoneNumber){}
	void orderDelivery(Order o){
		System.out.println("You have order ID is " + o.ID + ", contains " + o.item + " (" + o.number + ") to " + o.delieveryAddress + "!");
	}
	void payForOrder(Order o){}
	void receiveDelivery(Order o){
		System.out.println(name + " has received the delivery!");
	}
}

class CustomerService{
	String servicePhoneNumber;
	Order[] orders; //Array of order
	void getOrderDetails(Order[] orders){}
	void acceptPayment(Order o){
		System.out.println("Customer Service : Your payment is accepted!");
	}
	void sendDelivery(Order o){
		System.out.println("Customer Service : Your delivery has been sent out!");
	}
}

class Order{
	String ID, item, delieveryAddress;
	Integer number;
}

class Phone{
	String phoneNumber;
	void call(String phoneNumber){
		System.out.println("You are calling " + phoneNumber + "!");
	}
}

class Payment{
	float amount;
}

public class OrderDelivery {

	public static void main(String[] args) {
		CustomerService IKEA = new CustomerService();
		IKEA.servicePhoneNumber = "206.111.2222";
		
		Phone phone = new Phone();
		
		Consumer sida = new Consumer();
		sida.email = "niu.sid@husky.neu.edu";
		sida.name = "sida";
		sida.orderID = "001";
		sida.phoneNumber = "206.222.1111";
		
		Order a = new Order();
		Order b = new Order();
		Order c = new Order();
		a.ID = "001"; a.item = "chair"; a.number = 2; a.delieveryAddress = "Lake City";
		b.ID = "002"; b.item = "table"; b.number = 1; b.delieveryAddress = "Udistrict";
		c.ID = "003"; c.item = "bed"; c.number = 3; c.delieveryAddress = "Downtown";
		Order[] orders = {a,b,c};
        sida.inputNumberToPhone(phone,IKEA.servicePhoneNumber);
        phone.call(IKEA.servicePhoneNumber);
        sida.orderDelivery(a);
        IKEA.getOrderDetails(orders);
        sida.payForOrder(a);
        IKEA.acceptPayment(a);
        IKEA.sendDelivery(a);
        sida.receiveDelivery(a);
	}

}