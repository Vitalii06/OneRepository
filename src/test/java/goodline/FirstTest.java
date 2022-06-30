package goodline;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest {

    @Test
    public void firstTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        //driver.navigate().to("https://testsheepnz.github.io/BasicCalculator.html");
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

        driver.findElement(By.id("number1Field")).sendKeys("2");
        driver.findElement(By.id("number2Field")).sendKeys("3");

        new Select(driver.findElement(By.id("selectOperationDropdown"))).selectByVisibleText("Subtract");
        driver.findElement(By.id("calculateButton")).click();
        Thread.sleep(10000);
        String value = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        driver.quit();
    }

}
