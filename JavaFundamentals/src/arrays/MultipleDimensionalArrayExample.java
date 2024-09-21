package Arrays;


public class MultipleDimensionalArrayExample {
	public static void main(String[] args) {
		//array declaration
		int[][] studentMarks = new int[][] {{68,79,94,86},{78,95,84,95},{76,83,65,94}};
		
		for (int i = 0; i < studentMarks.length; i++) {
			for (int j = 0; j < studentMarks[i].length; j++) {
				System.out.print(studentMarks[i][j] + "	");
			}
			System.out.println();
		}
	} 
}