package day8;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import utilities.TestBase;

public class C03BaseClass extends TestBase {

    static WebDriver driver;

    @Test
    public void test(){
        driver.get("https://google.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }

    @Test
    public void test2(){
        driver.get("https://clarusway.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
    @Test
    public void test3(){
        driver.get("https://amazon.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
}














