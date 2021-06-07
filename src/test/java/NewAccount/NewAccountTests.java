package NewAccount;

import Base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.NewAccountPage;
import pages.NewCustomerPage;

public class NewAccountTests extends BaseTests {
    @Test
    @DisplayName("TC_012- New Account (Reset Button)")
    public void testNewCustomerResetButton() {
        NewAccountPage newCustomerPage = homeManagePage.ToLinkNewAccountForm();
        newCustomerPage.testResetButton("81675", "Savings", "400");
    }
    @Test
    @DisplayName("TC_011- New Account Fail (Invalid form)")
    public void testNewCustomerFail3() {
        NewAccountPage newCustomerPage = homeManagePage.ToLinkNewAccountForm();
        String alert = newCustomerPage.newAccount("ss", "Savings", "ss");
        Assertions.assertTrue(alert.contains("Please fill all fields"));
    }

    @Test
    @DisplayName("TC_010- New Account Fail (Uncorrect customer id)")
    public void testNewCustomerFail2() {
        NewAccountPage newCustomerPage = homeManagePage.ToLinkNewAccountForm();
        String alert = newCustomerPage.newAccount("1212121", "Savings", "500");
        Assertions.assertTrue(alert.contains("Customer does not exist!!"));
    }

    @Test
    @DisplayName("TC_009- New Account Fail (Intial deposite < 500)")
    public void testNewCustomerFail1() {
        NewAccountPage newCustomerPage = homeManagePage.ToLinkNewAccountForm();
        String alert = newCustomerPage.newAccount("81675", "Savings", "400");
        Assertions.assertTrue(alert.contains("Intial deposite must be Rs. 500 or more"));
    }

    @Test
    @DisplayName("TC_008- New Account successfully")
    public void testNewAccountSuccessful() {
        NewAccountPage newCustomerPage = homeManagePage.ToLinkNewAccountForm();
        String txt = newCustomerPage.newAccountSuccesfull("81675", "Savings", "500");
        Assertions.assertTrue(txt.contains("Account Generated Successfully!!!"));
    }
}
