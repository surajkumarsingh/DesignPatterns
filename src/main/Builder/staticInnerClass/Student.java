package staticInnerClass;

public class Student {
	private String name;
	private String id;
	private int age;
	private boolean loveCoffee;

	// Creating private constructor so outer class can't access only inner class can
	// access
	private Student(String name, String id, int age, boolean loveCoffee) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.loveCoffee = loveCoffee;
	}

	public boolean isLoveCoffee() {
		return loveCoffee;
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

	public static StudentBuilder builder() {

		return new StudentBuilder();
	}

	public static class StudentBuilder {
		private String name;
		private String id;
		private int age;
		private boolean loveCoffee;

		public Student build() {

			return new Student(name, id, age, loveCoffee);
		}

		public StudentBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public StudentBuilder setId(String id) {
			this.id = id;
			return this;
		}

		public StudentBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public StudentBuilder setLoveCoffee(boolean loveCoffee) {
			this.loveCoffee = loveCoffee;
			return this;
		}
	}
}
