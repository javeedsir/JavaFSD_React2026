package java21;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class SequencedCollectionDemo {
	
    public static void main(String[] args) {
        SequencedCollection<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list.getFirst()); // A
        System.out.println(list.getLast());  // C
    }

	
	

}
