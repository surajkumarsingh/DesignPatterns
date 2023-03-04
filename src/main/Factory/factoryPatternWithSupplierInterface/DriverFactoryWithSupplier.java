package factoryPatternWithSupplierInterface;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import factoryPattern.BrowserType;

public class DriverFactoryWithSupplier {
	
	
	public static WebDriver getDriver(BrowserType browser) {
		return MAP.get(browser).get();

	}
	
	private DriverFactoryWithSupplier() {
	}
	private final static  Supplier<WebDriver> CHROME = () -> new ChromeDriver();

	private final static  Supplier<WebDriver> FIREFOX = () -> new FirefoxDriver();

	private final static Supplier<WebDriver> EDGE = () -> new EdgeDriver();
	
	private  static final Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserType.class);
	static {
		MAP.put(BrowserType.CHROME, CHROME);
		MAP.put(BrowserType.FIREFOX, FIREFOX);
		MAP.put(BrowserType.EDGE, EDGE);
	}

	
}
