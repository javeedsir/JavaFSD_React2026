package lambda.exp;

public class Main {

	public static void main(String[] args) {


			//MyInterface mi =	(int a, int b)->{  return a+b; };  // function Lambda exp
		//System.out.println("Total  : "+ mi.add(5, 5));
			
			//MyInterface ci = (String name) -> System.out.println("Hello "+name); // Consumer lambda exp
			
				//	ci.setName("Javeed");
		
		
		//	MyInterface si = ()->{return 100;}; // supplier lambda exp
			
		//	System.out.println(si.getCount());
		
		
				MyInterface pi = x-> x.length() > 5 ; // Predicate lambda exp
				
								// (String x) -> {return x.length() > 5;};
				
					System.out.println(pi.isValidName("tom"));

	}

}
