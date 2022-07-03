package goodline;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SecondTest extends WebDriverSettings {

    @Test
    public void secondTest() throws InterruptedException {
        String value = "gsbu";
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        new Select(driver.findElement(By.xpath("//select[@id='selectBuild']"))).selectByVisibleText("Prototype");
        driver.findElement(By.xpath("//input[@id='number1Field']")).sendKeys("gs");
        driver.findElement(By.xpath("//input[@id='number2Field']")).sendKeys("bu");
        new Select(driver.findElement(By.xpath("//select[@id='selectOperationDropdown']"))).selectByVisibleText("Concatenate");
        driver.findElement(By.xpath("//input[@id='calculateButton']")).click();
        String answer = driver.findElement(By.xpath("//input[@id='numberAnswerField']")).getAttribute("value");
        assertThat(value, equalTo(answer));
    }
}
