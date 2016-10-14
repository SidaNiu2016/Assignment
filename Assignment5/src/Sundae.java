
public class Sundae extends IceCream {
	protected int cost;
	protected String toppingName;

	public Sundae(String IceCreamName, int IceCreamCost, String toppingName, int toppingCost) {
		super(IceCreamName,IceCreamCost);
		cost = IceCreamCost + toppingCost;
		this.toppingName = toppingName;
	}
	
	@Override
	public int getCost(){
		return cost;
	}
	
	@Override
	public  String getInfo(){
		System.out.println(this.toppingName + " Sundae with");
		return "";
	}

}
