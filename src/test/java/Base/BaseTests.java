package Base;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomeManagePage;
import pages.LoginPage;

public class BaseTests {
    private WebDriver driver;
    protected LoginPage loginPage;
    protected HomeManagePage homeManagePage;
    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
        loginPage = new LoginPage(driver);
        loginPage.setUserId("mgr123");
        loginPage.setPassword("mgr!23");
        loginPage.loginBaseTest();
        homeManagePage = new HomeManagePage(driver);
    }
    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
