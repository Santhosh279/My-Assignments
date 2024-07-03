package week3.day3;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsIrctc {

	public static void main(String[] args) {
		// IRCTC
		
		ChromeOptions Options =new ChromeOptions();
		Options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(Options);
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[@class='fc-button-label']")).click();
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		String CurrentWindow = driver.getWindowHandle();
		Set<String> FlightWindows = driver.getWindowHandles();
		List<String> NewWindow=new ArrayList<String>(FlightWindows);
		driver.switchTo().window(NewWindow.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(NewWindow.get(0));
		driver.close();
		

	}

}
