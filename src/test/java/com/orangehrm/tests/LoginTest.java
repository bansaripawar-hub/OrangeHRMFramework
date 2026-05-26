package com.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.LoginPage;


public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() throws InterruptedException
    {

        LoginPage login = new LoginPage(driver);

        login.loginToApplication("BansariPA", "Bansari@123");

        Thread.sleep(3000);

        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));

        System.out.println("Login Successful");
    }

     @Test
    public void invalidPasswordTest() throws InterruptedException 
    {

        LoginPage login = new LoginPage(driver);

        login.loginToApplication("BansariPA", "Bansari@123");

        Assert.assertTrue(driver.getCurrentUrl().contains("auth"));

        System.out.println("Invalid Password Test");
    }

    @Test
    public void emptyUsernameTest() throws InterruptedException 
    {

        LoginPage login = new LoginPage(driver);

        login.loginToApplication("", "Bansari@123");

        Assert.assertTrue(driver.getCurrentUrl().contains("auth"));

        System.out.println("Empty Username Test");
    }
}