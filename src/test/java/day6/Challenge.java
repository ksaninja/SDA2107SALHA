package day6;



import com.github.javafaker.Faker;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Challenge {
    static WebDriver driver;
    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://thinking-tester-contact-list.herokuapp.com");
    }

    @AfterClass
    public static void tearDown() {
        // driver.quit();
    }
    @Test
    public void test() {

        WebElement element=  driver.findElement(By.id("email"));
        element.sendKeys("sda232@gmail.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("sda@321");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        WebElement addContact = driver.findElement(By.id("add-contact"));
        addContact.click();

        //WebElement cancel = driver.findElement(By.id("cancel"));
        //Assert.assertTrue(cancel.isDisplayed());

        WebElement Title = driver.findElement(By.xpath("//h1[text()='Add Contact']"));
        Assert.assertTrue(Title.isDisplayed());

        Faker faker = new Faker();

        //

        String first = faker.name().firstName();
        WebElement firstname=  driver.findElement(By.id("firstName"));
        firstname.sendKeys(first);

        WebElement lastname=  driver.findElement(By.id("lastName"));
        lastname.sendKeys(faker.name().lastName());

        WebElement DOF= driver.findElement(By.id("birthdate"));
        DOF.sendKeys("1997-04-26");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys(faker.internet().emailAddress());

        WebElement phone = driver.findElement(By.id("phone"));
        phone.sendKeys(faker.phoneNumber().cellPhone());

        WebElement address1=  driver.findElement(By.id("street1"));
        address1.sendKeys(faker.address().streetName());

        WebElement address2 =  driver.findElement(By.id("street2"));
        address2.sendKeys(faker.address().streetAddress());

        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys(faker.address().city());

        WebElement state = driver.findElement(By.id("stateProvince"));
        state.sendKeys(faker.address().state());

        WebElement postal = driver.findElement(By.id("postalCode"));
        postal.sendKeys(faker.address().zipCode());

        WebElement country = driver.findElement(By.id("country"));
        country.sendKeys(faker.address().country());

        WebElement submit1 = driver.findElement(By.id("submit"));
        submit1.click();

        WebElement create = driver.findElement(By.xpath("//tr[1]//td[2]"));
        Assert.assertEquals(create.getText(), first);
    }
}
