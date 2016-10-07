/*5.Combine with problem 3 and 4, define a class named Driver that contains methods 
 * like drive and addGas so that the driver can drive the car.
*/

public class Driver {
	private String name;
	private int age;
	private int driveID;
	private Car car = new Car();
	private GasTank gasTank = new GasTank();
	
	Driver(String name, int age, int driveID){
		this.name = name;
		this.age = age;
		this.driveID = driveID;
	}
	
	public void drive(int mile){
		car.run(mile);
		System.out.println(name + " drive "+ mile);
	}
	
	public void checkGas(){
		gasTank.getGasLevel();
	}
	
	public void addGas(int gas){
		gasTank.addGas(gas);
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public int getDriveID(){
		return driveID;
	}

}
