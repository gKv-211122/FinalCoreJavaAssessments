package finalassignment;

public class Ques22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double cp = 234.67;
		double sp = 786.89;
		String str = "Techout";
		
		
		Techout t = (profit, name) -> {
			
			System.out.println(cp + "  " + name);
			return name;
		};
		
		t.getCompDetails(sp, Techout.compName(str));
		
		//System.out.println(t.calculateProfit(cp, sp));
		
		

	}

}
