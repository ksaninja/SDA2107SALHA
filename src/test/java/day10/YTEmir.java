package day10;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

import java.awt.*;
import java.awt.event.KeyEvent;

public class YTEmir extends TestBase {

    // public void nav()  throws AWTException, InterruptedException{

    // driver.get("http://youtube.com");


    //@Test
    //    public void Navyt(){

          /*  WebElement Naving = driver.findElement(By.id("search"));
            WebElement
           */
/*
            Robot robot = new Robot();
            WebElement screenBox = driver.findElement(By.id("search"));
            screenBox.click();
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyPress(KeyEvent.VK_P);
            robot.keyPress(KeyEvent.VK_P);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_P);
            robot.keyRelease(KeyEvent.VK_P);
            robot.keyRelease(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_E);
            Thread.sleep(2500);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.mouseWheel(35);*/


    public static void main(String[] args) {
        // Replace with your WebDriver implementation path
        //System.setProperty("Webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://www.youtube.com/");


            WebElement searchBar = driver.findElement(By.xpath("//input[@id='search']"));


            searchBar.click();


            searchBar.sendKeys("Let's go Home" + Keys.ENTER);


            //Thread.sleep(5000); // Replace with a more robust wait strategy


            WebElement thirdVideo = driver.findElements(By.cssSelector(".style-scope ytd-playlist-panel-renderer")).get(1);
            thirdVideo.click();
            // } catch (Exception e) {
            //    System.out.println("Error occurred: " + e.getMessage());
            // } finally {
            // Close the browser window
            //   driver.quit();
            // thirdVideo.click();
            //   thirdVideo.click();
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            // Close the browser window
            driver.quit();
        }
    }
}
   // }
        //}








//}}
