package day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.w3c.dom.ls.LSOutput;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class homework1 {


    /*
Create main method
Create chrome driver
Open google home page: https://www.google.com
Print Title on page
Print Current URL on page
Close/Quit the browser
*/



// Differences between get() method and navigate to() method?



 /*
Invoke Chrome Driver
Navigate to Facebook homepage URL: https://www.facebook.com/
Verify expected URL equals to the actual URL.
Verify  pagesource of FaceBook contains "Facebook" .
     */

    public static void main(String[] args)    {
        WebDriver drive = new ChromeDriver();

       // Thread.sleep(1000);


        drive.get("https://www.google.com");

       // Thread.sleep(1000);


        System.out.println("drive.getTitle()" + drive.getTitle());

       // Thread.sleep(1000);
        System.out.println("drive.getCurrentUrl()" + drive.getCurrentUrl());



       // drive.quit();
        //driver.quit();





    }


}
