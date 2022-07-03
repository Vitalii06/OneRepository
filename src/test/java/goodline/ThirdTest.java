package goodline;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ThirdTest extends WebDriverSettings {

    @Test
    public void thirdTest() throws InterruptedException {
        String value = "string: Not a number!";
        driver.get("https://testsheepnz.github.io/random-number.html");
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        new Select(driver.findElement(By.xpath("//select[@id='buildNumber']"))).selectByVisibleText("Demo");
        driver.findElement(By.xpath("//input[@id='rollDiceButton']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='numberGuess']")).sendKeys("string");
        driver.findElement(By.xpath("//input[@id='submitButton']")).click();
        String answer = driver.findElement(By.xpath("//label[@id='feedbackLabel']")).getText();
        assertThat(value, equalTo(answer));

    }
}