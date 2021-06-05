package Withdraw;

import Base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.DepositPage;
import pages.WithdrawalPage;

public class WithdrawTests  extends BaseTests {
    @Test
    @DisplayName("TC_021- Withdraw (Reset Button)")
    public void testWithdrawResetButton() {
        WithdrawalPage withdrawalPage = homeManagePage.ToLinkWithdrawalForm();
        withdrawalPage.testResetButton("92964", "100", "withdraw1");
    }
    @Test
    @DisplayName("TC_020- Withdraw Fail (Please fill all field)")
    public void testWithdrawFail3() {
        WithdrawalPage withdrawalPage = homeManagePage.ToLinkWithdrawalForm();
        withdrawalPage.withdrawTest("", "", "");
    }

    @Test
    @DisplayName("TC_019- Withdraw Fail (Account Balance low)")
    public void testWithdrawFail2() {
        WithdrawalPage withdrawalPage = homeManagePage.ToLinkWithdrawalForm();
        withdrawalPage.withdrawTest("92964", "99999999", "withdraw1");
    }

    @Test
    @DisplayName("TC_018- Withdraw Fail (Account does not exist)")
    public void testWithdrawFail1() {
        WithdrawalPage withdrawalPage = homeManagePage.ToLinkWithdrawalForm();
        withdrawalPage.withdrawTest("23234234", "100", "withdraw1");
    }

    @Test
    @DisplayName("TC_017- Withdraw successfully")
    public void testWithdrawSuccessful() {
        WithdrawalPage withdrawalPage = homeManagePage.ToLinkWithdrawalForm();
        withdrawalPage.withdrawTest("92964", "100", "withdraw1");
    }
}
