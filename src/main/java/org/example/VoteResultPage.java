package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class VoteResultPage extends Utils{
    static String expectedAbleToVoteMessage = "Can not vote";

    public void VerifyRegisterUserVoteSuccessfully(){

        String actualMessage = getTextFromElement(By.xpath("//span[@class=\"poll-total-votes\"]"));
        System.out.println("My Message:"+actualMessage);
        // Expected message
        Assert.assertEquals(actualMessage,expectedAbleToVoteMessage, "Total Votes are wrong");

    }
}
