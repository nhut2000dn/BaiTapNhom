package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepositPage {
    private WebDriver driver;
    private By AccountNoTxt = By.name("accountno");
    private By AmountTxt = By.name("ammount");
    private By DescriptionTxt = By.name("desc");
    private By SubmitButton = By.name("AccSubmit");
    private By ResetButton = By.name("res");

    public DepositPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setAccountNoTxt(String accountNoTxt) {
        driver.findElement(AccountNoTxt).sendKeys(accountNoTxt);
    }

    public void setAmountTxt(String amountTxt) {
        driver.findElement(AmountTxt).sendKeys(amountTxt);
    }

    public void setDescriptionTxt(String descriptionTxt) {
        driver.findElement(DescriptionTxt).sendKeys(descriptionTxt);
    }

    public void clickSubmitButton() {
        driver.findElement(SubmitButton).click();
    }

    public void clickResetButton() {
        driver.findElement(ResetButton).click();
    }

    public void depositTest(String accountNoTxt, String amountTxt, String descriptionTxt){
        this.setAccountNoTxt(accountNoTxt);
        this.setAmountTxt(amountTxt);
        this.setDescriptionTxt(descriptionTxt);
        this.clickSubmitButton();
    }
    public void testResetButton(String accountNoTxt, String amountTxt, String descriptionTxt){
        this.setAccountNoTxt(accountNoTxt);
        this.setAmountTxt(amountTxt);
        this.setDescriptionTxt(descriptionTxt);
        this.clickResetButton();
    }
}
