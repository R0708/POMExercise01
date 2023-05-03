package org.example;

import org.openqa.selenium.By;

public class CompareProductPage extends Utils{

    By HTCOneM8AndroidL5Lollipop = By.xpath("//a[contains(text(),'HTC One M8 Android L 5.0 Lollipop')]");
    By AddToCompareList = By.xpath("//div[@class=\"compare-products\"]");
    By ProductComparison = By.xpath("//a[contains(text(),'product comparison')]");
    By GiftCards = By.linkText("Gift Cards");
    By VirtualGiftCardN = By.linkText("$25 Virtual Gift Card");
    By OnAddToCompareList = By.xpath("//div[@class=\"compare-products\"]");
    By  OnProductComparison = By.linkText("product comparison");
    public void ClickOnCategories(){

        //click on HTC One M8 Android L 5.0 Lollipop
        clickOnElement(HTCOneM8AndroidL5Lollipop);

        //click on add to compare list
        clickOnElement(AddToCompareList);

        //click on product comparison
        clickOnElement(ProductComparison);

        //click on gift cards
        clickOnElement(GiftCards);

        //click on $25 Virtual Gift Card
        clickOnElement(VirtualGiftCardN);

        //click on add to compare list
        clickOnElement(OnAddToCompareList);

        //click on product comparison
        clickOnElement(OnProductComparison);
    }
}
