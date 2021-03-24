package exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Befor try Block");
		
		try {
		System.out.println("Beginning");
		
		int divide = 10/0;
		System.out.println(divide);
		
		}catch(Throwable t) {
			
			System.out.println("Error occurred");
			t.printStackTrace();
		
		}
		
		System.out.println("Ending");

	}
	
	

}
