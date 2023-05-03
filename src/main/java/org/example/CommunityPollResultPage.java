package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CommunityPollResultPage extends Utils{
    static String expectedCommunityPollVoteMessage = "Thanks for vote communityPoll";

public void VerifyUserCanDoCommunityVote(){

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"poll-vote-error\"]")));

    String actualMessage = getTextFromElement(By.xpath("//div[@class=\"poll-vote-error\"]"));
    System.out.println("my message : "+actualMessage);

    Assert.assertEquals(actualMessage,expectedCommunityPollVoteMessage, "Error message is disappearing");


}
}
