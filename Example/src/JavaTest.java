
public class JavaTest {

	class A{
		public String getName()
		{
			System.out.println("A");
			return null;
		}
	}
	
	class B extends A{
		public String getName(){
			System.out.println("B");
			return null;
		} 
	}
	
	void runTest()
	{
		B b = new B();
		A a = new B();
		System.out.println(a.getName()+" "+b.getName());
	}
}
