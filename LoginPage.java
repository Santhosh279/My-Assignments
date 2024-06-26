package homeAssdayignment.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends BasePage {
	
	public void performCommonTasks() throws InterruptedException {
		 {
			ChromeDriver driver= new ChromeDriver();

			driver.findElement(By.className("smallSubmit")).click();
			String Title = driver.getTitle();
			String ExpectedTitle = "Account Details | opentaps CRM";

			if (Title.equals(ExpectedTitle)) {
				System.out.println("The Title is displayed correctly");
			} else {
				System.out.println("The Title is not displayed correctly");
			}
			Thread.sleep(2000);
			driver.close();
		 }	
	}

	public static void main(String[] args) {
		// TODO Overwriding
		LoginPage verify = new LoginPage();
		verify.findElement();
		verify.clickElement();
		verify.enterText();
	}

}
