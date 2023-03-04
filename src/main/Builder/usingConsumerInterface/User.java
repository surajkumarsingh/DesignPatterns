package usingConsumerInterface;

public class User {

	public static void main(String[] args) {
		Person person = new PersonBuilder().builder(personBuilder -> {
			personBuilder.name = "Suraj";
			personBuilder.age = 28;
		}).build();
		System.out.println(person.getName());
	}

}
