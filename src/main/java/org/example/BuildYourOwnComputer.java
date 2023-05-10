package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BuildYourOwnComputer extends Utils{
    By processor = By.xpath("//select[@data-attr='1']");
    By RAM = By.cssSelector("select#product_attribute_2");
    By HDD = By.cssSelector("input#product_attribute_3_6");
    By OS = By.cssSelector("input#product_attribute_4_9");
    By office = By.cssSelector("input#product_attribute_5_10");
    By reader = By.cssSelector("input#product_attribute_5_11");
    By commander = By.cssSelector("input#product_attribute_5_12");
    By addToCart = By.cssSelector("button#add-to-cart-button-1");
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By update = By.xpath("//button[contains(@class,'button-2 update-cart-button')]");
    By agree =By.cssSelector("input#termsofservice");
    By checkOut = By.cssSelector("button#checkout");
    By asGuest = By.cssSelector("button.button-1.checkout-as-guest-button");
    By firstname = By.cssSelector("input#BillingNewAddress_FirstName");
    By lastname = By.cssSelector("input#BillingNewAddress_LastName");
    By email = By.cssSelector("input#BillingNewAddress_Email");
    By country = By.cssSelector("select#BillingNewAddress_CountryId");
    By state = By.cssSelector("BillingNewAddress_StateProvinceId");
    By city = By.cssSelector("input#BillingNewAddress_City");
    By address = By.cssSelector("input#BillingNewAddress_Address1");
    By zipcode = By.cssSelector("input#BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.cssSelector("input#BillingNewAddress_PhoneNumber");
    By Continue = By.cssSelector("button.button-1.new-address-next-step-button");
    By shipping = By.cssSelector("input#shippingoption_1");
    By Continue1 = By.cssSelector("button.button-1.shipping-method-next-step-button");
    By creditCard = By.cssSelector("input#paymentmethod_1");
    By Continue2 = By.cssSelector("button.button-1.payment-method-next-step-button");
    By visa = By.cssSelector("select#CreditCardType");
    By cardholder = By.cssSelector("input#CardholderName");
    By cardNumber = By.cssSelector("input#CardNumber");
    By month = By.cssSelector("select#ExpireMonth");
    By year = By.cssSelector("select#ExpireYear");
    By cardCode = By.cssSelector("input#CardCode");
    By Continue3 = By.cssSelector("button.button-1.payment-info-next-step-button");
    By confirm = By.cssSelector("button.button-1.confirm-order-next-step-button");

    public void VerifyUserShouldAbleToFillDetailsForBuildIt(){
        //select 2.2 GHz intel pentium dual-core E2200 processor
        selectOptionByText(processor,"2.2 GHz Intel Pentium Dual-Core E2200");
        //select RAM 8GB
        selectOptionByText(RAM,"8GB [+$60.00]");
        //select HDD
        selectOptionByText(HDD,"320 GB");
        //select OS
        selectOptionByText(OS,"Vista Premium [+$60.00]");
        //click all 3 software
        clickOnElement(office);
        clickOnElement(reader);
        clickOnElement(commander);
        //click on add to cart
        clickOnElement(addToCart);
        //click shopping cart
        clickOnElement(shoppingCart);
        //selected all massage on display
        String actualMessage = getTextFromElement(By.cssSelector("td.product"));
        System.out.println("My message : "+actualMessage);
        //click on update shopping cart
        clickOnElement(update);
        //click on agree terms
        clickOnElement(agree);
        //click on checkout
        clickOnElement(checkOut);
        //click on checkout as guest
        clickOnElement(asGuest);
        //Billing address type first name
        typeText(firstname,"Rishi");
        //type last name
        typeText(lastname,"Potter");
        //type email
        typeText(email,"rishi@testmail.com");
        //select country
        selectOptionByText(country,"United States");
        //select state
        selectOptionByText(state,"New York");
        //type city
        typeText(city,"California");
        //type address
        typeText(address,"22 test road");
        //type zip code
        typeText(zipcode,"SK7 5AT");
        //enter phone number
        typeText(phoneNumber,"2587892270");
        //click on continue
        clickOnElement(Continue);
        //select shipping method
        clickOnElement(shipping);
        //click on continue
        clickOnElement(Continue1);
        //click on credit card
        clickOnElement(creditCard);
        //click on continue
        clickOnElement(Continue2);
        //select credit card
        selectOptionByText(visa,"Visa");
        //type cardholder number
        typeText(cardholder,"rishi");
        //type card number
        typeText(creditCard,"4929594025622251");
        //select expiration date
        selectOptionByIndex(month,07);
        selectOptionByValue(year,"2029");
        //type card code
        typeText(cardCode,"238");
        //click on continue
        clickOnElement(Continue3);
        //click on confirm
        clickOnElement(confirm);

        String actualMessage0 = getTextFromElement(By.cssSelector("div.title>strong"));
        System.out.println("My message : "+actualMessage0);

        String actualMessages = getTextFromElement(By.cssSelector("div.details"));
        System.out.println("My message : "+actualMessages);

    }
}
