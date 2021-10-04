package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://qatest.qa-igt.reztrip3-qa.com/classic/en/searches/6149b11402190c4a565a52a6/hotels/h1qa1/rooms?currency=USD#category=");
        driver.manage().window().maximize();

        WebElement arDate=driver.findElement(By.id("search_arrival_date"));
        arDate.clear();
        arDate.sendKeys("09/30/2021");
        WebElement deDate = driver.findElement(By.id("search_departure_date"));
        deDate.clear();
        deDate.sendKeys("10/01/2021");

        driver.findElement(By.id("check-availability-btn")).click();
        Thread.sleep(11000);
        driver.findElement(By.id("check-availability-btn")).click();
//        driver.findElement(By.xpath("(//a[contains(@class,'rooms-list-link none-outline')])[2]")).click();
        driver.findElement(By.xpath("//button[text()=\"Book now\"]")).click();

        driver.findElement(By.id("booking_first_name")).sendKeys("dd");
        driver.findElement(By.id("booking_last_name")).sendKeys("k");
        driver.findElement(By.id("booking_email")).sendKeys("dks@gmail.com");
        driver.findElement(By.xpath("//button[text()=\"Confirm details\"]")).click();

        driver.findElement(By.id("card_holder_name")).sendKeys("ADC");
        driver.findElement(By.id("card_number")).sendKeys("4067888888885832");
        driver.findElement(By.id("expiration_date_month")).sendKeys("09");
        driver.findElement(By.id("expiration_date_year")).sendKeys("2024");
        driver.findElement(By.id("security_code")).sendKeys("123");

        driver.findElement(By.id("booking_country")).sendKeys("India");
        driver.findElement(By.id("booking_street_address1")).sendKeys("Chennai");
        driver.findElement(By.id("booking_city")).sendKeys("Chennai");
        driver.findElement(By.id("booking_state")).sendKeys("Tamil Nadu");
        driver.findElement(By.id("booking_zip_code")).sendKeys("600044");
        driver.findElement(By.id("booking_phone_number")).sendKeys("9876522212");
        driver.findElement(By.id("accept")).click();
        driver.findElement(By.id("submit-booking")).click();



//        driver.quit();
	}
}
