package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductName extends Utils{

    //Print Featured product
    By ProductGrid = By.cssSelector("div.product-grid h2");
    public void FeaturedProduct(){
        List<WebElement>productList = driver.findElements(ProductGrid);

        for (WebElement e:productList){
            System.out.println(e.getText());
        }
    }
}
