package queue;

import java.util.PriorityQueue;

import set.MyComparator;

public class PriorityQueueDemo {
	
	
	
	public static void main(String[] args)  
	{ 
	PriorityQueue<String> q=new PriorityQueue<String>(15); 
	q.offer("A"); 
	q.offer("Z"); 
	q.offer("L"); 
	q.offer("B"); 
	System.out.println(q);
	}

}
