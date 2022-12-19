package finalassignment;

public class Ques22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double cp = 234.67;
		double sp = 786.89;
		String str = "Techout";
		
		
		Techout t = (profit, name) -> {
			
			
			return profit + " : " + name;
		};
		
		//System.out.println(t.calculateProfit(cp, sp));
		System.out.println(t.getCompDetails(t.calculateProfit(cp, sp), Techout.compName(str)));
		
		
		
		

	}

}
