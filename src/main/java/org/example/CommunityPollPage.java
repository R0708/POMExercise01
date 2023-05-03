package org.example;

import org.openqa.selenium.By;

public class CommunityPollPage extends Utils{
    By Good = By.id("pollanswers-2");
    By Vote = By.id("vote-poll-1");


    public void GoToCommunityPoll(){
        //click on good
        clickOnElement(Good);

        //click on vote
        clickOnElement(Vote);
    }
}
