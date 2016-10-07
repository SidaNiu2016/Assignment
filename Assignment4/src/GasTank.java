/*3. Write a class named GasTank containing:
 * An instance variable named amount of type double, initialized to 0.
 * A method named addGas that accepts a parameter of type double . 
 * The value of the amount instance variable is increased by the value of the parameter.
 * A method named useGas that accepts a parameter of type double . 
 * The value of the amount instance variable is decreased by the value of the parameter.
 * A method named getGasLevel that accepts no parameters. 
 * getGasLevel returns the value of the amount instance variable.
*/
public class GasTank {
	private double amount;
	
    GasTank(){
		this.amount = 0;
	}
	
	public void addGas(double gas){
		this.amount = amount + gas;
	}
	
	public void useGas(double gas){
		if (this.amount >= gas) {
			this.amount = amount - gas;
		} else {
			System.out.println("No enought gas!");
		}
	}
	
	public double getGasLevel(){
		return amount;
	}
	
}
