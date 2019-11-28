
public class Exam {

	private String name;
	
	private String date;
	
	private String dept;
	
	public Exam(){
		System();
	}
	
	public Exam(String name,String date,String dept){
		System2();
	}
	
	public void System(){
		System.out.println("这是一个无参构造函数");
	}
	
	public void System2(){
		System.out.println("这是一个有参构造函数");
	}
	
	public String Dema(){
		return dept;
		
	}

	@Override
	public String toString() {
		return "Exam [name=" + name + ", date=" + date + ", dept=" + dept + "]";
	}
	
	

}
