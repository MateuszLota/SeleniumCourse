package Examples;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchInWebBrowser {
    @Test
    public void searchWith(){
           WebDriver driver = new FirefoxDriver();
           driver.get("https://www.google.com/");
           WebElement closePopUp = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div"));
           closePopUp.click();
           WebElement SearchInGoogle = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
           SearchInGoogle.sendKeys("W pustyni i w puszczy");
           SearchInGoogle.submit();
           //driver.quit();
    }
}
