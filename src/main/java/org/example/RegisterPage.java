package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{
     private By FirstName = By.id("FirstName");
     private By LastName = By.id("LastName");
     private By dayOfBirth = By.name("DateOfBirthDay");
     private By monthOfBirth = By.name("DateOfBirthMonth");
     private By yearOfBirth = By.name("DateOfBirthYear");
     private By Email = By.id("Email");
     private By Password = By.id("Password");
     private By ConfirmPassword = By.id("ConfirmPassword");
     private By registerSubmitButton = By.id("register-button");




    public void enterRegistrationDetails(){
        //type first name
        typeText(FirstName,"jiya");

        //type last name
        typeText(LastName,"patel");

        selectOptionByIndex(dayOfBirth,10);
        selectOptionByText(monthOfBirth,"August");
        selectOptionByValue(yearOfBirth,"1924");

        //type email address
        typeText(Email,"jiya"+timestamp.getTime()+"@gmail.com");

        //type password
        typeText(Password,"1234jiya");

        //type confirm password
        typeText(ConfirmPassword,"1234jiya");

        //click on register submit button
        clickOnElement(registerSubmitButton);


    }

}
