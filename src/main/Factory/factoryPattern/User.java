package factoryPattern;

import org.openqa.selenium.WebDriver;

public class User {

	
	
public static void main(String[] args) {
	
	WebDriver driver = DriverFactory.getDriver(BrowserType.CHROME);
	driver.get("https://www.google.com");
}

}
