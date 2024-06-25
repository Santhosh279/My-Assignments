package week2.homework2;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InteractionswithCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// InteractionswithCheckboxes

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		Thread.sleep(2000);
		WebElement check = driver.findElement(By.xpath("//span[text()='Checked']"));
		if ("Checked".equals(check.getText())) {
			System.out.println("The expected message is displayed");
		}
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]"))
				.click();

		Thread.sleep(2000);
		WebElement tristate = driver
				.findElement(By.xpath("//span[contains(@class,'ui-chkbox-icon ui-c')]/parent::div"));
		tristate.click();
		String checkbox = tristate.getAttribute("class");
		boolean isSelected = checkbox.contains("ui-state-active");
		System.out.println(isSelected + " tri-state option has been chosen");
		WebElement Toggle = driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget']"));
		Toggle.click();
		String toggleswitch = Toggle.getAttribute("class");
		boolean togglecheckbox = toggleswitch.contains("ui-toggleswitch-checked");
		System.out.println(togglecheckbox + " Toggle checkbox is displayed");
		WebElement checkboxdisabled = driver
				.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]"));
		boolean verifychckbox = checkboxdisabled.isDisplayed();
		System.out.println(verifychckbox + " The checkbox is Disabled");
		WebElement multiple = driver.findElement(By.xpath(
				"//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']"));
		multiple.click();
		Thread.sleep(2000);
		WebElement Miami = driver.findElement(By.xpath("//li/label[text()='Miami']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Miami);
		Miami.click();

		driver.findElement(By.xpath("//li/label[text()='London']")).click();

		driver.close();
	}

}
