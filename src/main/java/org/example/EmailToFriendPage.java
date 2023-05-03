package org.example;

import org.openqa.selenium.By;

public class EmailToFriendPage extends Utils{
    By EmailFriend = By.className("email-a-friend");
    By FriendsEmailAddress = By.className("friend-email");
    By YourEmailAddress = By.className("your-email");
    By PersonalMessage = By.id("PersonalMessage");
    By SendEmail = By.name("send-email");

    public void ClickOnEmailToFriend(){
        //click on Email a friend
        clickOnElement(EmailFriend);

        //type friends email address
        typeText(FriendsEmailAddress,"testemail"+timestamp.getTime()+"@gmail.com");

        //type your email address
        typeText(YourEmailAddress,"jiya"+timestamp.getTime()+"@gmail.com");

        //type personal message
        typeText(PersonalMessage,"hello world");

        //click on send email
        clickOnElement(SendEmail);
    }
}
