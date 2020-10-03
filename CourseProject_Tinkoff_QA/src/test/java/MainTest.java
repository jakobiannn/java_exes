import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * Класс MainTest.
 * Запускает тесткейс на сайте
 * http://newtours.demoaut.com/
 * с помощью ChromeDriver
 *
 * @author Алексей Чуйко
 * Ноябрь, 2019 г.
 */
public class MainTest {
    private static WebDriver driver;
    static final int SEC_WAIT = 5;
    static final int MSEC_WAIT = 250;

    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void beforeTest() {
        driver = new ChromeDriver();

        EventFiringWebDriver eventDriver
                = new EventFiringWebDriver(driver); //Wrapper

        EventList eventList = new EventList();
        eventDriver.register(eventList);
        driver = eventDriver;

        driver.get("http://newtours.demoaut.com/");


    }

    @Test
    public void mainTest() {
        /* Создаем экземпляры классов
        и вызываем их соответствующие методы
         */
        Log log = new Log(driver);
        log.setLogin("test1", "test1");

        FlightFinder fighting = new FlightFinder(driver);
        fighting.flightFinder();

        SelectFlight selectFlight = new SelectFlight(driver);
        selectFlight.setDepart();

        BookFlight bookFlight = new BookFlight(driver);
        bookFlight.setPass1("Alexey", "Chuyko");
        bookFlight.setPass2("Galina", "Bryakova");
        bookFlight.setCard("3345555", "Alexey", "Andreevich", "Chuyko");
        bookFlight.setBillAdress("Russia", "Gagarina 44",
                "Ryazan", "Ryazan Oblast", "390005");

        bookFlight.setDelAdress("Canada", "Gorkogo 5",
                "Ottava", "Ontario", "K0A");
    }

    @AfterClass
    public static void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}
