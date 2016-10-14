
public class IceCream extends DessertItem{
	protected int cost;

	public IceCream(String name, int cost) {
		super(name);
		this.cost = cost;
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
