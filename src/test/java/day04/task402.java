package day04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class task402 {



    @Test
            public void test402() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("da@test.com");
        driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("sdainclasstask");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();


    }}