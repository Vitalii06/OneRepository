package goodline;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class SecondTest extends WebDriverSettings {

    @Test
    public void secondTest() throws InterruptedException {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        new Select(driver.findElement(By.id("selectBuild"))).selectByVisibleText("Prototype");
        driver.findElement(By.id("number1Field")).sendKeys("gs");
        driver.findElement(By.id("number2Field")).sendKeys("bu");
        new Select(driver.findElement(By.id("selectOperationDropdown"))).selectByVisibleText("Concatenate");
        driver.findElement(By.id("calculateButton")).click();
        String value = driver.findElement(By.id("numberAnswerField")).getAttribute("value");
    }
}
