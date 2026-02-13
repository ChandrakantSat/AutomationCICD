package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Base_Test;
import Web_Pages.Login_Page;

public class Login_Test extends Base_Test
{
	@Test
    public void validLoginTest() throws InterruptedException {
		
        Login_Page loginPage = new Login_Page(driver);

        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();

        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("dashboard"));
        
	}

}
