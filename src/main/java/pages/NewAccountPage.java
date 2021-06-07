package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountPage {

    private WebDriver driver;
    private By CustomerIdTxt = By.name("cusid");
    private By SelectTypeCustomer = By.name("selaccount");
    private By InitialDepositTxt = By.name("inideposit");
    private By SubmitButton = By.name("button2");
    private By ResetButton = By.name("reset");

    public NewAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setCustomerIdTxt(String customerIdTxt) {
        driver.findElement(CustomerIdTxt).sendKeys(customerIdTxt);
    }

    public String getTxt() {
        return driver.findElement(CustomerIdTxt).getText() + driver.findElement(InitialDepositTxt).getText();
    }

    public String txtSuccesful() {
        driver.findElement(SubmitButton).click();
        return driver.findElement(By.className("heading3")).getText();
    }

    public void setSelectTypeCustomer(String selectTypeCustomer) {
        driver.findElement(SelectTypeCustomer).sendKeys(selectTypeCustomer);
    }

    public void setInitialDepositTxt(String initialDepositTxt) {
        driver.findElement(InitialDepositTxt).sendKeys(initialDepositTxt);
    }

    public void clickSubmitButton() {
        driver.findElement(SubmitButton).click();
    }

    public void clickResetButton() {
        driver.findElement(ResetButton).click();
    }

    public String newAccount(String customerIdTxt, String selectTypeCustomer, String initialDepositTxt){
        this.setCustomerIdTxt(customerIdTxt);
        this.setSelectTypeCustomer(selectTypeCustomer);
        this.setInitialDepositTxt(initialDepositTxt);
        this.clickSubmitButton();
        String alertMessage= driver.switchTo().alert().getText();
        return alertMessage;
    }

    public String newAccountSuccesfull(String customerIdTxt, String selectTypeCustomer, String initialDepositTxt){
        this.setCustomerIdTxt(customerIdTxt);
        this.setSelectTypeCustomer(selectTypeCustomer);
        this.setInitialDepositTxt(initialDepositTxt);
        return this.txtSuccesful();
    }

    public String testResetButton(String customerIdTxt, String selectTypeCustomer, String initialDepositTxt){
        this.setCustomerIdTxt(customerIdTxt);
        this.setSelectTypeCustomer(selectTypeCustomer);
        this.setInitialDepositTxt(initialDepositTxt);
        this.clickResetButton();
        return getTxt();
    }
}
