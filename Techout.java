package finalassignment;

/*	Provide an interface Company with 
	default method of return type double calculating the profit(CP-SP)
	static method of return type String which takes (double) input from previous method and returns company name.
	Abstract method String getCompDetails(double profit,String name);=>Needs to be implemented using Lambda expression.		*/

public interface Techout {
	
	default double calculateProfit(double costPrice, double sellingPrice) {
		
		double profit = 0;
		double profitpercentage = 0;
		if(costPrice < sellingPrice) {
			
			profit = sellingPrice - costPrice;
			profitpercentage = (profit / costPrice) * 100;
			
		}
		return profitpercentage;
		
	}
	
	public static String compName(String name) {
		
		return name;
		
	}
	
	// abstract method
	public void getCompDetails(double profit, String name);

}
