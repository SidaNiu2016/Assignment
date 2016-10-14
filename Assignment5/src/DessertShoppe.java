
public class DessertShoppe {
	protected final String name;
	protected final double tax;
	protected final int maxSizeOfItemName;
	protected final int widthOfItemCost;
	
	public DessertShoppe(String name, double tax, int maxSizeOfItemName, int widthOfItemCost){
		this.name = name;
		this.tax = tax;
		this.maxSizeOfItemName = maxSizeOfItemName;
		this.widthOfItemCost = widthOfItemCost;	
	}
	
	public String cents2dollarsAndCents(int money){
		String dollarsAndCents = "";
		int dollars = money/100;
	    int cents = money % 100;

	    if (dollars > 0){
	    	dollarsAndCents += dollars;
	    }
	    
	    dollarsAndCents += ".";
	    
	    if (cents < 10){
	    	dollarsAndCents += "0";
	    }
	    
	    dollarsAndCents += cents;
		
	    return dollarsAndCents;
	} 

}
