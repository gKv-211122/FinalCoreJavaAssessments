package finalassignment;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trianee  t = new Trianee ("AAAA", "BBBB", "CCCC");

		StudyMaterial s = new StudyMaterial("python", "java", "javaScript");

		System.out.println(t.getTrainee1() + " Having book " + s.getBookName() + " having 2nd book " + s.getBookName2()
				+ " having pdf of " + s.getPdfs());
		System.out.println(t.getTrainee2() + " Having book " + s.getBookName() + " having 2nd book " + s.getBookName2()
				+ " having pdf of " + s.getPdfs());
		System.out.println(t.getTrainee3() + " Having book " + s.getBookName() + " having 2nd book " + s.getBookName2()
				+ " having pdf of " + s.getPdfs());

	}

}
