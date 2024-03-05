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
    String language = "English";
    String skill = "Java";
    String country = "India";
    String year = "1991";
    String month = "February";
    String day = "29";
    String password = "Parola234";



    @Test
    public void fillRegister() {
        driver.get(newUrl);
        sleep(3000L);

        //LOG.info("Click the Consent button");
        //registerPage.clickConsent();

        LOG.info("Typing full name");
        registerPage.insertFullName(firstName, lastName);

        LOG.info("Type address");
        registerPage.insertAddress(address);

        LOG.info("Type Email");
        registerPage.insertEmail(email);

        LOG.info("Type Phone number");
        registerPage.insertPhone(phone);

        LOG.info("Select gender");
        registerPage.setMaleGender();
        registerPage.setFemaleGender();

        LOG.info("Select hobbies");
        registerPage.clickCricket();
        registerPage.clickMovies();
        registerPage.clickHockey();

        LOG.info("Select language");
        registerPage.selectLanguage(language);

        LOG.info("Select skill");
        registerPage.selectSkills(skill);

        LOG.info("Select country");
        registerPage.selectCountry(country);

        LOG.info("Select date of birth");
        registerPage.setDateOfBirth(year, month, day);

        LOG.info("Type password");
        registerPage.insertPassword(password);

        LOG.info("Type password");
        registerPage.insertConfirm(password);

        LOG.info("Click 'Choose File' button");
        registerPage.chooseFile();





        sleep(5000L);

    }
}
