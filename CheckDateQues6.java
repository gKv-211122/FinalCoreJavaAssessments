package finalassignment;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * User should be asked to enter any date.
	1 method checks if input date is earlier to present date.
	1 method checks if input date is after to present date.
	1 method converts given date into "yyyy-MM-dd HH:mm:ssZ" pattern.*/

public class CheckDateQues6 {
	
	SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
	Date presentDate = sdformat.parse("2019-04-15");
	
	public void checkEarlierToPresentDate(Date d1) {
		
		if(d1.compareTo(presentDate) > 0) {
	         System.out.println("Date 1 occurs after Date 2");
		
	}
	public void checkAfterToPresentDate(Date d2) {
		
		
	}
	
	public void convertDateInFormat(Date d3) {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any data");
		String userDate = sc.next();
		
		

	}

}
