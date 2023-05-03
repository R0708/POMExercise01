package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AddToProductResultPage extends Utils{

    static String expectedShoppingCartMessage = "Thanks for adding in shopping cart";

    public void VerifyUserToAddProductToShopping(){
        //get text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Shopping cart')]"));
        System.out.println("My Message:"+actualMessage);

        String actualMessage2 = getTextFromElement(By.xpath("//td/a[contains(text(),'Leica T Mirrorless Digital Camera')]"));
        System.out.println("My Message;"+actualMessage2);

        Assert.assertEquals(actualMessage2,expectedShoppingCartMessage, "Product is not adding in shopping cart");

    }
}
