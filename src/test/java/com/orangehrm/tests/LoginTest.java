package com.orangehrm.tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void validLoginTest() throws InterruptedException {

        LoginPage login = new LoginPage(driver);

        login.loginToApplication("Admin", "admin123");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.urlContains("dashboard"));

        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));

        System.out.println("Login Successful");
    }

    @Test(priority = 2)
    public void invalidPasswordTest() throws InterruptedException {

        LoginPage login = new LoginPage(driver);

        login.loginToApplication("Admin", "wrong123");

        Assert.assertTrue(driver.getCurrentUrl().contains("auth"));

        System.out.println("Invalid Password Test");
    }

    @Test(priority = 3)
    public void emptyUsernameTest() throws InterruptedException {

        LoginPage login = new LoginPage(driver);

        login.loginToApplication("", "admin123");

        Assert.assertTrue(driver.getCurrentUrl().contains("auth"));

        System.out.println("Empty Username Test");
    }
}