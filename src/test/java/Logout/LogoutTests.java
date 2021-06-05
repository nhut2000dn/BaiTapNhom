package Logout;

import Base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.FundTransferPage;

public class LogoutTests extends BaseTests {
    @Test
    @DisplayName("TC_032- Test Logout successfully")
    public void testLogout() {
        homeManagePage.logout();
    }
}
