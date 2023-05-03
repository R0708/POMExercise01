package org.example;

import org.openqa.selenium.By;

public class EmailToFriendHomePage extends Utils {

    By cartButtonOnAppleMacBookPro13Inch = By.linkText("Apple MacBook Pro 13-inch");
    public void ClickOnProduct(){

        //Click on add to cart button on Apple MacBook pro 13-inch
        clickOnElement(cartButtonOnAppleMacBookPro13Inch);

    }
}

