package CustomisedStatement;

import Base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.CustomisedStatementPage;
import pages.FundTransferPage;

public class CustomisedStatementTests extends BaseTests {
    @Test
    @DisplayName("TC_031- Customised Statement (Reset Button)")
    public void testFundTransferResetButton() {
        CustomisedStatementPage customisedStatementPage = homeManagePage.ToLinkCustomisedStatementForm();
        customisedStatementPage.testResetButton("92964", "22/05/2021", "6/5/2021", "10", "1");
    }
    @Test
    @DisplayName("TC_030- Customised Statement Fail3 (Please fill all field)")
    public void testCustomisedStatementFail3() {
        CustomisedStatementPage customisedStatementPage = homeManagePage.ToLinkCustomisedStatementForm();
        customisedStatementPage.customisedStatement("", "22/05/2021", "6/5/2021", "", "");
    }

    @Test
    @DisplayName("TC_029- Customised Statement Fail2 (Account does not exist)")
    public void testCustomisedStatementFail2() {
        CustomisedStatementPage customisedStatementPage = homeManagePage.ToLinkCustomisedStatementForm();
        customisedStatementPage.customisedStatement("12121212", "22/05/2021", "6/5/2021", "10", "1");
    }
    @Test
    @DisplayName("TC_028- Customised Statement Fail1 (ToDate < FromDate)")
    public void testCustomisedStatementFail1() {
        CustomisedStatementPage customisedStatementPage = homeManagePage.ToLinkCustomisedStatementForm();
        customisedStatementPage.customisedStatement("92964", "6/5/2021", "22/05/2021", "10", "1");
    }

    @Test
    @DisplayName("TC_027- Customised Statement successfully")
    public void testCustomisedStatementSuccessful() {
        CustomisedStatementPage customisedStatementPage = homeManagePage.ToLinkCustomisedStatementForm();
        customisedStatementPage.customisedStatement("92964", "05/22/2021", "6/5/2021", "10", "1");
    }
}
