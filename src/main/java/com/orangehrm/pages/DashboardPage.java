package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    WebDriver driver;

    WebDriverWait wait;

    public DashboardPage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    By dashboardHeader = By.xpath("//h6[text()='Dashboard']");

    By searchBox = By.xpath("//input[@placeholder='Search']");

    By adminMenu = By.xpath("//span[text()='Admin']");

    // Methods
    public boolean isDashboardDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(dashboardHeader))
                .isDisplayed();
    }

    public boolean isSearchBoxDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchBox))
                .isDisplayed();
    }

    public boolean isAdminMenuDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(adminMenu))
                .isDisplayed();
    }
}