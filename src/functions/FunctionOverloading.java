package functions;

public class FunctionOverloading {
	
	public static int a = 30;
	public static int b = 20;
	
	
	public static void addNumbers() {
		
		int c = a+b;
		System.out.println("Addition of two numbers are : " + c);
	}
	
	public static void addNumbers(int r, int s) {
		
		int add = r+s;
		System.out.println("Addition of two number are : " +add);
		
		
		
	}

	public static void main(String[] args) {
		
		FunctionOverloading.addNumbers();
		FunctionOverloading.addNumbers(40, 30);
		 
	}
}
