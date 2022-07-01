package goodline;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ThirdTest {

    @Test
    public void thirdTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testsheepnz.github.io/random-number.html");
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        new Select(driver.findElement(By.id("buildNumber"))).selectByVisibleText("Demo");
        driver.findElement(By.id("rollDiceButton")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("numberGuess")).sendKeys("string");
        driver.findElement(By.id("submitButton")).click();
        driver.quit();
    }
}