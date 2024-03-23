package day02;

public class homework02 {


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
    While both get() and navigate().to() methods in Selenium WebDriver are used for navigation, they have some key differences:

    Functionality:

    get(): Opens a new URL in the browser window and waits for the entire page to load before returning control to the test script.
    navigate().to(): Opens a new URL but doesn't wait for the page to load completely before returning. It simply initiates the navigation process.
    Browser History:

    get(): Doesn't maintain the browser's history or cookies. Each call to get() is treated as a fresh start.
    navigate().to(): Maintains the browser history, allowing you to navigate back and forth using driver.navigate().back() and driver.navigate().forward(). It also preserves cookies and other session data across navigations.
    Additional Methods:

    get(): Limited to just opening URLs.
            navigate(): Provides additional methods for advanced navigation:
    refresh(): Refreshes the current page.
    back(): Navigates back one step in the browser history.
    forward(): Navigates forward one step in the browser history.
    Choosing the right method:

    Use get() when you need to:
    Open a new URL and ensure the page is fully loaded before proceeding.
    Don't care about maintaining browser history or session data.
    Use navigate().to() when you need to:
    Navigate to a URL without waiting for the full page load.
    Maintain browser history and session data for back/forward navigation or other interactions requiring previous page context.
    In essence, get() is simpler and suitable for basic navigation, while navigate() offers more flexibility and control over browser interactions.

    */

       /*
Invoke Chrome Driver
Navigate to Facebook homepage URL: https://www.facebook.com/
Verify expected URL equals to the actual URL.
Verify  pagesource of FaceBook contains "Facebook" .

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookVerification {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();

        // Navigate to Facebook homepage
        driver.get("https://www.facebook.com/");

        // Verify expected URL
        String expectedUrl = "https://www.facebook.com/";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)) {
            System.out.println("URL matches: Expected - " + expectedUrl + ", Actual - " + actualUrl);
        } else {
            System.out.println("URL mismatch! Expected: " + expectedUrl + ", Actual: " + actualUrl);
        }

        // Verify page source contains "Facebook"
        String pageSource = driver.getPageSource();
        if (pageSource.contains("Facebook")) {
            System.out.println("Page source contains 'Facebook'");
        } else {
            System.out.println("Page source does not contain 'Facebook'");
        }

        // Close the browser
        driver.quit();
    }
}
     */








}
