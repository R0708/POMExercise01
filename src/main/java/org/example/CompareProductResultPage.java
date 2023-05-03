package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareProductResultPage extends Utils{
    static String expectedCompareProductMessage = "You have no items to compare.";
    By ClearList = By.className("clear-list");
    public void VerifyUserToCompareProduct(){
        //print out both products
        String actualMessage1 = getTextFromElement(By.linkText("HTC One M8 Android L 5.0 Lollipop"));
        System.out.println("First Product:"+actualMessage1);
        String actualMessage2 = getTextFromElement(By.linkText("$25 Virtual Gift Card"));
        System.out.println("Second Product:"+actualMessage2);

        //click on clear list
        clickOnElement(ClearList);

        //get text
        String actualMessage3 = getTextFromElement(By.xpath("//div[contains(text(),'You have no items to compare.')]"));
        System.out.println("My Message:"+actualMessage3);

        Assert.assertEquals(actualMessage3,expectedCompareProductMessage, "Can not comparing products");

    }
}
