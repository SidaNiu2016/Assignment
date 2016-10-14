
public class Cookie extends DessertItem{
	protected int number;
	protected int pricePerDozen;
	protected int cost;

	public Cookie(String name, int number, int pricePerDozen) {
		super(name);
		this.number = number;
		this.pricePerDozen = pricePerDozen;
		cost = (int)((double)number/12 * pricePerDozen);
	}
	
	@Override
	public int getCost(){
		return cost;
	}
	
	@Override
	public String getInfo(){
		DessertShoppe ds = new DessertShoppe("Seattle Typhoon", 0.065, 30, 10);
		System.out.println(number + " @ " + ds.cents2dollarsAndCents(pricePerDozen) + " /dz.");
		return "";
	}

}
