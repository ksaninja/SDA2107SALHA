package day10;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.awt.*;
import java.awt.event.KeyEvent;

public class C03RobotClass extends TestBase {

    @Test
    public void test() throws InterruptedException, AWTException {

driver.get("https://ebay.com");

        Robot robot = new Robot();
        WebElement screenBox = driver.findElement(By.id("gh-ac"));
        screenBox.click();
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(2500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.mouseWheel(35);
    }





}
