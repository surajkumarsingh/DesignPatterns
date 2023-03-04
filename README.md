
# Design Patterns And Design Principles

- #### What is Design Patterns And Design Principles?
Design principles and design patterns are both important concepts in software design, but they serve different purposes.

Design principles are general guidelines that help software designers make good decisions about software architecture and design. They are high-level concepts that provide a foundation for creating robust, maintainable, and extensible software systems. Examples of design principles include the SOLID principles, the DRY principle, and the KISS principle. Design principles are not specific to any particular programming language or framework, and they can be applied to a wide variety of software systems.

Design patterns, on the other hand, are reusable solutions to common software design problems. They are specific to particular programming languages or frameworks and provide concrete examples of how to implement design principles. Design patterns provide a way to structure code that is easy to understand, maintain, and extend. Examples of design patterns include the Singleton pattern, the Factory pattern, and the Observer pattern.

In summary, design principles are broad guidelines that help designers make good decisions about software architecture and design, while design patterns are specific solutions to common design problems that can be implemented in code. Both are important in software design, and they should be used together to create well-designed, maintainable software systems.









## Creational Design Patterns

- ### Singleton Pattern

The Singleton pattern is a design pattern that restricts the instantiation of a class to a single instance and provides a global point of access to that instance. It is a creational pattern that is often used when we want to ensure that there is only one instance of a class in an application and that this instance is easily accessible throughout the entire application.

The Singleton pattern typically involves creating a private constructor for the class and a static method that returns a single instance of the class. The first time this method is called, it creates a new instance of the class, and subsequent calls to the method return the same instance. This ensures that there is only one instance of the class in the application.

```java
public class Singleton {
    private static Singleton instance = null;
    private Singleton() {
        // Private constructor to prevent instantiation from outside the class
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```
In this example, the Singleton class has a private constructor and a static method getInstance that returns a single instance of the Singleton class. The getInstance method checks if the instance variable is null, and if it is, it creates a new instance of the Singleton class. Subsequent calls to the getInstance method return the same instance.

The Singleton pattern can be useful in situations where we want to limit the number of instances of a class in an application, such as when working with shared resources or when using a logging system. However, it should be used with care, as it can introduce global state and make the code more difficult to test and maintain.

- #### Benefits of Singleton

* The Singleton pattern has several benefits and can be useful in various use cases. Some of the benefits and use cases of the Singleton pattern include:

* Ensures only one instance of a class: The Singleton pattern ensures that only one instance of a class is created, which can be useful in situations where creating multiple instances of the same class would cause issues, such as consuming too many resources.

* Global point of access: Since the Singleton pattern creates a single instance of a class, it provides a global point of access to that instance, making it easy to access the class from anywhere in the code.

* Reduces memory usage: By ensuring that only one instance of a class is created, the Singleton pattern can reduce memory usage and improve performance, especially in situations where the class is resource-intensive.

* Improves flexibility: The Singleton pattern allows you to change the behavior of a class by modifying the singleton instance, rather than modifying every instance of the class. This can make the code more flexible and easier to maintain.

* Useful for logging, database connections, and caches: The Singleton pattern is commonly used for creating logging instances, managing database connections, and implementing caches.

Overall, the Singleton pattern can be a useful tool in many different use cases, especially when you need to ensure that only one instance of a class is created and accessed globally.

- #### Limitations 

* Limited flexibility: Imagine you have an application that needs to work with multiple database connections. If you use a singleton pattern to manage the connections, it may not be possible to dynamically create and destroy connections as needed.

* Testability: Let's say you have a class that uses a singleton object to perform some complex calculations. Testing this class may be difficult, as it is not possible to mock or replace the singleton object to test different scenarios.

* Global state: Suppose you have a web application that uses a singleton object to manage user authentication. If the singleton object is not implemented correctly, it may lead to unexpected behavior in the application, such as a user being able to access pages they should not have access to.

* Thread safety: Consider a multi-threaded application that uses a singleton object to manage a shared resource, such as a database connection. If multiple threads attempt to access the singleton object simultaneously, it can lead to race conditions and other synchronization issues, which can cause the application to crash or behave unexpectedly.

---
- ### Builder Pattern

The Builder pattern is a creational design pattern that is used to separate the construction of a complex object from its representation. This pattern allows you to create objects in a step-by-step manner, giving you more control over the construction process and the resulting object.

The Builder pattern consists of several components:

Builder: An interface or abstract class that defines the steps involved in creating the object.

ConcreteBuilder: A class that implements the Builder interface and provides concrete implementations of the creation steps.

Product: The object being created.

Director: An optional class that controls the order in which the steps are executed.

Here's an example implementation of the Builder pattern in Java:

```java
public class Employee {

	private String name;
	private String job;
	private int age;

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}

	public int getAge() {
		return age;
	}

	public Employee(String name, String job, int age) {
		this.name = name;
		this.job = job;
		this.age = age;

	}

}

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
```

* #### Benefits
The Builder pattern is used to create complex objects with a simple step-by-step approach. Some of the benefits and use cases of the Builder pattern include:

Provides a clear separation between the construction process and the representation of the final product. This makes it easier to modify the construction process without affecting the product.

Allows for the creation of different variations of a product using the same construction process. This is useful when creating products that have many possible combinations of options or properties.

Makes the code more readable and maintainable by hiding the complex construction process behind a simple interface.

Helps to avoid errors that can occur when using a large number of constructor parameters, especially when some of them are optional.

Can be used in conjunction with other design patterns, such as the Factory Method pattern or the Abstract Factory pattern, to create more complex object hierarchies.

Use cases for the Builder pattern include:

Creating objects with a large number of optional parameters, or objects that can be configured in different ways.

Creating objects that are difficult to construct or require a lot of code to create.

Creating objects that need to be immutable and thread-safe.

Creating objects that have a complex hierarchy or involve multiple steps in their construction.

Overall, the Builder pattern is a powerful tool for creating complex objects in a modular and maintainable way. It allows developers to focus on the construction process without worrying about the details of the final product, and can help to improve the readability and maintainability of code.

* #### Limitations

The Builder pattern can be very useful for creating complex objects with many configuration options. However, it also has some limitations, including:

* Increased code complexity: The Builder pattern can result in more code than using a simple constructor or factory method. This can make the code harder to read and maintain, especially if the builder is not well-designed.

* Decreased performance: The Builder pattern involves creating an additional object (the builder) and invoking multiple method calls to construct the final object. This can result in decreased performance compared to using a simple constructor or factory method.

* Limited reusability: The Builder pattern is typically used for creating a single object of a particular type, and may not be easily adaptable to create other types of objects. This can limit its reusability and result in duplicated code.

* Inflexibility with mandatory parameters: The Builder pattern is designed to handle optional parameters, but can be less flexible when mandatory parameters are involved. In some cases, it may be necessary to provide separate constructors or methods to handle mandatory parameters.

* Overall, the Builder pattern can be a powerful tool for creating complex objects with many configuration options. However, it may not be the best choice for all situations, and its use should be carefully considered based on the specific needs of the application being developed.

---

- ### Factory Pattern

The Factory pattern is a creational design pattern that provides a way to create objects without exposing the creation logic to the client. The basic idea of the Factory pattern is to define an interface for creating objects, but defer the instantiation of the objects to subclasses or other classes.

Here's an example of how the Factory pattern can be used in Java:

```java
public interface Animal {
    public void makeSound();
}

public class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class AnimalFactory {
    public static Animal createAnimal(String animalType) {
        if (animalType.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (animalType.equalsIgnoreCase("cat")) {
            return new Cat();
        } else {
            throw new IllegalArgumentException("Unknown animal type: " + animalType);
        }
    }
}

// Example usage
Animal animal1 = AnimalFactory.createAnimal("dog");
animal1.makeSound(); // prints "Woof!"

Animal animal2 = AnimalFactory.createAnimal("cat");
animal2.makeSound(); // prints "Meow!"
```
In this example, we have an Animal interface, with Dog and Cat classes that implement it. We also have an AnimalFactory class, which has a static createAnimal method that takes an animal type as a parameter and returns an Animal object.

When we call AnimalFactory.createAnimal, we pass in the animal type we want to create. The createAnimal method then uses a conditional statement to determine which type of animal to create, and returns a new instance of that animal. This way, the client does not need to know how to create the animal objects, and can simply call the createAnimal method to get a new instance.

The Factory pattern can be very useful for simplifying code and reducing coupling between classes. It can also make it easier to switch between different types of objects, since the creation logic is centralized in one place. However, it can also lead to increased complexity if not used appropriately, and may not be the best solution for all situations.

* #### Benefits
The Factory pattern offers several benefits in software design, including:

* Encapsulation of object creation: The Factory pattern encapsulates object creation logic, which helps to decouple the client code from the object creation process. This makes it easier to change the object creation process without affecting the client code.

* Increased flexibility: The Factory pattern makes it easy to add or remove different types of objects from the system. This makes it possible to add new functionality or change existing functionality without affecting other parts of the system.

* Simplified client code: The Factory pattern simplifies the client code by hiding the complexities of object creation. This makes it easier for developers to focus on the business logic of the application rather than the details of object creation.

* Centralized control: The Factory pattern provides a centralized location for object creation logic. This makes it easier to manage and control the creation process, and ensures that all objects are created consistently.

* Overall, the Factory pattern can help to improve the design of software systems by reducing coupling between classes, increasing flexibility, and simplifying client code. It is a useful tool for managing object creation in large and complex systems.


* #### Limitations

Like any design pattern, the Factory pattern also has some limitations that developers should be aware of. Some of the limitations of the Factory pattern include:

* Complexity: Implementing the Factory pattern can add complexity to the system, particularly if the factory needs to create complex objects with many dependencies. This can make it harder to maintain and modify the code over time.

* Increased Coupling: The Factory pattern can increase the coupling between the factory and the objects it creates. This can make it harder to change the object creation process without affecting other parts of the system.

* Limited Flexibility: The Factory pattern may not be the best choice for systems where the objects being created are highly dynamic or require a lot of customization. In these cases, a different pattern or approach may be more appropriate.

* Overuse: Like any pattern or technique, the Factory pattern can be overused. Using a factory for every object creation in the system can lead to unnecessary complexity and reduce the maintainability of the codebase.

It is important to evaluate the specific requirements of the system and consider the trade-offs involved in using the Factory pattern before deciding to implement it. When used appropriately, the Factory pattern can be a powerful tool for managing object creation in software systems.


---

# S.O.L.I.D


SOLID is an acronym for five principles of object-oriented programming that help to make software systems more flexible, maintainable, and robust. The principles are:

* 1.Single Responsibility Principle (SRP): A class should have only one reason to change. This means that a class should have only one responsibility and should be focused on doing one thing well.

* 2.Open/Closed Principle (OCP): A class should be open for extension but closed for modification. This means that a class should be designed in such a way that new functionality can be added without changing the existing code.

* 3.Liskov Substitution Principle (LSP): Subtypes should be substitutable for their base types. This means that any object of a superclass should be able to be replaced with an object of a subclass without causing any errors or unexpected behavior.

* 4.Interface Segregation Principle (ISP): A client should not be forced to depend on interfaces it does not use. This means that a class should be designed in such a way that it only depends on the interfaces that it needs, and not on any other interfaces.

* 5.Dependency Inversion Principle (DIP): High-level modules should not depend on low-level modules. Both should depend on abstractions. This means that a class should depend on abstractions, not on concrete implementations.

By following these principles, developers can create software systems that are more modular, maintainable, and flexible, making it easier to add new features or modify existing ones without breaking the system.


### Single Responsibility Principle (SRP):

The Single Responsibility Principle (SRP) states that a class should have only one reason to change. This means that a class should have only one responsibility and should be focused on doing one thing well. Here's an example:

Suppose we have a class called "Order". This class is responsible for managing the details of an order, such as the customer's name, the items ordered, the total price, etc. However, this class also has a method for calculating the shipping cost of the order, which is not directly related to the management of the order.

This violates the SRP, as the Order class is responsible for two separate concerns: managing orders and calculating shipping costs. To apply the SRP, we can separate the two responsibilities into two separate classes: Order and ShippingCalculator. The Order class will be responsible for managing the details of an order, and the ShippingCalculator class will be responsible for calculating the shipping cost.

This separation of concerns not only makes the code more modular and maintainable, but it also makes it easier to test each component independently. If we need to change the way shipping costs are calculated, we can do so without affecting the Order class, and vice versa.

---
### Open/Closed Principle (OCP):

The Open/Closed Principle (OCP) states that a class should be open for extension but closed for modification. This means that a class should be designed in such a way that new functionality can be added without changing the existing code. Here's an example:

Suppose we have a class called "Shape" which has a method "area()" that calculates the area of the shape. Initially, this class only supports two shapes, a rectangle and a circle, and the "area()" method is implemented accordingly.

Now, suppose we want to add support for a new shape, such as a triangle. According to the OCP, we should be able to do this without modifying the existing code. To achieve this, we can create a new class called "Triangle" that extends the Shape class and overrides the "area()" method to calculate the area of a triangle. This way, we have extended the functionality of the Shape class without modifying its existing code.

By following the OCP, we can create code that is more flexible and easier to maintain. If we need to add support for more shapes in the future, we can do so without affecting the existing code.

E.g : Webdriver architecture

Sample Code:

```java
public abstract class Shape {
    public abstract double area();
}

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }
}
```

---

### Liskov Substitution Principle (LSP):
Subtypes should be substitutable for their base types. This means that any object of a superclass should be able to be replaced with an object of a subclass without causing any errors or unexpected behavior.

sample code that violates LSP

```java
public class Rectangle {
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return width * height;
    }
}

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}

public class LSPDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        useRectangle(r);

        Square s = new Square(5);
        useRectangle(s); // violates LSP
    }

    public static void useRectangle(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);
        int expectedArea = width * 10;
        int actualArea = r.area();
        System.out.println("Expected area: " + expectedArea);
        System.out.println("Actual area: " + actualArea);
    }
}
```
In this example, we have a Rectangle class with width and height properties and an area() method that calculates the area of the rectangle. We also have a Square class that extends Rectangle and overrides the setWidth() and setHeight() methods to ensure that the width and height are always equal.

However, the Square class violates the Liskov Substitution Principle because it does not behave like a Rectangle in all cases. Specifically, when we call the useRectangle() method with a Square object, it modifies the height of the Square but not the width, resulting in an incorrect area calculation.

By violating the LSP, we create code that is harder to reason about and can lead to bugs and unexpected behavior. To adhere to the LSP, we should design our classes in a way that allows objects of derived classes to be used in place of objects of their base classes without causing any problems.


---

### Interface Segregation Principle (ISP)
Code sample of ISP

```java
public interface Vehicle {
    void start();
    void stop();
    void accelerate();
    void brake();
}

public interface Car extends Vehicle {
    void changeGear(int gear);
}

public interface Motorcycle extends Vehicle {
    void wheelie();
}

public class Sedan implements Car {
    private int currentGear;

    public void start() {
        // implementation
    }

    public void stop() {
        // implementation
    }

    public void accelerate() {
        // implementation
    }

    public void brake() {
        // implementation
    }

    public void changeGear(int gear) {
        this.currentGear = gear;
    }
}

public class SportBike implements Motorcycle {
    public void start() {
        // implementation
    }

    public void stop() {
        // implementation
    }

    public void accelerate() {
        // implementation
    }

    public void brake() {
        // implementation
    }

    public void wheelie() {
        // implementation
    }
}
```
In this example, we have a Vehicle interface with start(), stop(), accelerate(), and brake() methods. We also have two sub-interfaces: Car, which extends Vehicle and adds a changeGear() method, and Motorcycle, which extends Vehicle and adds a wheelie() method.

The Sedan and SportBike classes implement the appropriate interfaces and provide the necessary method implementations. Note that each class only implements the methods that are relevant to its behavior, rather than implementing all methods from the parent interface.

By adhering to the ISP, we create classes that are more modular and easier to maintain. We can also avoid the problem of having a large, bloated interface that forces implementing classes to provide unnecessary functionality.


### Dependency Inversion Principle (DIP):

code sample of DIP:

```java
public interface Database {
    void save(String data);
}

public class MySQLDatabase implements Database {
    public void save(String data) {
        // implementation to save data in MySQL database
    }
}

public class PostgreSQLDatabase implements Database {
    public void save(String data) {
        // implementation to save data in PostgreSQL database
    }
}

public class DataProcessor {
    private final Database database;

    public DataProcessor(Database database) {
        this.database = database;
    }

    public void processData(String data) {
        // process data
        database.save(data);
    }
}
```
In this example, we have a Database interface with a save() method, which defines the behavior of a database. We also have two classes that implement this interface: MySQLDatabase and PostgreSQLDatabase.

We have a DataProcessor class that has a dependency on a Database interface. This class takes a Database object as a constructor parameter, which allows us to inject the specific implementation of the database that we want to use.

By adhering to the DIP, we can create code that is more flexible and easier to maintain. The DataProcessor class is not tightly coupled to any specific implementation of the database, which means we can easily swap out the database implementation with a different one if needed without affecting the DataProcessor class.































## Acknowledgements

 - [Awesome Readme Templates](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
 - [Awesome README](https://github.com/matiassingers/awesome-readme)
 - [How to write a Good readme](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)


## API Reference

#### Get all items

```http
  GET /api/items
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

#### Get item

```http
  GET /api/items/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |

#### add(num1, num2)

Takes two numbers and returns the sum.


## Appendix

Any additional information goes here

## Color Reference

| Color             | Hex                                                                |
| ----------------- | ------------------------------------------------------------------ |
| Example Color | ![#0a192f](https://via.placeholder.com/10/0a192f?text=+) #0a192f |
| Example Color | ![#f8f8f8](https://via.placeholder.com/10/f8f8f8?text=+) #f8f8f8 |
| Example Color | ![#00b48a](https://via.placeholder.com/10/00b48a?text=+) #00b48a |
| Example Color | ![#00d1a0](https://via.placeholder.com/10/00b48a?text=+) #00d1a0 |


## Contributing

Contributions are always welcome!

See `contributing.md` for ways to get started.

Please adhere to this project's `code of conduct`.


## Demo

Insert gif or link to demo


## Badges

Add badges from somewhere like: [shields.io](https://shields.io/)

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)
[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/licenses/)
[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](http://www.gnu.org/licenses/agpl-3.0)


![Logo](https://dev-to-uploads.s3.amazonaws.com/uploads/articles/th5xamgrr6se0x5ro4g6.png)


## License

[MIT](https://choosealicense.com/licenses/mit/)


## Support

For support, email fake@fake.com or join our Slack channel.


## Tech Stack

**Client:** React, Redux, TailwindCSS

**Server:** Node, Express


## Authors

- [@octokatherine](https://www.github.com/octokatherine)

