package day6;
/*
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class test6 {

// Some websites introduce waiting times between operations; hence, we use waiting methods.
// Selenium waits are a critical concept for synchronized locating of elements and preventing errors like elementnotfound.

// Implicit Wait
// Explicit Wait *
// Fluent Wait

    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

    @Test
    public void hardWait() {

        // unconditional synchronization - static wait
        // static wait shows the timeout value on its own and allows the tool to proceed only when the specified time has elapsed
        // We use Thread.sleep() method in Java with Selenium to provide static waiting.


    }
    @Test
    public void pageLoadTimeout() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.MICROSECONDS);
        // Wait for the page to load for 30 seconds, if it doesn't load within this time, it throws a timeout error
        // It waits for the page to be completely loaded for the specified time.


    }

    @Test
    public void implicitWait() {
    /* Implicit wait:
   It assigns a waiting time for all elements. However, it does not wait longer once the element is found.
   It waits up to the specified time to avoid NoSuchElement errors for all elements.
   It is global, waits for all web elements.
     *//*
        driver.get("https://seleniumatfingertips.wordpress.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Test the visibility of the "Group Test in TestNg" text
        WebElement groupTxt = driver.findElement(By.linkText("Group Test in TestNG"));
        Assert.assertTrue(groupTxt.isDisplayed());
    }

    @Test
    public void explicitWait(){
    /*
    It specifies the condition and time WebDriver should wait.
    Practically, WebDriverWait and explicitly wait are synonymous since their definitions and uses perfectly match.
    //How to use Explicit wait
    // 1- Create a WebDriverWait object
    // 2- Provide the desired condition in the until method of the wait object



        // At this point, our code is in the process of loading the element,
        // it can be located but may not be clickable; in this case, ElementNotClickable error is thrown.
        // We provide the desired condition in the wait object's until method.


        // only time is defined, not active yet
        // It does not have to wait for 15 seconds; it continues as soon as the element is clickable.

        //wait.until(ExpectedConditions.visibilityOf(home)); // wait until it is visible
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Home"))); // wait until located
        // It is a local type of wait, used when implicitly wait is insufficient.
    }*/
/*
    @Test
    public void fluentWait(){
        // Almost never used.
        // It checks whether the elements satisfy the condition for the specified time.
        // It continues if the condition is met; otherwise, it throws an exception.

        driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");
        WebElement button = driver.findElement(By.id("button1"));

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10)) // total waiting time when the page is first opened
                .pollingEvery(Duration.ofSeconds(20)) // polling every 20 seconds for the presence check
                .ignoring(NoSuchElementException.class); // ignores or prevents the NoSuchElementException.
        // wait for 10 seconds for a web element to be on the page, check its presence every 20 milliseconds
}}
*/