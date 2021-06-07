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

    public String getTxt() {
        driver.findElement(loginButton).click();
        return driver.findElement(By.className("heading3")).getText();
    }

    public void clickResetTest() {
        driver.findElement(resetButton).click();
    }

    public String getText() {
        return driver.findElement(userIdTxt).getText() + driver.findElement(passwordTxt).getText();
    }

    public String testLogin(String userIdTxt, String passwordTxt) {
        setUserId(userIdTxt);
        setPassword(passwordTxt);
        clickLoginTest();
        String alertMessage= driver.switchTo().alert().getText();
        return alertMessage;
    }

    public String testLoginSuccesfull(String userIdTxt, String passwordTxt) {
        setUserId(userIdTxt);
        setPassword(passwordTxt);
        String txt = getTxt();
        return txt;
    }

    public String resetButton(String userIdTxt, String passwordTxt) {
        setUserId(userIdTxt);
        setPassword(passwordTxt);
        clickResetTest();
        return getText();
    }

    public HomeManagePage loginBaseTest() {
        driver.findElement(loginButton).click();
        return new HomeManagePage(driver);
    }
}
