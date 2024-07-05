package homeAssignement.day6;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://finance.yahoo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Accept = driver.findElement(By.xpath("//button[text()='Accept all']"));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", Accept);

		WebElement Market = driver.findElement(By.xpath("//span[text()='Markets']/../.."));
		Actions act = new Actions(driver);
		act.moveToElement(Market).perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement Crypto = driver.findElement(By.xpath("(//div[text()='Crypto'])[2]"));

		wait.until(ExpectedConditions.visibilityOf(Crypto));
		Crypto.click();
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr/td[@aria-label='Symbol']/.."));
		int Totalrows = rows.size();
		System.out.println(Totalrows);

		for (int i = 1; i < Totalrows; i++) {
			String cryptocurrencyNames = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[2]")).getText();
			System.out.println(cryptocurrencyNames);

		}

	}

}
