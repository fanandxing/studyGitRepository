
public class EqualsText {
	
	public static void main(String[] args) {
		String s1 = new String("xyz");
		String s2 = new String("xyz");
        
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		System.out.println("s1的hashcode值是: " + System.identityHashCode(s1));
        System.out.println("s2的hashcode值是: " + System.identityHashCode(s2));
	
	}

}
