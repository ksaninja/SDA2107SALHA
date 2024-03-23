package day9;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class D09HW01 extends TestBase {
    /*


        Go to URL: http://demo.guru99.com/test/drag_drop.html

            */


    // Verify the visibility of Perfect text;

//    @BeforeClass
//    public static  void setUp(){
//        driver = new ChromeDriver();
//
//        Actions actions = new Actions(driver);
//        driver.get("http://demo.guru99.com/test/drag_drop.html");
//    }

    @Before
    public void testss() {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
    }

    @Test
    public void test01() throws InterruptedException {

        //    Drag and drop the BANK button to the Account section in DEBIT SIDE
        WebElement bank = driver.findElement(By.id("credit2"));
        WebElement bank2 = driver.findElement(By.id("bank"));

        actions.dragAndDrop(bank, bank2).perform();

        //  Drag and drop the SALES button to the Account section in CREDIT SIDE
        WebElement Sales = driver.findElement(By.id("credit1"));
        WebElement Sales0 = driver.findElement(By.id("loan"));

        actions.dragAndDrop(Sales, Sales0).perform();

        WebElement five = driver.findElement(By.id("fourth"));
        WebElement fives = driver.findElement(By.id("amt7"));

        actions.dragAndDrop(five, fives).perform();

        //        Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
        WebElement fiv2 = driver.findElement(By.id("fourth"));
        WebElement fiv22 = driver.findElement(By.id("amt8"));

        actions.dragAndDrop(fiv2, fiv22).perform();


    }
}