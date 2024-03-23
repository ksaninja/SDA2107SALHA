package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWD11q2 {

//    Go to URL: https://opensource-demo.orangehrmlive.com/
//    Login page valid credentials.
//    Click PIM on the left side bar
//    Click Configuration and select Data Import
//    Download sample CSV file.
//    Verify if the file downloaded successfully.
public static void main(String[] args) {

    //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

    WebDriver driver = new ChromeDriver();

    try {

        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(2000);


        driver.findElement(By.xpath("//input[@name ='username']")).sendKeys("Admin");

//        driver.findElement(By.cssSelector("data-v-957b4417")).sendKeys("Admin");

        // driver.findElement(By.id("password")).sendKeys("admin123");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
driver.findElement(By.cssSelector("input[]"));

//         driver.findElement(By.id("btnLogin")).click();
        //
        driver.findElement(By.cssSelector("button[type='submit']")).click();


        Thread.sleep(5000);


        //driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.cssSelector("oxd-main-menu-item")).click();


//        driver.findElement(By.cssSelector("oxd-topbar-body-nav-tab-item")).click();
//        driver.findElement(By.cssSelector("oxd-topbar-body-nav-slot")).click();



    }
    catch (Exception e) {
        System.out.println("Error occurred: " + e.getMessage());
    }
    finally {
        // Close the browser window
        driver.quit();
    }
}


}
