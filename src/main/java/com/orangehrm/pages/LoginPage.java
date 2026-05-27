package com.orangehrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 
{

    WebDriver driver;

    public LoginPage(WebDriver driver) 
    {
        this.driver = driver;
    }

    By username = By.name("username");

    By password = By.name("password");

    By loginButton = By.xpath("//button[@type='submit']");

     public void loginToApplication(String user, String pass) throws InterruptedException 
     {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement usernameField =
            wait.until(ExpectedConditions.elementToBeClickable(username));

        usernameField.clear();
        usernameField.sendKeys(user);

        WebElement passwordField =
            wait.until(ExpectedConditions.elementToBeClickable(password));

        passwordField.clear();
        passwordField.sendKeys(pass);

        WebElement loginBtn =
            wait.until(ExpectedConditions.elementToBeClickable(loginButton));

    Thread.sleep(2000);

    loginBtn.click();
}
}
