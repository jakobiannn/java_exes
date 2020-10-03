import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Класс SelectFlight.
 *
 * Реализует тесткейс на
 * странице http://newtours.demoaut.com/mercuryreservation2.php
 * с последующим переходом
 * на следующую страницу
 */
class SelectFlight {

    private WebDriver driver;

    SelectFlight(final WebDriver driver1) {
        this.driver = driver1;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[contains(@value, 'Pangea Airlines') and @name='outFlight']")
    private WebElement depart;

    @FindBy (xpath = "//input[contains(@value, 'Pangea Airlines') and @name='inFlight']")
    private WebElement back;

    @FindBy (xpath = "//input[@name='reserveFlights']")
    private WebElement next;

    void setDepart() {
        Wait<WebDriver> wait = new WebDriverWait(driver,
                MainTest.SEC_WAIT, MainTest.MSEC_WAIT);
        Waiter waiter = new Waiter(driver, wait);

        waiter.waitClick(depart);
        waiter.waitClick(back);
        waiter.waitClick(next);
    }
}
