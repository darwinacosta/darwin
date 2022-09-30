package action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Acciones {

    public static void goTo(WebDriver driver, String url) {
        driver.navigate().to(url);
    }

    public static void write(WebDriver driver, By mapeo, String dato) {
        WebElement buscar = driver.findElement(mapeo);
        buscar.clear();
        buscar.sendKeys(dato);
    }

    public static void click(WebDriver driver, By mapeo) {
        driver.findElement(mapeo).click();
    }

    public static void wait(WebDriver driver, By mapeo) {
        WebDriverWait myWaitVar = new WebDriverWait(driver, 30);
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(mapeo));
    }

    public static void scroll(WebDriver driver, String text) {
        switch (text) {
            case "abajo":
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,1000)");
                break;
            case "arriba":
                JavascriptExecutor js1 = (JavascriptExecutor) driver;
                js1.executeScript("window.scrollBy(0,-800)");
                break;
            case "intermedio":
                JavascriptExecutor js2 = (JavascriptExecutor) driver;
                js2.executeScript("window.scrollBy(0,450)");
                break;
            default:
                break;
        }
    }

    public static void select(WebDriver driver, By mapeo, String dato) {
        Select fruits = new Select(driver.findElement(mapeo));
        fruits.selectByValue(dato);

    }

}
