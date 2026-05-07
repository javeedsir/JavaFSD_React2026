package java17;



public class Switch2 {

	public static void main(String[] args) {


			byte itemCode = 004;
		
		 switch (itemCode) {
		    case 001 , 004 : 
		        System.out.println("It's a laptop!");
		        // missed out break here 
		    
		    
		        break;
		    case 002 :
		        System.out.println("It's a desktop!");
		        break;
		    case 003:
		    	System.out.println("It's a printer");
		    	break;
		        
		}
		 
		 
		 	String code = "x";
		 
		 int val = switch (code) {
		    case "x", "y" :
		        yield 1;
		    case "z", "w" :
		        yield 2;
		default:
			throw new IllegalArgumentException("Unexpected value: " + code);
		};
		
		System.out.println(val);
		
	}

}
