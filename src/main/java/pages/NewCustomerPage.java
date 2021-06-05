package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerPage {

    private WebDriver driver;
    private By customerNameTxt = By.name("name");
    private By genderRadioMaleTxt = By.xpath("//tbody/tr[5]/td[2]/input[1]");
    private By genderRadioFemaleTxt = By.xpath("//tbody/tr[5]/td[2]/input[2]");
    private By DateOfBirthTxt = By.id("dob");
    private By AddressTxt = By.name("addr");
    private By CityTxt = By.name("city");
    private By StateTxt = By.name("state");
    private By PinTxt = By.name("pinno");
    private By TelephoneNumberTxt = By.name("telephoneno");
    private By EmailTxt = By.name("emailid");
    private By PasswordTxt = By.name("password");
    private By submitButton = By.name("sub");
    private By resetButton = By.name("res");

    public NewCustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setCustomerNameTxt(String customerName) {
        driver.findElement(customerNameTxt).sendKeys(customerName);
    }

    public void setGenderRadio(String genderRadio) {
        if (genderRadio == "male") {
            driver.findElement(genderRadioMaleTxt).click();
        } else {
            driver.findElement(genderRadioFemaleTxt).click();
        }
    }

    public void setCustomerDateOfBirthTxt(String dateOfBirth) {
        driver.findElement(DateOfBirthTxt).sendKeys(dateOfBirth);
    }

    public void setCustomerAddressTxt(String addressTxt) {
        driver.findElement(AddressTxt).sendKeys(addressTxt);
    }

    public void setCityTxt(String cityTxt) {
        driver.findElement(CityTxt).sendKeys(cityTxt);
    }

    public void setStateTxt(String stateTxt) {
        driver.findElement(StateTxt).sendKeys(stateTxt);
    }

    public void setPinTxt(String pinTxt) {
        driver.findElement(PinTxt).sendKeys(pinTxt);
    }

    public void setTelephoneNumberTxt(String telephoneNumberTxt) {
        driver.findElement(TelephoneNumberTxt).sendKeys(telephoneNumberTxt);
    }

    public void setEmailTxt(String emailTxt) {
        driver.findElement(EmailTxt).sendKeys(emailTxt);
    }

    public void setPasswordTxt(String passwordTxt) {
        driver.findElement(PasswordTxt).sendKeys(passwordTxt);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

    public void clickReset() {
        driver.findElement(resetButton).click();
    }

    public void newCustomer(String customerName, String genderRadio, String dateOfBirth, String addressTxt, String cityTxt, String stateTxt, String pinTxt, String telephoneNumberTxt, String emailTxt, String passwordTxt){
        this.setCustomerNameTxt(customerName);
        this.setGenderRadio(genderRadio);
        this.setCustomerDateOfBirthTxt(dateOfBirth);
        this.setCustomerAddressTxt(addressTxt);
        this.setCityTxt(cityTxt);
        this.setStateTxt(stateTxt);
        this.setPinTxt(pinTxt);
        this.setTelephoneNumberTxt(telephoneNumberTxt);
        this.setEmailTxt(emailTxt);
        this.setPasswordTxt(passwordTxt);
        this.clickSubmit();
    }

    public void testResetButton(String customerName, String genderRadio, String dateOfBirth, String addressTxt, String cityTxt, String stateTxt, String pinTxt, String telephoneNumberTxt, String emailTxt, String passwordTxt){
        this.setCustomerNameTxt(customerName);
        this.setGenderRadio(genderRadio);
        this.setCustomerDateOfBirthTxt(dateOfBirth);
        this.setCustomerAddressTxt(addressTxt);
        this.setCityTxt(cityTxt);
        this.setStateTxt(stateTxt);
        this.setPinTxt(pinTxt);
        this.setTelephoneNumberTxt(telephoneNumberTxt);
        this.setEmailTxt(emailTxt);
        this.setPasswordTxt(passwordTxt);
        this.clickReset();
    }


}
