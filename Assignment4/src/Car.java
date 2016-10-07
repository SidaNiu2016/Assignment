/*4. Design and implement a class called Car. 
 * You need to create necessary attributes for this class, and method if needed. 
 * Define the Car constructor to initialize these values (in that order). 
 * Include getter and setter methods for all instance data.
*/
public class Car {
	private String make;
	private String model;
	private double price;
	private int year;
	private int mileage;
	private String exteriorColor;
	private String interiorColor;
	private String drivetrain;
	private String transmission;
	private int cylinder;
	private Fuel fuel;//two types of fuel
	private Engine engine;//two types of engine status
	
	enum Fuel{
		Gasoline, Diesel
	}
	
	enum Engine{
		On, Off
	}
	
	Car(){
		this.make = "BMW";
		this.model = "X3";
		this.price = 35000;
		this.year = 2014;
		this.mileage = 33429;
		this.exteriorColor = "White";
		this.interiorColor = "Black";
		this.drivetrain = "AWD";
		this.transmission = "Automatic";
		this.cylinder = 6;
		this.fuel = Fuel.Gasoline;	
		this.engine = Engine.Off;
	}
	
	public void run(int mile){
		this.engine = Engine.On;
		GasTank gasTank = new GasTank();
		gasTank.useGas(mile);
	}
	
    public void stop(){
    	this.engine = Engine.Off;
    }
    
    public String getMake(){
    	return make;
    }
    
    public void setMake(String make){
    	this.make = make;
    }
    
    public String getModel(){
    	return model;
    }
    
    public void setModel(String model){
    	this.model = model;
    }
    
    public double getPrice(){
    	return price;
    }
    
    public void setPrice(double price){
    	this.price = price;
    }
    
    public int getYear(){
    	return year;
    }
    
    public void setYear(int year){
    	this.year = year;
    }
    
    public int getMileage(){
    	return mileage;
    }
    
    public void setMileage(int mileage){
    	this.mileage = mileage;
    }
    
    public String getExteriorColor(){
    	return exteriorColor;
    }
    
    public void setExteriorColor(String color){
    	this.exteriorColor = color;
    }
    
    public String getInteriorColor(){
    	return interiorColor;
    }
    
    public void setInteriorColor(String color){
    	this.interiorColor = color;
    }
    
    public String getDrivetrain(){
    	return drivetrain;
    }
    
    public void setgetDrivetrain(String drivetrain){
    	this.drivetrain = drivetrain;
    }
    
    public String getTransmission(){
    	return transmission;
    }
    
    public void setTransmission(String transmission){
    	this.transmission = transmission;
    }
    
    public int getCylinder(){
    	return cylinder;
    }
    
    public void setCylinder(int cylinder){
    	this.cylinder = cylinder;
    }

    public Fuel getFuel(){
    	return fuel;
    }
    
    public void setFuel(Fuel fuel){
    	this.fuel = fuel;
    }
    
    public Engine getEngine(){
    	return engine;
    }
    
    public void setEngine(Engine engine){
    	this.engine = engine;
    }

}
