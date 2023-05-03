package org.example;

import org.openqa.selenium.By;

public class ReferToFriendLoginPage extends Utils{

    By Login = By.className("ico-login");
    private By Email = By.id("Email");
    private By Password = By.id("Password");
    private By LoginButton = By.xpath("//div[@class=\"buttons\"]//button[@class=\"button-1 login-button\"]");



    public void EnterLoginDetailsReferToFriend(){
        // Open Login Page
        clickOnElement(Login);
        // Enter your email address
        typeText(Email,"jiya1@gmail.com");
        // Enter Password
        typeText(Password, "1234jiya");
        // Click Log in button
        clickOnElement(LoginButton);

    }
}
