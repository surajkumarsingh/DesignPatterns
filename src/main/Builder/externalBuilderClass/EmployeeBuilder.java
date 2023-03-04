package externalBuilderClass;

public class EmployeeBuilder {
	
	private String name;
	private String job;
	private int age;
	  public static void main(String[] args) {
		System.out.println(new EmployeeBuilder().setName("Suraj").setJob("qa").build().getName());
	}
	
	public EmployeeBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public EmployeeBuilder setJob(String job) {
		this.job = job;
		return this;
	}
	public EmployeeBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	public Employee build() {	
		return new Employee(name, job, age);
	}	
}
