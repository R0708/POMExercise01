package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class NopCommerceNewReleasePage extends Utils{
    By _title = By.className("enter-comment-title");
    By _writeComment = By.className("enter-comment-text");
    By _newComment = By.name("add-comment");
    By _getCommentResult = By.cssSelector("div.result");
    By _comments = By.cssSelector("div.comment-body");

    public void verifyNopCommerceNewRelease(){
        //type title
        typeText(_title,"Mobile");
        //type comment
        typeText(_writeComment,"Samsung and iPhone both are smart phones");
        //click on new comment
        clickOnElement(_newComment);
        //get text message
        String expectedRegistrationCompletedMessage = "News comment is successfully added.";
        String actualMessage1 = getTextFromElement(_getCommentResult);
        System.out.println("Result Message:"+actualMessage1);
        Assert.assertEquals(actualMessage1,expectedRegistrationCompletedMessage,"News comment is not added.");
        //new comments results
        System.out.println("Comments:");
        List<WebElement> productList =driver.findElements(_comments);
        for (WebElement p:productList) {
            System.out.println(p.getText());
            System.out.println("....................................");
        }
    }

}
