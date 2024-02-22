package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private RegisterPage() {

    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    private By inputFirstName = By.xpath("//input[@ng-model='FirstName']");
    private By inputLastName = By.xpath("//input[@ng-model='LastName']");
    private By consent = By.xpath("//p[text()='Consent']");
    private By inputAddress = By.xpath("//textarea[@ng-model='Adress']");
    private By inputEmail = By.xpath("//input[@type='email']");
    private By inputPhone = By.xpath("//input[@type='tel']");

    public void insertFullName(String fName, String lName) {
        LOG.info("Inserting FirstName and LastName");
        driver.findElement(inputFirstName).sendKeys(fName);
        driver.findElement(inputLastName).sendKeys(lName);
    }

    public void clickConsent() {
        LOG.info("Click the Consent button");
        driver.findElement(consent).click();
    }

    public void insertAddress(String address) {
        LOG.info("Insert Address");
        driver.findElement(inputAddress).sendKeys(address);
    }

    public void insertEmail(String email) {
        LOG.info("Insert Email");
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void insertPhone(String phone) {
        LOG.info("Insert Phone number");
        driver.findElement(inputPhone).sendKeys(phone);
    }

}
