package finalassignment;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Ques25 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			System.out.println("Method 1");
			IntStream.range(1, 10).forEach(val -> System.out.println(val * 2));
		    
		    /*  System.out.println("Method 2");
		    //range excludes the 
		    IntStream.range(1, 10).forEach(System.out::println);
		    
		    System.out.println("Using rangeClosed");
		    //rangeClosed includes the number
		    IntStream.rangeClosed(1, 10).forEach(System.out::println);
		    
		    
		    IntStream.range(1, 10).forEach(val -> System.out.println(val * 2));
		    
		    */
			IntStream v = IntStream.range(1, 10);
			
//			for(int i = 0; i < 10; i++) {
//				if(v.equals(4) || v.equals(5) || v.equals(6)) {
//					
//					continue;
//				}
//				
//				v.forEach(System.out::println);
//			}
			
			 IntStream.range(1, 10).forEach((System.out::println));
			
			
			
			

	}
	

}
