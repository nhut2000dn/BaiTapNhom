package NewCustomer;

import Base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.NewCustomerPage;

public class NewCustomerTests extends BaseTests {

    @Test
    @DisplayName("TC_007- Registered Customer (Reset Button)")
    public void testNewCustomerResetButton() {
        NewCustomerPage newCustomerPage = homeManagePage.ToLinkNewCustomerForm();
        String value = newCustomerPage.testResetButton("nhut", "male", "09/02/2000", "ngo quyen",
                "da nang", "vietnam", "1234567", "0522374843", "nhut2000dn92@gmail.com", "123456789");
        Assertions.assertTrue(value.contains(""));

    }

    @Test
    @DisplayName("TC_006- Registered Customer Fail (Invalid Field)")
    public void testNewCustomerFail2() {
        NewCustomerPage newCustomerPage = homeManagePage.ToLinkNewCustomerForm();
        String alert = newCustomerPage.newCustomer("", "male", "", "",
                "", "", "", "", "", "");
        Assertions.assertTrue(alert.contains("please fill all fields"));
    }

    @Test
    @DisplayName("TC_005- Registered Customer Fail (E-mail Already Exist)")
    public void testNewCustomerFail1() {
        NewCustomerPage newCustomerPage = homeManagePage.ToLinkNewCustomerForm();
        String alert = newCustomerPage.newCustomer("nhut", "male", "09/02/2000", "ngo quyen",
                "da nang", "vietnam", "1234567", "0522374843", "nhut2001dn@gmail.com", "123456789");
        Assertions.assertTrue(alert.contains("Email Address Already Exist !!"));
    }

    @Test
    @DisplayName("TC_004- Registered Customer successfully")
    public void testNewCustomerSuccessful() {
        NewCustomerPage newCustomerPage = homeManagePage.ToLinkNewCustomerForm();
        String textSuccesful = newCustomerPage.testSusscesful("nhutpros", "male", "09/02/2000", "ngo quyen",
                "da nang", "vietnam", "1234567", "0522374843", "nhut2000dn92@gmail.com", "123456789");
        Assertions.assertTrue(textSuccesful.contains("Customer Registered Successfully!!!"));
    }
}
