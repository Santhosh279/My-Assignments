package homeAssignment.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Create Accounts
		
		//dsd
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Santhosh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vijayan");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTaps");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1");

		WebElement tile = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		tile.sendKeys("MR");
		driver.findElement(By.className("smallSubmit")).click();
		WebElement title = driver.findElement(By.id("viewLead_generalProfTitle_sp"));

		if ("MR".equals(title.getText())) {
			System.out.println("The Title is displayed correctly " + title.getText());
			Thread.sleep(5000);
			driver.close();

		}

	}

}
