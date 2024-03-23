package day02;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01Junit {

    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @Test
    public void test2(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @Test
    public void test3(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }
}
