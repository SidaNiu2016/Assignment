
public class Candy extends DessertItem {
	protected double weight;
	protected int pricePerPound; 
	protected int cost;

	public Candy(String name, double weight, int pricePerPound) {
		super(name);
		this.weight = weight;
		this.pricePerPound = pricePerPound;
		cost = (int)(weight *pricePerPound+0.5);
	}
	
	@Override
	public int getCost(){
		return cost;
	}
	
	@Override
	public String getInfo(){
		DessertShoppe ds = new DessertShoppe("Seattle Typhoon", 0.065, 30, 10);
		System.out.println(weight + " lbs. @ " + ds.cents2dollarsAndCents(pricePerPound) + " /lb.");
		return "";
	}

}
