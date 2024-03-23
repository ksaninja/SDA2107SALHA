package day11;

//
//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import utilities.TestBase;
//
//import java.nio.file.FileSystems;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//public class C03FileDownload extends TestBase {
//
//    @Test
//    public void test() throws InterruptedException {
//        //    Go to URL: https://the-internet.herokuapp.com/download
//        driver.get("https://the-internet.herokuapp.com/download");
//
//        //    Download selenium-snapshot.png
//        driver.findElement(By.linkText("selenium-snapshot.png")).click();
//        Thread.sleep(500);
//        //    Verify if the file downloaded successfully.
//
//        String s = "/Users/salha/Downloads";
//        String separates = FileSystems.getDefault().getSeparator();
//        String pathOfFile = System.getProperty("user.home")+ separates+"Downloads"+separates+"selenium-snapshot.png";
//
//        boolean isExist = Files.exists(Paths.get(pathOfFile));
//        Assert.assertTrue(isExist);
//
//    }
//}