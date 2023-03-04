package usingConsumerInterface;

public class Person {
	private String name;
	private String id;
	private int age;
	private boolean loveCoffee;
	
public Person(String name, String id,int age, boolean loveCoffee) {
	this.name = name;
	this.id = id;
	this.age = age;
	this.loveCoffee= loveCoffee;
}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public boolean isLoveCoffee() {
		return loveCoffee;
	}
	
	
}
