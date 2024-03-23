package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05WindowsCommands {
   /*
   🡪 Go to the Amazon URL : https://www.amazon.com/
   🡪 Print the position and size of the page.
   🡪 Adjust the position and size of the page as desired.
   🡪 Test that the page is in the position and size you want.
   🡪 Close the page.
    */

    public static void main(String[] args) {

        WebDriver drive = new ChromeDriver();
        // 🡪 Go to the Amazon URL : https://www.amazon.com/
        drive.get("https://clarusway.getlearnworlds.com/path-player?courseid=sda-fs-automation-engineer-0124&unit=65ca50c8b03e4244350f908cUnit");

/*
        // 🡪 Print the position and size of the page.
        System.out.println(driver.manage().window().getPosition().toString());
        System.out.println(driver.manage().window().getSize().toString());

        // 🡪 Adjust the position and size of the page as desired.
        Point newPosition = new Point(-1600,150); // We can prepare coordinate before
        Dimension newSize = new Dimension(1500,800);

        driver.manage().window().setSize(newSize);
        Thread.sleep(1000);
        driver.manage().window().setSize(new Dimension(1000,500));
        Thread.sleep(1000);
        driver.manage().window().setPosition(newPosition);
        Thread.sleep(1000);
        driver.manage().window().setPosition(new Point(-800,300));// If we want we can write coordinate like this also
        // 🡪 Test that the page is in the position and size you want.

        // 🡪 Close the page.
        driver.quit();*/
//الكود اللي تحت يجيب السورس كود للصفحة او الصفحات اللي فوق
      System.out.println("drive.getPageSource()" + drive.getPageSource());
    }
}