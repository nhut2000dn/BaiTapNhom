package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FundTransferPage {
    private WebDriver driver;
    private By PayerAccountTxt = By.name("payersaccount");
    private By PayeeAccountTxt = By.name("payeeaccount");
    private By AmountTxt = By.name("ammount");
    private By DescriptionTxt = By.name("desc");
    private By SubmitButton = By.name("AccSubmit");
    private By ResetButton = By.name("res");

    public FundTransferPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTxt() {
        return driver.findElement(PayerAccountTxt).getText() + driver.findElement(PayeeAccountTxt).getText();
    }

    public String txtSuccesful() {
        driver.findElement(SubmitButton).click();
        return driver.findElement(By.className("heading3")).getText();
    }

    public void setPayerAccountTxt(String payerAccountTxt) {
        driver.findElement(PayerAccountTxt).sendKeys(payerAccountTxt);
    }
    public void setPayeeAccountTxt(String payeeAccountTxt) {
        driver.findElement(PayeeAccountTxt).sendKeys(payeeAccountTxt);
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

    public String fundTransferTest(String payerAccountTxt,String payeeAccountTxt, String amountTxt, String descriptionTxt){
        this.setPayerAccountTxt(payerAccountTxt);
        this.setPayeeAccountTxt(payeeAccountTxt);
        this.setAmountTxt(amountTxt);
        this.setDescriptionTxt(descriptionTxt);
        this.clickSubmitButton();
        String alertMessage= driver.switchTo().alert().getText();
        return alertMessage;
    }

    public String fundTransferTestSuccesful(String payerAccountTxt,String payeeAccountTxt, String amountTxt, String descriptionTxt){
        this.setPayerAccountTxt(payerAccountTxt);
        this.setPayeeAccountTxt(payeeAccountTxt);
        this.setAmountTxt(amountTxt);
        this.setDescriptionTxt(descriptionTxt);
        return this.txtSuccesful();
    }

    public String testResetButton(String payerAccountTxt,String payeeAccountTxt, String amountTxt, String descriptionTxt){
        this.setPayerAccountTxt(payerAccountTxt);
        this.setPayeeAccountTxt(payeeAccountTxt);
        this.setAmountTxt(amountTxt);
        this.setDescriptionTxt(descriptionTxt);
        this.clickResetButton();
        return getTxt();
    }
}
