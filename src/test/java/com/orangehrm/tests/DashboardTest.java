package com.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.LoginPage;

public class DashboardTest extends BaseTest {

    @Test
    public void verifyDashboardPage() throws InterruptedException {

        LoginPage login = new LoginPage(driver);

        login.loginToApplication("Admin", "admin123");

        Thread.sleep(3000);

        DashboardPage dashboard = new DashboardPage(driver);

        Assert.assertTrue(dashboard.isDashboardDisplayed());

        System.out.println("Dashboard Page Verified");
    }

    @Test
    public void verifySearchBox() throws InterruptedException {

        LoginPage login = new LoginPage(driver);

        login.loginToApplication("Admin", "admin123");

        Thread.sleep(3000);

        DashboardPage dashboard = new DashboardPage(driver);

        Assert.assertTrue(dashboard.isSearchBoxDisplayed());

        System.out.println("Search Box Verified");
    }

    @Test
    public void verifyAdminMenu() throws InterruptedException {

        LoginPage login = new LoginPage(driver);

        login.loginToApplication("Admin", "admin123");

        Thread.sleep(3000);

        DashboardPage dashboard = new DashboardPage(driver);

        Assert.assertTrue(dashboard.isAdminMenuDisplayed());

        System.out.println("Admin Menu Verified");
    }
}