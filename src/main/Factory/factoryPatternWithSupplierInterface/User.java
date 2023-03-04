package factoryPatternWithSupplierInterface;

import org.openqa.selenium.WebDriver;

import factoryPattern.BrowserType;

public class User {

	
	
public static void main(String[] args) {
	
	WebDriver driver = DriverFactoryWithSupplier.getDriver(BrowserType.CHROME);
	driver.get("https://www.google.com");
}

}
