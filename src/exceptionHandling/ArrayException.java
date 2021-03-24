package exceptionHandling;

public class ArrayException {

	public static void main(String[] args) {
		
		System.out.println("Beginning");
		
		try {
		
		int i[] = new int[4];
		
		i[5] = 50;
		
		}catch(Exception e) {
			
			System.out.println("Error occurred");
			
			e.printStackTrace();
		}
		
		System.out.println("Ending");
	 
	}

}
