package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailToFriendResultPage extends Utils{

    static String expectedEmailToFriendMassage = "Thank you for your Email";


    public void VerifyUserShouldSendEmailToFriend(){
        String actualMessage = getTextFromElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul[1]"));
        System.out.println("My message : "+actualMessage);

        Assert.assertEquals(actualMessage,expectedEmailToFriendMassage,"Can not sending email");

    }
}
