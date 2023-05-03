package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Timestamp;

public class Utils extends BasePage{
    public static void clickOnElement(By by){driver.findElement(by).click();}
    public static void typeText(By by,String text){
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }
    public static long timestamp(){
        Timestamp timestamp =new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();}

    protected static WebDriver driver;
    static Timestamp timestamp =new Timestamp(System.currentTimeMillis());


}
