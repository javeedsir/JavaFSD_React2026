package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class DequeDemo {

	public static void main(String[] args) {

		
		
	Queue<Integer>    dq =			new ArrayDeque<Integer>();
	
			dq.add(20);
			dq.add(10);
			dq.add(40);
			dq.add(30);
			
			
			System.out.println(dq);
			
			System.out.println(dq.element());
			System.out.println(dq.peek());
		
		

	}

}
