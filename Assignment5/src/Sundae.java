
public class Sundae extends IceCream {
	protected int cost;

	public Sundae(String IceCreamName, int IceCreamCost, String toppingName, int toppingCost) {
		super(IceCreamName,IceCreamCost);
		cost = IceCreamCost + toppingCost;
	}
	
	@Override
	public int getCost(){
		return cost;
	}
	
	@Override
	public  String getInfo(){
		return null;
	}

}
