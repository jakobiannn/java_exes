import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

/**
 * Класс Waiter.
 *
 * Создан для упрощения вызова функций
 * класса Wait
 */
class Waiter {
    private Wait<WebDriver> wait;
    private WebDriver driver;

    Waiter(final WebDriver driver1, final Wait<WebDriver> wait1) {
        this.driver = driver1;
        PageFactory.initElements(driver, this);
        this.wait = wait1;
    }

   void waitWrite(final WebElement element, final String text) {
       wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
   }

    void waitClick(final WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    void waitClear(final WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element)).clear();
    }
}
