package day8;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EngEmirChallange {

   // https://clarusway.getlearnworlds.com/sda-test-registration-form


        private WebDriver driver;

        @Before
        public void setup() {
            driver = new ChromeDriver();
            driver.get("https://clarusway.getlearnworlds.com/sda-test-registration-form");
        }

        @Test
        public void testFormElements(){
            // Locate the text field by ID for each element

            //  WebElement fullNameField = driver.findElement(By.id("userName"));
            //هذي طريقة ايجاد المصدر والمسار الصحيح للفريم بحيث نوصله من خلال الوصول الى الاي فريم اولا وتعديه ثم وضع الرابط من سورس الصفحة

            WebElement frame = driver.findElement(By.xpath("//iframe[@src='https://forms.zohopublic.sa/jax/form/SDAIframeTest/formperma/vrtMXZLVMnJ-nrW1-ySCTRltTyLq-7vxreHapArZJdc']"));

            driver.switchTo().frame(frame);

            //first name:
           WebElement name = driver.findElement(By.id("antispam-url-id"));
        }
           // @Test
            public void uRLTest(){
              //  String expectedUrl = "https://www..com/";
                String actualUrl = driver.getCurrentUrl();
                //Assert.assertEquals(expectedUrl,actualUrl);
                Assert.assertTrue(actualUrl.contains("sda"));

            }

    public void testName() {
        // Locate the text input field by ID
        WebElement element1 = driver.findElement(By.xpath("//1"));
       // fullNameField
        // Enter text into the field
        element1.sendKeys("Salha");
      //  System.out.println("done1");
       // Thread.sleep(1000);
        String actualText = element1.getAttribute("value");
        org.junit.Assert.assertEquals("Salha", actualText);
       // System.out.println("done2");
        WebElement element2 = driver.findElement(By.id("//ariarequired-Name1"));
        element2.sendKeys("Aqeel");
       // System.out.println("done3");
        actualText = element2.getAttribute("value");
        org.junit.Assert.assertEquals("Aqeel", actualText);
        //System.out.println("done4");
    }

     //       @Test
            public void titleTest() throws InterruptedException {
            Thread.sleep(1000);
                String title =driver.getTitle();
                assertFalse(title.contains("sda"));
            //    System.out.println("donnnnne");
                WebElement text = driver.findElement(By.linkText("sda"));
                Assert.assertTrue(text.isDisplayed());
                System.out.println("donnnnne");
            }

   //        @Test
            public void logoTest(){
                WebElement logo =driver.findElement(By.id("el_1593094758324_16"));
                assertTrue(logo.isDisplayed());
           //     System.out.println("donnnnne");
            }


            //radio list
            public void radioTest() throws InterruptedException {
                Thread.sleep(1000);
                //id=Radio-li
                //    System.out.println("donnnnne");

            }

    //drop list
    public void dropTest() throws InterruptedException {
        Thread.sleep(1000);

        //    System.out.println("donnnnne");

    }

            /*

            // Enter text
            // verify
            // clear

             */

    @After
    public void teardown() {
        driver.quit();
    }
}




