package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {


			//Map<Integer,String> map  = new LinkedHashMap<Integer,String>();
			
		Map<Integer,String> map  = new HashMap<Integer,String>();
			
				map.put(30, "Tom");
				map.put(35, "Smith");
				map.put(31, "Ford");
				map.put(39, "Javeed");
				map.put(36, "Tom");
				
				
				System.out.println(map);
				
				Set<Integer>   set = 		map.keySet();
				
			Iterator<Integer>  it =		set.iterator();
				
			
			while (it.hasNext()) {
				Integer k =  it.next();
				
				System.out.println(k +" "+  map.get(k));
				
			}
				
				
				
				
				
				
				
				
				
				
				
				
		
		
	}

}
