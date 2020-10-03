import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.util.Arrays;

/** Класс EventList.
 * Реализует методы реагирования на
 * попытку
 * ввода, клика и
 * принятие оповещений
 * Вебдрайвером
 */
public class EventList implements WebDriverEventListener {


    //Функция описания элемента по сущесвтующим параметрам
    private String elementDescription(final WebElement element) {

        String description = "tag: " + element.getTagName() + "; ";

        if (!element.getAttribute("id").equals("")) {
            description += "id: " + element.getAttribute("id" + "; ");
    }

        if (element.getAttribute("name") != null) {
            description += "name: " + element.getAttribute("name") + "; ";
        }

        if (!element.getText().equals("")) {
            description += " text: '" + element.getText() + "';";
        }

        return description;
    }


    public void beforeAlertAccept(final WebDriver webDriver) {
        System.out.println("WebDriver try to accept the alert.");
    }

    public void afterAlertAccept(final WebDriver webDriver) {
        System.out.println("Accept successful.");
        System.out.println();
    }

    public void afterAlertDismiss(WebDriver webDriver) {

    }

    public void beforeAlertDismiss(WebDriver webDriver) {

    }


    public void beforeNavigateTo(final String url, final WebDriver webDriver) {
        System.out.println("WebDriver try to navigate on: " + url);
    }

    public void afterNavigateTo(final String url, final WebDriver webDriver) {
        System.out.println("Navigate to " + url + " successful.");
        System.out.println();
    }

    public void beforeNavigateBack(WebDriver webDriver) {

    }

    public void afterNavigateBack(WebDriver webDriver) {

    }

    public void beforeNavigateForward(WebDriver webDriver) {
    }

    public void afterNavigateForward(WebDriver webDriver) {

    }

    public void beforeNavigateRefresh(WebDriver webDriver) {

    }

    public void afterNavigateRefresh(WebDriver webDriver) {

    }

    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {

    }

    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {

    }

    public void beforeClickOn(final WebElement webElement,
                              final WebDriver webDriver) {
        System.out.println("WebDriver try to click on element: " + elementDescription(webElement));
    }

    public void afterClickOn(final WebElement webElement,
                             final WebDriver webDriver) {
        System.out.println("Clicked successful.");
        System.out.println();
    }

    public void beforeChangeValueOf(final WebElement webElement, final WebDriver webDriver,
                                    final CharSequence[] charSequences) {
        System.out.println("WebDriver try to write a text"
                + " on element: " + elementDescription(webElement));
    }


    public void afterChangeValueOf(final WebElement webElement, final WebDriver webDriver,
                                   final CharSequence[] charSequences) {
        System.out.println("WebDriver successfully wrote the text:"
                + Arrays.toString(charSequences));
        System.out.println();
    }

    public void beforeScript(String s, WebDriver webDriver) {

    }

    public void afterScript(String s, WebDriver webDriver) {

    }

    public void beforeSwitchToWindow(String s, WebDriver webDriver) {

    }

    public void afterSwitchToWindow(String s, WebDriver webDriver) {

    }

    public void onException(Throwable throwable, WebDriver webDriver) {

    }

    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {

    }

    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {

    }

    public void beforeGetText(final WebElement webElement,
                              final WebDriver webDriver) {
    }

    public void afterGetText(final WebElement webElement,
                             final WebDriver webDriver, final String s) {

    }
}
