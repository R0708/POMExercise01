package org.example;

import org.openqa.selenium.By;

public class VoteLoginPage extends Utils{
    By loginButton = By.className("ico-login");
    private By Email = By.id("Email");
    private By Password = By.id("Password");
    private By LoginButton =By.xpath("//div[@class=\"buttons\"]//button[@class=\"button-1 login-button\"]");
    private By PollingOption = By.id("pollanswers-2");
    private By DoVote = By.id("vote-poll-1");
    public void enterLoginDetails(){
        // Open Login Page
        clickOnElement(loginButton);
        //enter Email
        typeText(Email, "jiya2@gmail.com");
        // Enter Password
        typeText(Password, "1234jiya");
        // Click Log in button
        clickOnElement(LoginButton);
        // Choose polling option
        clickOnElement(PollingOption);
        // Do Vote
        clickOnElement(DoVote);
    }

}
