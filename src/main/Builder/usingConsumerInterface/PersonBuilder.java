package usingConsumerInterface;

import java.util.function.Consumer;

public class PersonBuilder {
	public String name;
	public String id;
	public int age;
	public boolean loveCoffee;
	
	
	public PersonBuilder builder(Consumer<PersonBuilder> personBuilder) {
		personBuilder.accept(this);
		return this;
	}
	
	public Person build() {
		return new Person(name, id, age, loveCoffee);
	}
}
 