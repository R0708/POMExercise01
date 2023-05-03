package org.example;

import org.openqa.selenium.By;

public class VoteHomePage extends Utils {

    By registerButton = By.className("ico-register");


    public void clickOnRegisterButton(){
        //click on register
        clickOnElement(registerButton);

   }
}
