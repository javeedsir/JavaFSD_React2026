package strings;

public class SBDemo {

	public static void main(String[] args) {


		StringBuffer sb1 = new StringBuffer("hello");
		
		   sb1.append(" world");
		
		
		   System.out.println(sb1);
		   
		   
		  // sb1.reverse();
		   
		   System.out.println(sb1);
		   
		   sb1.insert(0, 'A');
		   
		   System.out.println(sb1);
		
	}

}
