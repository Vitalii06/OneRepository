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
        new Select(driver.findElement(By.id("buildNumber"))).selectByVisibleText("Demo");
        driver.findElement(By.id("rollDiceButton")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("numberGuess")).sendKeys("string");
        driver.findElement(By.id("submitButton")).click();
        String answer = driver.findElement(By.id("feedbackLabel")).getText();
        assertThat(value, equalTo(answer));

    }
}