package day9;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class c05KeyBoardActions extends TestBase {


    @Test
    public void sliderTest(){
        By slider = By.xpath("//div[@class='range-slider vertical-range']//span[1]");

        driver.get("https://demoqa.com/auto-complete");
        WebElement textBox = driver.findElement(slider);
        actions
                .click(textBox)
                .keyDown(Keys.SHIFT)
                .build()
                .perform();

    }
}
