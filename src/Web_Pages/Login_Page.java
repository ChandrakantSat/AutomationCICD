package Web_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page 
{
    WebDriver driver;
   

    public Login_Page(WebDriver driver) 
    {
        this.driver = driver;
    }

    public void enterUsername(String user) throws InterruptedException 
    {
    	Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys(user);
    }

    public void enterPassword(String pass)
    {
        driver.findElement(By.name("password")).sendKeys(pass);
    }

    public void clickLogin() 
    {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

}
