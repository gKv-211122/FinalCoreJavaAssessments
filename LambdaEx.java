package finalassignment;
interface Add {
	
	public int sum(int a, int b);
	
}

public class LambdaEx {
	
//	public static int add(int a, int b) {
//		
//		return a + b;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add g =(a, b) -> {
			
			return a + b;
		};
		
		System.out.println(g.sum(2, 4));
		
		
		

	}

}
