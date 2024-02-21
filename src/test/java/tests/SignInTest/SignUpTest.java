package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignUpTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);

    @Test
    public void signUp() {
        String Email = "abcd@email.com";

        LOG.info("Insert Email address");
        signInPage.clickSignUp(Email);

        LOG.info("Click the blue button");
        signInPage.clickBlueButton();


    }
}
