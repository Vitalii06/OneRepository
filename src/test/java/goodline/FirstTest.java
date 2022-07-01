package goodline;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class FirstTest extends WebDriverSettings {

    @Test
    public void firstTest() throws InterruptedException {
        String value = "-1";
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        new Select(driver.findElement(By.id("selectBuild"))).selectByVisibleText("Prototype");
        driver.findElement(By.id("number1Field")).sendKeys("2");
        driver.findElement(By.id("number2Field")).sendKeys("3");
        new Select(driver.findElement(By.id("selectOperationDropdown"))).selectByVisibleText("Subtract");
        driver.findElement(By.id("calculateButton")).click();
        Thread.sleep(5000);
        String answer = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
        assertThat(value, equalTo(answer));
    }

}
