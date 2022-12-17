package finalassignment;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;

public class Ques23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<>();
        for(int i =4;i<=20;i++) {
            al.add(i);
        }
        
        IntSummaryStatistics result = al.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(result);

	}

}
