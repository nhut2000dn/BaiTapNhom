package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomeManagePage {

    private WebDriver driver;
    private By formNewCustomerLink = By.linkText("New Customer");
    private By formNewAccountLink = By.linkText("New Account");
    private By formDepositLink = By.linkText("Deposit");
    private By formWithdrawalLink = By.linkText("Withdrawal");
    private By formFundTransferLink = By.linkText("Fund Transfer");
    private By formCustomisedStatementLink = By.linkText("Customised Statement");
    private By LogoutLink = By.linkText("Log out");

    public HomeManagePage(WebDriver driver) {
        this.driver = driver;
    }

    public NewCustomerPage ToLinkNewCustomerForm() {
        driver.findElement(formNewCustomerLink).click();
        return new NewCustomerPage(driver);
    }

    public NewAccountPage ToLinkNewAccountForm() {
        driver.findElement(formNewAccountLink).click();
        return new NewAccountPage(driver);
    }

    public DepositPage ToLinkDepositForm() {
        driver.findElement(formDepositLink).click();
        return new DepositPage(driver);
    }

    public WithdrawalPage ToLinkWithdrawalForm() {
        driver.findElement(formWithdrawalLink).click();
        return new WithdrawalPage(driver);
    }

    public FundTransferPage ToLinkFundTransferForm() {
        driver.findElement(formFundTransferLink).click();
        return new FundTransferPage(driver);
    }

    public CustomisedStatementPage ToLinkCustomisedStatementForm() {
        driver.findElement(formCustomisedStatementLink).click();
        return new CustomisedStatementPage(driver);
    }

    public String logout() {
        driver.findElement(LogoutLink).click();
        String alertMessage= driver.switchTo().alert().getText();
        return alertMessage;
    }
}
