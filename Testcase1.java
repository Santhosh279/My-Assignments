package testingMarathon.Week1;

import java.util.ArrayList;
import java.util.LinkedList;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cinema")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Select Date']"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='p-dropdown-items-wrapper']/ul/li[2]")));
		element.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Select Movie']"));
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[8]")).click();
		driver.findElement(By.xpath("//span[text()='Select Timing']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement timing = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//div[@class='p-dropdown-items-wrapper']/ul/li)[1]")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		timing.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("(//tr//td//span[text()='12'])[9]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		String seatinfo1 = driver.findElement(By.xpath("//div[@class='seat-info']/h6/following-sibling::p")).getText();
		System.out.println(seatinfo1);
		String Seatinfo2 = driver.findElement(By.xpath("//div[@class='select-seat-number']")).getText();
		System.out.println(Seatinfo2);
		String grandTotal = driver.findElement(By.xpath("//div[@class='grand-prices']/h6")).getText();
		System.out.println("The GrandTotal is " + grandTotal);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("(//input[@id='mobileInput'])[2]")).sendKeys("9962542500l");
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("(//div[@class='mobile'])[2]//span//input/following-sibling::label/following::button"))
				.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		WebElement autoFillPage = driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]//span//i"));
		autoFillPage.click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
