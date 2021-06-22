package com.openCart.qa.base;
import com.openCart.qa.Utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void initialization() {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();}

    @AfterTest
    public void cleanUp() {
        driver.quit();}}
