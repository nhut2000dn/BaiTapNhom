package FundTransfer;

import Base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.FundTransferPage;
import pages.WithdrawalPage;

public class FunderTransferTests extends BaseTests {
    @Test
    @DisplayName("TC_026- Fund Transfer (Reset Button)")
    public void testFundTransferResetButton() {
        FundTransferPage fundTransferPage = homeManagePage.ToLinkFundTransferForm();
        String txt = fundTransferPage.testResetButton("12212121", "123422121", "10", "Fund Transfer");
        Assertions.assertTrue(txt.contains(""));
    }
    @Test
    @DisplayName("TC_025- Fund Transfer Fail (Please fill all field)")
    public void testFundTransferFail3() {
        FundTransferPage fundTransferPage = homeManagePage.ToLinkFundTransferForm();
        String alert = fundTransferPage.fundTransferTest("", "", "", "");
        Assertions.assertTrue(alert.contains("Please fill all field"));
    }

    @Test
    @DisplayName("TC_024- Fund Transfer Fail (Account does not exist)")
    public void testFundTransferFail2() {
        FundTransferPage fundTransferPage = homeManagePage.ToLinkFundTransferForm();
        String alert = fundTransferPage.fundTransferTest("12212121", "123422121", "10", "Fund Transfer 3");
        Assertions.assertTrue(alert.contains("Account 12212121does not exist!!!"));
    }

    @Test
    @DisplayName("TC_023- Fund Transfer Fail (Account Balance low)")
    public void testFundTransferFail1() {
        FundTransferPage fundTransferPage = homeManagePage.ToLinkFundTransferForm();
        String alert = fundTransferPage.fundTransferTest("92964", "92973", "99999999", "Fund Transfer 2");
        Assertions.assertTrue(alert.contains("Transfer Failed. Account Balance low!!"));
    }

    @Test
    @DisplayName("TC_022- Fund Transfer successfully")
    public void testFundTransferSuccessful() {
        FundTransferPage fundTransferPage = homeManagePage.ToLinkFundTransferForm();
        fundTransferPage.fundTransferTest("92964", "92973", "10", "Fund Transfer 1");
    }
}
