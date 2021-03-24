package arrays;

public class twoDimensionalArrays {

	public static void main(String[] args) {
		 
		
		int rows = 3;
		int cols = 3;
		
		//Initialize two dimension array 
		
		int table[][] = new int[rows][cols];
		
		//assign the values of first row
		
		table[0][0] = 10;
		table[0][1] = 20;
		table[0][2] = 30;
		
		table[1][0] = 11;
		table[1][1] = 21;
		table[1][2] = 31;
		
		table[2][0] = 12;
		table[2][1] = 23;
		table[2][2] = 34;
		
		//Row length
		//System.out.println(table.length);
		
		//Col length
		//System.out.println(table[0].length);
		
		//System.out.println(table[0][0]);
		
		//Read the data in rectangular format
		for(int i=0; i<rows; i++) {
			
			for(int j=0; j<cols; j++) {
				
				System.out.print("   " + table[i][j]);
				
			}System.out.println(" ");
		}
	}

}
