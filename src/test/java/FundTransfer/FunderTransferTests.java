package FundTransfer;

import Base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.FundTransferPage;
import pages.WithdrawalPage;

public class FunderTransferTests extends BaseTests {
    @Test
    @DisplayName("TC_026- Fund Transfer (Reset Button)")
    public void testFundTransferResetButton() {
        FundTransferPage fundTransferPage = homeManagePage.ToLinkFundTransferForm();
        fundTransferPage.testResetButton("12212121", "123422121", "10", "Fund Transfer");
    }
    @Test
    @DisplayName("TC_025- Fund Transfer Fail (Please fill all field)")
    public void testFundTransferFail3() {
        FundTransferPage fundTransferPage = homeManagePage.ToLinkFundTransferForm();
        fundTransferPage.fundTransferTest("", "", "", "");
    }

    @Test
    @DisplayName("TC_024- Fund Transfer Fail (Account does not exist)")
    public void testFundTransferFail2() {
        FundTransferPage fundTransferPage = homeManagePage.ToLinkFundTransferForm();
        fundTransferPage.fundTransferTest("12212121", "123422121", "10", "Fund Transfer 3");
    }
    @Test
    @DisplayName("TC_023- Fund Transfer Fail (Account Balance low)")
    public void testFundTransferFail1() {
        FundTransferPage fundTransferPage = homeManagePage.ToLinkFundTransferForm();
        fundTransferPage.fundTransferTest("92964", "92973", "99999999", "Fund Transfer 2");
    }

    @Test
    @DisplayName("TC_022- Fund Transfer successfully")
    public void testFundTransferSuccessful() {
        FundTransferPage fundTransferPage = homeManagePage.ToLinkFundTransferForm();
        fundTransferPage.fundTransferTest("92964", "92973", "10", "Fund Transfer 1");
    }
}
