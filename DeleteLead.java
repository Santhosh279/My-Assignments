package week2.homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// Delete Lead

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input"))
				.sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		WebElement FindLeads = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		FindLeads.click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[contains(@name,'phoneNumber')]")).sendKeys("11L");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		WebElement LeadID = driver.findElement(By.xpath("(//table/tbody/tr/td/div/a[@class='linktext'])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LeadID);
		String Checklead = LeadID.getText();
		System.out.println("The Lead id is  " + Checklead);
		LeadID.click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		WebElement capturedLeadId = driver
				.findElement(By.xpath("(//div[@class='x-form-item x-tab-item']/div/input)[1]"));
		capturedLeadId.sendKeys(Checklead);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);

		WebElement NoRecords = driver.findElement(By.xpath("//div[contains(@class, 'small-editor')]/div"));
		String Presence = NoRecords.getText();
		Presence.equals("No records to display");

		System.out.println("No records :  " + Presence);
		Thread.sleep(5000);
		driver.close();
	}

}
