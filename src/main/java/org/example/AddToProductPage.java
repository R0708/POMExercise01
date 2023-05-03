package org.example;

import org.openqa.selenium.By;

public class AddToProductPage extends Utils{

    By Electrics = By.xpath("//h2/a[contains(@title,'Show products in category Electronics')]");
    By CameraAndPhoto = By.xpath("//h2/a[contains(@title,'Show products in category Camera & photo')]");
    By LeicaTMirrorlessDigitalCamera = By.xpath("//h2/a[contains(text(),'Leica T Mirrorless Digital Camera')]");
    By AddToCart = By.xpath("//button[contains(@id,'add-to-cart-button-16')]");
    By ShoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    public void ClickOnCategories(){
        //click on electrics
        clickOnElement(Electrics);

        //click on camera & photo
        clickOnElement(CameraAndPhoto);

        //click on Leica T Mirrorless Digital Camera
        clickOnElement(LeicaTMirrorlessDigitalCamera);

        //click on add to cart
        clickOnElement(AddToCart);

        //click on Shopping cart
        clickOnElement(ShoppingCart);

    }
}
