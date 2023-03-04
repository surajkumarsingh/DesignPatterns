package staticInnerClass;

public class User {
	
	public static void main(String[] args) {
       
	System.out.println(Student.builder().setName("Suraj").setAge(28).setId("A001").setLoveCoffee(true).build().getId());	
		
	}
}
