import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Класс BookFlight.
 *
 * Реализует тесткейс на странице
 * http://newtours.demoaut.com/mercurypurchase.php
 * с последующим переходом
 * на следующую страницу
 */
class BookFlight {
    private WebDriver driver;

    BookFlight(final WebDriver driver1) {
        this.driver = driver1;
        PageFactory.initElements(driver, this);
    }

    //Passengers field
    //1st pass info
    @FindBy (xpath = "//input[@name='passFirst0']")
    private WebElement pass1FName;

    @FindBy (xpath = "//input[@name='passLast0']")
    private WebElement pass1LName;

    @FindBy (xpath = "//select[@name='pass.0.meal']/option[text()='Low Calorie']")
    private WebElement pass1Meat;

    //2nd pass info
    @FindBy (xpath = "//input[@name='passFirst1']")
    private WebElement pass2FName;

    @FindBy (xpath = "//input[@name='passLast1']")
    private WebElement pass2LName;

    @FindBy (xpath = "//select[@name='pass.1.meal']/option[text()='Low Calorie']")
    private WebElement pass2Meat;

    //Credit Card
    @FindBy (xpath = "//select[@name='creditCard']/option[text()='Visa']")
    private WebElement cardType;

    @FindBy (xpath = "//input[@name='creditnumber']")
    private WebElement cardNum;

    //Expiration
    @FindBy (xpath = "//select[@name='cc_exp_dt_mn']/option[text()='10 \n"
            + "                      ']")
    private WebElement expiMnth;

    @FindBy (xpath = "//select[@name='cc_exp_dt_yr']/option[text()='2007 \n"
            + "                      ']")
    private WebElement expiYear;

    @FindBy (xpath = "//input[@name='cc_frst_name']")
    private WebElement cardFName;

    @FindBy (xpath = "//input[@name='cc_mid_name']")
    private WebElement cardMName;

    @FindBy (xpath = "//input[@name='cc_last_name']")
    private WebElement cardLName;

    //Billing Adress
    @FindBy (xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td"
            + "/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input")
    private WebElement ticketless;

    @FindBy (xpath = "//input[@name='billAddress1']")
    private WebElement billAdress1;

    @FindBy (xpath = "//input[@name='billAddress2']")
    private WebElement billAdress2;

    @FindBy (xpath = "//input[@name='billCity']")
    private WebElement billCity;

    @FindBy (xpath = "//input[@name='billState']")
    private WebElement billState;

    @FindBy (xpath = "//input[@name='billZip']")
    private WebElement billPostal;

    @FindBy (xpath = "//select[@name='billCountry']/option[@value='29']")
    private WebElement billCountry;


    //Delivery Adress
    @FindBy (xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody"
            + "/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")
    private WebElement asBilling;

    @FindBy (xpath = "//input[@name='delAddress1']")
    private WebElement delAddress1;

    @FindBy (xpath = "//input[@name='delAddress2']")
    private WebElement delAddress2;

    @FindBy (xpath = "//input[@name='delCity']")
    private WebElement delCity;

    @FindBy (xpath = "//input[@name='delState']")
    private WebElement delState;

    @FindBy (xpath = "//input[@name='delZip']")
    private WebElement delPostal;

    @FindBy (xpath = "//select[@name='delCountry']/option[@value='19']")
    private WebElement delCountry;

    @FindBy (xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr"
            + "/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[24]/td/input")
    private WebElement buyButton;

    //Методы аполнения полей
    void setPass1(final String fName, final String lName) {
        Wait<WebDriver> wait = new WebDriverWait(driver,
                MainTest.SEC_WAIT, MainTest.MSEC_WAIT);
        Waiter waiter = new Waiter(driver, wait);

        waiter.waitWrite(pass1FName, fName);
        waiter.waitWrite(pass1LName, lName);
        waiter.waitClick(pass1Meat);
    }

    void setPass2(final String fName, final String lName) {
        Wait<WebDriver> wait = new WebDriverWait(driver,
                MainTest.SEC_WAIT, MainTest.MSEC_WAIT);
        Waiter waiter = new Waiter(driver, wait);

        waiter.waitWrite(pass2FName, fName);
        waiter.waitWrite(pass2LName, lName);
        waiter.waitClick(pass2Meat);
    }

    void setCard(final String number, final String fName,
                 final String mName, final String lName) {
        Wait<WebDriver> wait = new WebDriverWait(driver,
                MainTest.SEC_WAIT, MainTest.MSEC_WAIT);
        Waiter waiter = new Waiter(driver, wait);

        waiter.waitClick(cardType);
        waiter.waitWrite(cardNum, number);
        waiter.waitClick(expiMnth);
        waiter.waitClick(expiYear);
        waiter.waitWrite(cardFName, fName);
        waiter.waitWrite(cardMName, mName);
        waiter.waitWrite(cardLName, lName);
    }

    void setBillAdress(final String adress1, final String adress2,
                       final String city, final String state,
                       final String pcode) {
        Wait<WebDriver> wait = new WebDriverWait(driver,
                MainTest.SEC_WAIT, MainTest.MSEC_WAIT);
        Waiter waiter = new Waiter(driver, wait);

        waiter.waitClick(ticketless);

        waiter.waitClear(billAdress1);
        billAdress1.sendKeys(adress1);

        waiter.waitWrite(billAdress2, adress2);

        waiter.waitClear(billCity);
        billCity.sendKeys(city);

        waiter.waitClear(billState);
        billState.sendKeys(state);

        waiter.waitClear(billPostal);
        billPostal.sendKeys(pcode);

        waiter.waitClick(billCountry);
    }

    void setDelAdress(final String adress1, final String adress2,
                      final String city, final String state,
                      final String pcode) {
        Wait<WebDriver> wait = new WebDriverWait(driver,
                MainTest.SEC_WAIT, MainTest.MSEC_WAIT);
        Waiter waiter = new Waiter(driver, wait);

        waiter.waitClick(asBilling);

        waiter.waitClear(delAddress1);
        delAddress1.sendKeys(adress1);

        waiter.waitWrite(delAddress2, adress2);

        waiter.waitClear(delCity);
        delCity.sendKeys(city);

        waiter.waitClear(delState);
        delState.sendKeys(state);

        waiter.waitClear(delPostal);
        delPostal.sendKeys(pcode);

        waiter.waitClick(delCountry);

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.accept();

        waiter.waitClick(buyButton);
    }
}
