import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Класс Log.
 *
 * Реализует метод авторизации
 * на главной странице сайта
 */
class Log {

    private WebDriver driver;

    Log(final WebDriver driver1) {
        this.driver = driver1;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[@name='userName']")
    private WebElement login;

    @FindBy (xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy (xpath = "//input[@name = 'login']")
    private WebElement signButton;

    void setLogin(final String username, final String pass) {
        Wait<WebDriver> wait = new WebDriverWait(driver,
                MainTest.SEC_WAIT, MainTest.MSEC_WAIT);
        Waiter waiter = new Waiter(driver, wait);

        waiter.waitWrite(login, username);
        waiter.waitWrite(password, pass);
        waiter.waitClick(signButton);
    }
}
