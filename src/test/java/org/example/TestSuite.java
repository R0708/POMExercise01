package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    VoteHomePage voteHomePage = new VoteHomePage();
    VoteRegisterPage voteRegisterPage = new VoteRegisterPage();
    VoteLoginPage voteLoginPage = new VoteLoginPage();
    VoteResultPage voteResultPage = new VoteResultPage();
    CommunityPollPage communityPollPage = new CommunityPollPage();
    CommunityPollResultPage communityPollResultPage = new CommunityPollResultPage();
    EmailToFriendHomePage emailToFriendHomePage = new EmailToFriendHomePage();
    EmailToFriendPage emailToFriendPage= new EmailToFriendPage();
    EmailToFriendResultPage emailToFriendResultPage = new EmailToFriendResultPage();
    AddToProductPage addToProductPage = new AddToProductPage();
    AddToProductResultPage addToProductResultPage = new AddToProductResultPage();
    CompareProductPage compareProductPage = new CompareProductPage();
    CompareProductResultPage compareProductResultPage = new CompareProductResultPage();
    ReferToFriendHomePage referToFriendHomePage = new ReferToFriendHomePage();
    ReferToFriendRegisterPage referToFriendRegisterPage = new ReferToFriendRegisterPage();
    ReferToFriendLoginPage referToFriendLoginPage = new ReferToFriendLoginPage();
    ReferToFriendProduct referToFriendProduct = new ReferToFriendProduct();
    ReferAFriendResultPage referAFriendResultPage = new ReferAFriendResultPage();
    ProductName productName = new ProductName();
    NopCommerceNewReleasePage nopCommerceNewReleasePage = new NopCommerceNewReleasePage();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    FacebookPage facebookPage = new FacebookPage();



    @Test
    public void verifyUSerShouldAbleToRegisterSuccessfully(){
        //Click on register button
        homePage.clickOnRegisterButton();
        // fill registration details
        registerPage.enterRegistrationDetails();
        //verify register success or not
        registerResultPage.VerifyUserRegisteredSuccessfully();
        

    }
    @Test
    public void VerifyRegisterUserShouldBeAbleToVoteSuccessfully(){
        //Click on register button
        voteHomePage.clickOnRegisterButton();
        //fill registration details
        voteRegisterPage.enterRegistrationDetails();
        //fill login details
        voteLoginPage.enterLoginDetails();
        //verify register can vote successfully or not
        voteResultPage.VerifyRegisterUserVoteSuccessfully();


    }
    @Test
    public void VerifyUserShouldAbleToVoteToCommunityPoll(){
        //Go to Community poll
        communityPollPage.GoToCommunityPoll();
        //verify Community Vote success or not
        communityPollResultPage.VerifyUserCanDoCommunityVote();

    }
    @Test
    public void VerifyUserShouldAbleToSendEmailToFriend() {
        //Click on add to cart button on Apple MacBook pro 13-inch
        emailToFriendHomePage.ClickOnProduct();
        //click on Email a friend
        emailToFriendPage.ClickOnEmailToFriend();
        //verify user should send email to friend
        emailToFriendResultPage.VerifyUserShouldSendEmailToFriend();

    }
    @Test
    public void VerifyUserShouldAbleToAddProductToShoppingCart(){
        //clicks are on Categories
        addToProductPage.ClickOnCategories();
        //Verify user should add product to shoppingCart
        addToProductResultPage.VerifyUserToAddProductToShopping();

    }
    @Test
    public void VerifyUserShouldAbleToCompareProduct(){
        //clicks are on Categories
        compareProductPage.ClickOnCategories();
        //Verify user should Able to compare product
        compareProductResultPage.VerifyUserToCompareProduct();

    }
    @Test
    public void VerifyRegisterUserShouldBeAbleToReferAProductToAFriendSuccessfully(){
        //Click on register button
        referToFriendHomePage.ClickOnRegisterButtonToReferToFriend();
        //fill registration details
        referToFriendRegisterPage.EnterRegistrationReferToFriendDetails();
        //fill login details
        referToFriendLoginPage.EnterLoginDetailsReferToFriend();
        //get product to refer a friend by email
        referToFriendProduct.ClickOnProductTORefer();
        //Verify Register User Should Be Able To Refer A Product To A Friend Successfully
        referAFriendResultPage.VerifyUserAbleToReferAProductToAFriend();

    }
    @Test
    public void VerifyProductName(){
        //click on home page
        productName.FeaturedProduct();
    }
    @Test
    public void verifySearchAlert(){
        //click on home page
        homePage.verifySearchAlertMessage();
    }
    @Test
    public void verifyUserShouldAbleToSelectAndVerifyCurrencyAccordingly(){
        //click on home page
        homePage.verifyCurrencyAccordingly();
    }
    @Test
    public void verifyUserShouldAbleToSearchForGivenProductSuccessfully(){
        //click on home page
        homePage.verifySearchFunctionalityWorkingFine();
    }
    @Test
    public void VerifyUserShouldAbleToWriteACommentsSuccessfully(){
        //click on home page
        homePage.goToNopCommerceNewRelease();
        //go to nopCommerce page and verify comments
        nopCommerceNewReleasePage.verifyNopCommerceNewRelease();

    }
    @Test
    public void verifyGuestUserShouldAbleToCheckOutSuccessfully(){
        //click on home page
        homePage.goToBuildYourOwnComputer();
        //fill all details on build your own computer
        buildYourOwnComputer.VerifyUserShouldAbleToFillDetailsForBuildIt();


    }
    @Test
    public void VerifyUserShouldAbleToVoteAlter(){
        homePage.verifyVoteAlter();
    }
    @Test
    public void verifyFacebookIsWorkingAsPerUserRequirements(){
        homePage.clickOnFacebookFollowUs();
        facebookPage.goToFacebookInNopCommerce();
        homePage.welcomeToOurStore();
    }


}





