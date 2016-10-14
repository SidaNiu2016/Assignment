import java.util.ArrayList;

public class Checkout {
	protected ArrayList<DessertItem> items;
	protected DessertShoppe ds;
	
	public Checkout(){
		this.items = new ArrayList<DessertItem>();
		ds = new DessertShoppe("Seattle Typhoon", 0.065, 30, 10);
	}

	public void enterItem(DessertItem dessert) {
		if (dessert != null){
			this.items.add(dessert);
		}	
	}

	public void clear() {
		this.items.clear();
	}

	public int numberOfItems() {
		return items.size();
	}

	public int totalCost() {
		int totalCost = 0;
		for(DessertItem di : items){
			totalCost += di.getCost();
		}
		return totalCost;
	}

	public int totalTax() {
		int totalTax = 0;
		totalTax = (int)(totalCost() * ds.tax);
		return totalTax;
	}
	
	public String toString(){

		int sotreNameLength = ds.name.length();
		int centralize = (ds.maxSizeOfItemName - ds.name.length())/2;
		String storeName = insertSpace(centralize) + ds.name; 
		String underscore = insertSpace(centralize); 
		for (int i = 0; i < sotreNameLength; i++){
			underscore += "-";
		}
		System.out.println(storeName);
		System.out.println(underscore + "\n");
		
		for(DessertItem di : items){
			di.getInfo();
			int space = ds.maxSizeOfItemName - di.getName().length() - 4;
			System.out.println(di.getName() + insertSpace(space) + ds.cents2dollarsAndCents(di.getCost()));
		}
		System.out.println();
		
		System.out.println("Tax" + insertSpace(ds.maxSizeOfItemName - 6) + ds.cents2dollarsAndCents(this.totalTax()));

        System.out.println("Total Cost" + insertSpace(ds.maxSizeOfItemName - 15) + ds.cents2dollarsAndCents(this.totalTax() + this.totalCost()));
        
        return "";
		
	}
	
	private String insertSpace(int x){
		String space = "";
		for (int i = 0; i < x; i++){
			space += " ";
		}
		return space; 
	}

}
