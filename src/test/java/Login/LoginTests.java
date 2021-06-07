package Login;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginTests {
    private WebDriver driver;
    protected LoginPage loginPage;
    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }

    @Test
    @DisplayName("TC003- Login (resetButton)")
    public void testLoginFail2() {
        String text = loginPage.resetButton("ssssssss", "sssssssss");
        Assertions.assertTrue(text.contains(""));
    }

    @Test
    @DisplayName("TC002- Login Fail (Invalid)")
    public void testLoginFail1 () {
        String alert = loginPage.testLogin("nhutpro", "sssss");
        Assertions.assertTrue(alert.contains("User or Password is not valid"));
    }

    @Test
    @DisplayName("TC001- Login successfully")
    public void testLoginSuccessful() {
        String txt = loginPage.testLoginSuccesfull("mgr123", "mgr!23");
        Assertions.assertTrue(txt.contains("Welcome To Manager's Page of Guru99 Bank"));
    }

    public static void main(String[] args) {
        LoginTests test = new LoginTests();
        test.setUp();
    }
}
