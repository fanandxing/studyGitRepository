import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HashMapNew {
	//HashMap的key和value都不可以重复，如果值发生重复，则后面的key和value会替代之前的key和value
	public static void main(String[] args) {
		Map map = new HashMap();
//		map.put("1", "2");
//		map.put("1", "2");
//		map.put("1", "3");
//		map.put("4", "2");
		map.put("4", "3");
		map.put(null, "7");
		map.put("5", null);
		map.put(null, null);
	//	System.out.println(map);
		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
	       while (it.hasNext()) {
	          Map.Entry<Integer, String> entry = it.next();
	          System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
	       }
	}

}
