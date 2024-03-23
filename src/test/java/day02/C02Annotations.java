package day02;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02Annotations {

    @Before
    public void before() {
        System.out.println("Before annotation worked");
    }

    @After
    public void after(){
        System.out.println("After method is execuded");
    }
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(
                "first test execuded"
        );
    }

    @Test
    public void test2(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(
                "first test execuded"
        );
    }


}
