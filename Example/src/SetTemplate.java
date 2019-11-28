import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetTemplate {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("张三","20");
		Student s2 = new Student("李四","21");
		Student s3 = new Student("王五","22");
		
		
		Set set = new HashSet<>();
	    set.add(s1);
	    set.add(s2);
	    set.add(s3);
		System.out.println(set);

		
//		Iterator<String> it = set.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
		
		
	}

}
