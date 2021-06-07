package Deposit;

import Base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.DepositPage;
import pages.NewAccountPage;

public class DepositTests  extends BaseTests {

    @Test
    @DisplayName("TC_016- New Account (Reset Button)")
    public void testDepositResetButton() {
        DepositPage depositPage = homeManagePage.ToLinkDepositForm();
        String txt = depositPage.testResetButton("92964", "100", "deposit1");
        Assertions.assertTrue(txt.contains(""));
    }

    @Test
    @DisplayName("TC_015- Deposit Fail (Please fill all field)")
    public void testDepositFail2() {
        DepositPage depositPage = homeManagePage.ToLinkDepositForm();
        String alert = depositPage.depositTest("", "", "");
        Assertions.assertTrue(alert.contains("Please fill all field"));
    }

    @Test
    @DisplayName("TC_014- Deposit Fail (Account does not exist)")
    public void testDepositFail1() {
        DepositPage depositPage = homeManagePage.ToLinkDepositForm();
        String alert = depositPage.depositTest("23234234", "100", "deposit2");
        Assertions.assertTrue(alert.contains("Account does not exist"));
    }

    @Test
    @DisplayName("TC_013- Deposit successfully")
    public void testDepositSuccessful() {
        DepositPage depositPage = homeManagePage.ToLinkDepositForm();
        String txt = depositPage.depositTestSuccesful("92964", "100", "deposit1");
        Assertions.assertTrue(txt.contains("Transaction details of Deposit for Account 92964"));
    }
}
