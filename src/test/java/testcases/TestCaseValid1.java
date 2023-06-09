package testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

class TestCasevalid1 {
    WebDriver driver=null;
    @BeforeMethod
    public void setUp(){
        String url = "https://www.facebook.com/";
        String chromeDriverPath = "C:\\Software\\chromeDriver_v113\\chromeDriver\\chromedriver.exe";
        System.setProperty("WebDriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.get(url);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void searchComputerUsingAlphabet() throws InterruptedException {
//        ChromeOptions options = new ChromeOptions();
//        HashMap<String, Integer> consentSettings = new HashMap<String, Integer>();
//        HashMap<String , Object> profile = new HashMap<String, Object>();
//        HashMap<String, Object> prefs = new HashMap<String , Object>();
//
//        consentSettings.put("notifications", 2);
//        profile.put("managed_default_content_settings", consentSettings);
//        prefs.put("profile", profile);
//        options.setExperimentalOption("prefs", prefs);
//        WebDriverManager.chromedriver().setup();
//        //options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver();
        String searchText="8688055719";
        String searchText1="Selenium@1234";
        String expectedMessage = "Valid";
        HomePage hp = new HomePage(driver);
        hp.setSearchText(searchText);
        hp.setSearchText(searchText1);
        hp.clickSearchButton();
        Thread.sleep(5000);

    }
}