package BetterLifeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import BetterLifePages.LoginPage;

public class LogingPageTest {
	
	
	@Test(description="This test case is to ensure admin can login and log out with valid username and password")
	public void Verify_Admin_Login_LogOut() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		LoginPage LP = new LoginPage(driver);
		BaseClass.Admin_Username_password(driver);
		
		LP.AdminHomeButton();
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://portfolio-assignment.babbangonaapps.com/admin/dashboard";
		Assert.assertEquals(ActualURL, ExpectedURL);
		
		LP.Logout();
		String ActualURL1 = driver.getCurrentUrl();
		String ExpectedURL1 = "https://portfolio-assignment.babbangonaapps.com/login";
		Assert.assertEquals(ActualURL1, ExpectedURL1);
		BaseClass.TearDown(driver);
		
	}
	
	
	@Test(description="This test case is to ensure TGE supervisor can login and log out with valid username and password")
	public void Verify_TGE_Supervisor_Login_Logout() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		LoginPage LP = new LoginPage(driver);
		BaseClass.TGE_Username_password(driver);
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://portfolio-assignment.babbangonaapps.com/supervisor/dashboard";
		Assert.assertEquals(ActualURL, ExpectedURL);
		
		LP.Logout();
		String ActualURL1 = driver.getCurrentUrl();
		String ExpectedURL1 = "https://portfolio-assignment.babbangonaapps.com/login";
		Assert.assertEquals(ActualURL1, ExpectedURL1);
		BaseClass.TearDown(driver);
	}
	
	
	@Test(description="This test case is to ensure Direct Program Supervisor can login and log out with valid username "
			+ "and password")
	public void Verify_Direct_Supervisor_Login_Logout() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		LoginPage LP = new LoginPage(driver);
		BaseClass.Direct_Username_password(driver);
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://portfolio-assignment.babbangonaapps.com/supervisor/dashboard";
		Assert.assertEquals(ActualURL, ExpectedURL);
		
		LP.Logout();
		String ActualURL1 = driver.getCurrentUrl();
		String ExpectedURL1 = "https://portfolio-assignment.babbangonaapps.com/login";
		Assert.assertEquals(ActualURL1, ExpectedURL1);
		BaseClass.TearDown(driver);
	}
	
	
	@Test(description="This test case is to ensure In-season coach can login and log out with valid username and password")
	public void Verify_In_Season_Advisor_Login_Logout() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		LoginPage LP = new LoginPage(driver);
		BaseClass.Advisor_Username_password(driver);
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://portfolio-assignment.babbangonaapps.com/supervisor/dashboard";
		Assert.assertEquals(ActualURL, ExpectedURL);
		
		LP.Logout();
		String ActualURL1 = driver.getCurrentUrl();
		String ExpectedURL1 = "https://portfolio-assignment.babbangonaapps.com/login";
		Assert.assertEquals(ActualURL1, ExpectedURL1);
		BaseClass.TearDown(driver);
	}
	

	
	@Test(description="This test case is to ensure admin cannot login with a valid username and an invalid password")
	public void Verify_Admin_Login_With_Valid_UserName_Invalid_Password() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		LoginPage LP = new LoginPage(driver);
		BaseClass.Admin_Username_password_2(driver, "Admin_032", "12345");
		
		String ExpectedURL = driver.getCurrentUrl();
		String ActualURL = "https://portfolio-assignment.babbangonaapps.com/login";
		Assert.assertEquals(ExpectedURL, ActualURL);
		BaseClass.TearDown(driver);
	}
	
	
	@Test(description="This test case is to ensure admin cannot login with an invalid username and a valid password")
	public void Verify_Admin_Login_With_Invalid_UserName_Valid_Password() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		LoginPage LP = new LoginPage(driver);
		BaseClass.Admin_Username_password_2(driver, "Admin", "3456");
		
		String ExpectedURL = driver.getCurrentUrl();
		String ActualURL = "https://portfolio-assignment.babbangonaapps.com/login";
		Assert.assertEquals(ExpectedURL, ActualURL);
		BaseClass.TearDown(driver);
	}
	
	
	@Test(description="This test case is to ensure admin cannot login with an invalid username and an Invalid password")
	public void Verify_Admin_Login_With_Invalid_UserName_Invalid_Password() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		LoginPage LP = new LoginPage(driver);
		BaseClass.Admin_Username_password_2(driver, "Admin_0", "7900");
		
		String ExpectedURL = driver.getCurrentUrl();
		String ActualURL = "https://portfolio-assignment.babbangonaapps.com/login";
		Assert.assertEquals(ExpectedURL, ActualURL);
		BaseClass.TearDown(driver);
	}
	
	@Test(description="This test case is to ensure admin cannot login with empty username and password field")
	public void Verify_Admin_Login_With_Empty_UserName_And_Password_Field() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		LoginPage LP = new LoginPage(driver);
		BaseClass.Admin_Username_password_2(driver, " ", " ");
		
		String ExpectedURL = driver.getCurrentUrl();
		String ActualURL = "https://portfolio-assignment.babbangonaapps.com/login";
		Assert.assertEquals(ExpectedURL, ActualURL);
		BaseClass.TearDown(driver);
	}
	
	
	
	@Test(description="This test case is to ensure supervisor cannot login with a valid username and an invalid password")
	public void Verify_Supervisor_Login_With_Valid_UserName_Invalid_Password() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		LoginPage LP = new LoginPage(driver);
		BaseClass.Supervisor_Username_password_2(driver, "Ikara.TGE.Hub_Supervisor", "12345");
		
		String ExpectedURL = driver.getCurrentUrl();
		String ActualURL = "https://portfolio-assignment.babbangonaapps.com/login";
		Assert.assertEquals(ExpectedURL, ActualURL);
		BaseClass.TearDown(driver);
	}
	
	
	@Test(description="This test case is to ensure supervisor cannot login with an invalid username and a valid password")
	public void Verify_Supervisor_Login_With_Invalid_UserName_Valid_Password() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		LoginPage LP = new LoginPage(driver);
		BaseClass.Supervisor_Username_password_2(driver, "IkaraTesting", "7939");
		
		String ExpectedURL = driver.getCurrentUrl();
		String ActualURL = "https://portfolio-assignment.babbangonaapps.com/login";
		Assert.assertEquals(ExpectedURL, ActualURL);
		BaseClass.TearDown(driver);
	}
	
	
	@Test(description="This test case is to ensure supervisor cannot login with an invalid username and an Invalid password")
	public void Verify_Supervisor_Login_With_Invalid_UserName_Invalid_Password() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		LoginPage LP = new LoginPage(driver);
		BaseClass.Supervisor_Username_password_2(driver, "IkaraTesting", "7900");
		
		String ExpectedURL = driver.getCurrentUrl();
		String ActualURL = "https://portfolio-assignment.babbangonaapps.com/login";
		Assert.assertEquals(ExpectedURL, ActualURL);
		BaseClass.TearDown(driver);
	}
	
	@Test(description="This test case is to ensure supervisor cannot login with empty username and password field")
	public void Verify_Supervisor_Login_With_Empty_UserName_And_Password_Field() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		LoginPage LP = new LoginPage(driver);
		BaseClass.Supervisor_Username_password_2(driver, " ", " ");
		
		String ExpectedURL = driver.getCurrentUrl();
		String ActualURL = "https://portfolio-assignment.babbangonaapps.com/login";
		Assert.assertEquals(ExpectedURL, ActualURL);
		BaseClass.TearDown(driver);
	}
	
	
	
	
}
