import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Класс FlightFinder.
 *
 * Реализует тесткейс на странице
 * http://newtours.demoaut.com/mercuryreservation.php
 * с последующим переходом
 * на следующую страницу
 */
class FlightFinder {

    private WebDriver driver;

    FlightFinder(final WebDriver driver1) {
        this.driver = driver1;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[@name='tripType' and @value='oneway']")
    private WebElement type;

    @FindBy (xpath = "//select[@name='passCount']/option[text()='2 ']")
    private WebElement passCount;

    @FindBy (xpath = "//select[@name='fromPort']/option[@value='London']")
    private WebElement depFrom;

    @FindBy (xpath = "//select[@name='fromMonth']/option[@value='4']")
    private WebElement depMonth;

    @FindBy (xpath = "//select[@name='fromDay']/option[@value='10']")
    private WebElement depDay;

    @FindBy (xpath = "//select[@name='toPort']/option[@value='Paris']")
    private WebElement arrIn;

    @FindBy (xpath = "//select[@name='toMonth']/option[@value='5']")
    private WebElement arrMonth;

    @FindBy (xpath = "//select[@name='toDay']/option[@value='21']")
    private WebElement arrDay;

    @FindBy (xpath = "//input[@value='First']")
    private WebElement service;

    @FindBy (xpath = "//option[text()='Pangea Airlines']")
    private WebElement airline;

    @FindBy (xpath = "//input[@name='findFlights']")
    private WebElement nextPage;

    void flightFinder() {
        Wait<WebDriver> wait = new WebDriverWait(driver,
                MainTest.SEC_WAIT, MainTest.MSEC_WAIT);
        Waiter waiter = new Waiter(driver, wait);

        waiter.waitClick(type);
        waiter.waitClick(passCount);
        waiter.waitClick(depFrom);
        waiter.waitClick(depMonth);
        waiter.waitClick(depDay);
        waiter.waitClick(arrIn);
        waiter.waitClick(arrMonth);
        waiter.waitClick(arrDay);
        waiter.waitClick(service);
        waiter.waitClick(airline);
        waiter.waitClick(nextPage);
    }
}
