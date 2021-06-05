package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userIdTxt = By.name("uid");
    private By passwordTxt = By.name("password");
    private By loginButton = By.name("btnLogin");
    private By resetButton = By.name("btnReset");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserId(String userId) {
        driver.findElement(userIdTxt).sendKeys(userId);
    }
    public void setPassword(String password) {
        driver.findElement(passwordTxt).sendKeys(password);
    }

    public void clickLoginTest() {
        driver.findElement(loginButton).click();
    }

    public void clickResetTest() {
        driver.findElement(resetButton).click();
    }

    public void testLogin(String userIdTxt, String passwordTxt) {
        setUserId(userIdTxt);
        setPassword(passwordTxt);
        clickLoginTest();
    }

    public void resetButton(String userIdTxt, String passwordTxt) {
        setUserId(userIdTxt);
        setPassword(passwordTxt);
        clickResetTest();
    }

    public HomeManagePage loginBaseTest() {
        driver.findElement(loginButton).click();
        return new HomeManagePage(driver);
    }
}
