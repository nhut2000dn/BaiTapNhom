package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomisedStatementPage {
    private WebDriver driver;
    private By AccountNoTxt = By.name("accountno");
    private By FromDateTxt = By.name("fdate");
    private By ToDateTxt = By.name("tdate");
    private By AmountLowerLimitTxt = By.name("amountlowerlimit");
    private By NumTransactionTxt = By.name("numtransaction");
    private By SubmitButton = By.name("AccSubmit");
    private By ResetButton = By.name("res");

    public CustomisedStatementPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTxt() {
        return driver.findElement(AccountNoTxt).getText() + driver.findElement(AmountLowerLimitTxt).getText();
    }

    public String txtSuccesful() {
        driver.findElement(SubmitButton).click();
        return driver.findElement(By.className("heading3")).getText();
    }

    public void setAccountNoTxt(String accountNoTxt) {
        driver.findElement(AccountNoTxt).sendKeys(accountNoTxt);
    }

    public void setFromDateTxt(String fromDateTxt) {
        driver.findElement(FromDateTxt).sendKeys(fromDateTxt);
    }

    public void setToDateTxt(String toDateTxt) {
        driver.findElement(ToDateTxt).sendKeys(toDateTxt);
    }

    public void setAmountLowerLimitTxt(String amountLowerLimitTxt) {
        driver.findElement(AmountLowerLimitTxt).sendKeys(amountLowerLimitTxt);
    }

    public void setNumTransactionTxt(String numTransactionTxt) {
        driver.findElement(NumTransactionTxt).sendKeys(numTransactionTxt);
    }

    public void clickSubmit() {
        driver.findElement(SubmitButton).click();
    }

    public void clickReset() {
        driver.findElement(ResetButton).click();
    }

    public String customisedStatement(String accountNoTxt, String fromDateTxt, String toDateTxt, String amountLowerLimitTxt, String numTransactionTxt){
        this.setAccountNoTxt(accountNoTxt);
        this.setFromDateTxt(fromDateTxt);
        this.setToDateTxt(toDateTxt);
        this.setAmountLowerLimitTxt(amountLowerLimitTxt);
        this.setNumTransactionTxt(numTransactionTxt);
        this.clickSubmit();
        String alertMessage= driver.switchTo().alert().getText();
        return alertMessage;
    }

    public String customisedStatementSuccesful(String accountNoTxt, String fromDateTxt, String toDateTxt, String amountLowerLimitTxt, String numTransactionTxt){
        this.setAccountNoTxt(accountNoTxt);
        this.setFromDateTxt(fromDateTxt);
        this.setToDateTxt(toDateTxt);
        this.setAmountLowerLimitTxt(amountLowerLimitTxt);
        this.setNumTransactionTxt(numTransactionTxt);
        return this.txtSuccesful();
    }

    public String testResetButton(String accountNoTxt, String fromDateTxt, String toDateTxt, String amountLowerLimitTxt, String numTransactionTxt){
        this.setAccountNoTxt(accountNoTxt);
        this.setFromDateTxt(fromDateTxt);
        this.setToDateTxt(toDateTxt);
        this.setAmountLowerLimitTxt(amountLowerLimitTxt);
        this.setNumTransactionTxt(numTransactionTxt);
        this.clickReset();
        return getTxt();
    }
}
