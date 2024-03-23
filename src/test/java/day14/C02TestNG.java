package day14;


import org.testng.Assert;
import org.testng.annotations.Test;

//import org.junit.Test;

public class C02TestNG {

    @Test(description = "this is test01")
    public void b(){
        System.out.println("Test01 has executed");
    }

    @Test(timeOut = 900 , description = "this is test02")
    public void a() throws InterruptedException {
        Thread.sleep(600);
        System.out.println("Test02 has executed");
    }
}