package homeAssdayignment.day5;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	public void findElement() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
	}

	public void clickElement() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Santhosh3");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("1");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
	}

	public void enterText() {
		ChromeDriver driver = new ChromeDriver();
		driver.findElement(By.id("accountName")).sendKeys("Santhosh3");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("1");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	}

	public void performCommonTasks()

			throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.findElement(By.className("smallSubmit")).click();
		String Title = driver.getTitle();
		String ExpectedTitle = "Account Details | opentaps CRM";

		if (Title.equals(ExpectedTitle)) {
			System.out.println("The Title is displayed correctly");
		} else {
			System.out.println("The Title is not displayed correctly");
		}
		Thread.sleep(5000);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		BasePage Chck = new BasePage();
		Chck.findElement();
		Chck.clickElement();
		Chck.enterText();
		Chck.performCommonTasks();

	}
}
