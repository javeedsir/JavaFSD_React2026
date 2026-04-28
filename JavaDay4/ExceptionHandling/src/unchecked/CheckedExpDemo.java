package unchecked;

public class CheckedExpDemo {

	public static void main(String[] args) {


			System.out.println("Open File");
			System.out.println("Reading Data");
			System.out.println("Insert Data");
				
			int result = 0;
			
			try {
			 result =	div(15, 5); // risky code
			 
			 String name = null;
			 
			 System.out.println(name.length());
			
			}
			catch (ArithmeticException e) {
				
				 e.printStackTrace();
				 
				 System.err.println("Sorry  User You can't divide number by zero");

			}
			
			catch (NullPointerException ne) {

					ne.printStackTrace();
					//System.err.println(ne);
				
					System.err.println("You cannot find length for null value");
				
			}
			catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
			finally {
				
				System.out.println("Close File");
				
				
				
				
			}
			
			
			System.out.println("Result "+result);
			
			
			
		
		
		
	}

	
	
	public static  int div(int a, int b)throws ArithmeticException {
		
		
		return a / b;
		
		
	}
	
	
}
