package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";
    String firstName = "Ion";
    String lastName = "Popescu";
    String address = "Str Lotus, Nr 35";
    String email = "automation@email.com";
    String phone = "0745267287";

    @Test
    public void fillRegister() {
        driver.get(newUrl);
        sleep(3000L);

        LOG.info("Click the Consent button");
        registerPage.clickConsent();

        LOG.info("Typing full name");
        registerPage.insertFullName(firstName, lastName);

        LOG.info("Type address");
        registerPage.insertAddress(address);

        LOG.info("Type Email");
        registerPage.insertEmail(email);

        LOG.info("Type Phone number");
        registerPage.insertPhone(phone);


    }
}
