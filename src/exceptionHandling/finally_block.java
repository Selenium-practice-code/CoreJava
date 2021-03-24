package exceptionHandling;

public class finally_block {

	public static void main(String[] args) {
		 
		
		try {
			
			/* DB Connection successfully
			 * executing some queries
			 * validating the data and comparing form websites
			 * Closing connection 
			 */
			
			int i[] = new int[4];
			
			i[5] = 100;
			System.out.println("Close DB connection in try block");
			
			
			
		}catch(Exception e) {
			
			System.out.println("Error occurred");
			
			
		}finally { 
			
				System.out.println("Closing the DB Connection");
				
			
		}
	}

}
