import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class meeting1 {
    public static void main(String... args) throws InterruptedException{
        System.out.printf("Hi");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        Thread.sleep(3000);
        WebElement searchField = driver.findElement(By.cssSelector("[title='Search]"));
        searchField.sendKeys("Testing is awesome!");
        Thread.sleep(3000);
        WebElement submitBtn = driver.findElement(By.cssSelector("[type='submit']"));
        submitBtn.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
