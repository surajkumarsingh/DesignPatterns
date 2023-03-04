package stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factoryPattern.BrowserType;
import factoryPattern.DriverFactory;

public class UseStream {
	public static void main(String[] args) {

		WebDriver driver = DriverFactory.getDriver(BrowserType.CHROME);

		driver.get("https://www.amazon.com");
		/*
		 * Program to get link text, sort and filter using stream
		 */
		driver.findElements(By.xpath("//a")).stream()
		.map(e -> e.getText())
		.distinct()
		.sorted()
		.filter(t-> t.startsWith("C") || t.startsWith("D"))
		.forEach(System.out::println);	
	}
}
