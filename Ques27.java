package finalassignment;

import java.io.FileReader;
import java.io.IOException;

public class Ques27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 10/0;
			
			int arr[] = new int[5];
			
			arr[5]=56;
			
			FileReader fr = new FileReader("Test.txt");
			
			
			System.out.println(fr.read());
			
					
		}
		catch(ArithmeticException a) {
			System.out.println("Exception" +a.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ar) {
			System.out.println("Exception" +ar.getMessage());
		}
		catch(IOException io) {
			System.out.println("Exception" +io.getMessage());
		}
		catch(Exception e) {
			System.out.println("Exception" +e.getMessage());
		}
		finally {
			System.out.println("all exception are handled");
		}

	}

}
