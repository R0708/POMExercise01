package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    By registerButton = By.className("ico-register");
    public void clickOnRegisterButton(){
        //click on register button
        clickOnElement(registerButton);

    }

}
