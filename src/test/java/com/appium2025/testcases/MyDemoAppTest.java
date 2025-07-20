package com.appium2025.testcases;

import com.appium2025.common.BaseTest;
import com.appium2025.drivers.DriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class MyDemoAppTest extends BaseTest {
    @Test
    public void testDemoLocator() {
        WebElement headerPage1 = DriverManager.getDriver().findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/productTV"));
        System.out.println("Header 1: " + headerPage1.getText());

        WebElement headerPage2 = DriverManager.getDriver().findElement(AppiumBy.accessibilityId("title"));
        System.out.println("Header 2" + headerPage2.getText());

        WebElement productName1 = DriverManager.getDriver().findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Sauce Labs Backpack\")"));
        System.out.println("Product 1: " + headerPage1.getText());

        WebElement productName2 = DriverManager.getDriver().findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Product Title\" and @text=\"Sauce Labs Backpack (green)\"]\n"));
        System.out.println("Product 2" + headerPage1.getText());

        WebElement clickImage1 = DriverManager.getDriver().findElement(AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[1]\n"));
        clickImage1.click();
        sleep(1);

        WebElement clickAddToCard1 = DriverManager.getDriver().findElement(AppiumBy.accessibilityId("Tap to add product to cart"));
        clickAddToCard1.click();
        sleep(1);

        WebElement clickAddToCard2 = DriverManager.getDriver().findElement(AppiumBy.accessibilityId("Tap to add product to cart"));
        clickAddToCard2.click();
        sleep(1);

        WebElement clickAddToCard3 = DriverManager.getDriver().findElement(AppiumBy.accessibilityId("Tap to add product to cart"));
        clickAddToCard3.click();
    }

    @Test
    public void testXpathAxes() {
        //Lay tat ca element con
       // WebElement parentElement = DriverManager.getDriver().findElement(AppiumBy.accessibilityId("Displays all products of catalog"));
       // List<WebElement> childElements = parentElement.findElements(AppiumBy.xpath("Child::*"));
       // for (WebElement element: childElements){
       //     System.out.println(element);
       // }


        //Chi lay 1 element con theo element cha
        //WebElement parentElement2 = DriverManager.getDriver().findElement(AppiumBy.accessibilityId("Displays all products of catalog"));
        //WebElement childElement4 = parentElement2.findElement(AppiumBy.xpath("Child::android.view.ViewGroup[4]/android.widget.TextView[1]"));
        //System.out.println("Product Name 4: " + childElement4.getText());

        //Lay element con thu 2 truc tiep bang 1 cu phap xpath
        WebElement productName2 = DriverManager.getDriver().findElement(AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]/android.view.ViewGroup[2]/android.widget.TextView[1]"));
        System.out.println("Product Name 2: " + productName2.getText());

        WebElement productPrice2 = DriverManager.getDriver().findElement(AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]/android.view.ViewGroup[2]/android.widget.TextView[2]"));
        System.out.println("Product Price 2: " + productPrice2.getText());

        WebElement productName3 = DriverManager.getDriver().findElement(AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]/android.view.ViewGroup[3]/android.widget.TextView[1]"));
        System.out.println("Product Name 3: " + productName2.getText());

        WebElement productPrice3 = DriverManager.getDriver().findElement(AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]/android.view.ViewGroup[3]/android.widget.TextView[2]"));
        System.out.println("Product Price 3: " + productPrice2.getText());

        WebElement productName = DriverManager.getDriver().findElement(AppiumBy.xpath("//android.widget.TextView[@text='Sauce Labs Backpack (green)']"));
       // String textValue = productName.getAttribute("text");
        System.out.println("Product name: " + productName.getAttribute("text"));
    }

   @Test
   public void TestXpathAxes2() {
        //Test Locator Contains
       List<WebElement> productNameContains = DriverManager.getDriver().findElements(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Sauce Labs Backpack')]"));
       for (WebElement item : productNameContains) {
           System.out.println("Product name: " + item.getAttribute("text"));
       }

       //Test Locator ket hop dieu kien
       WebElement productName = DriverManager.getDriver().findElement(AppiumBy.xpath("//android.widget.TextView[@text='Sauce Labs Backpack' and @class='android.widget.TextView']"));
       System.out.println("Product Name And/Or: " + productName.getAttribute("text"));

       //Test Locator Translate
       WebElement productName1 = DriverManager.getDriver().findElement(AppiumBy.xpath("//android.widget.TextView[translate(@text, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz')='sauce labs backpack']"));
       System.out.println("Product Name Translate: " + productName1.getAttribute("text"));
   }

   @Test
    public void testLocatorAxes3(){
        //Test Locator Ancestor
       WebElement ancestorElement = DriverManager.getDriver().findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Product Title\" and @text=\"Sauce Labs Backpack\"]/ancestor::androidx.recyclerview.widget.RecyclerView"));
       System.out.println("Ancestor Element: " + ancestorElement.getAttribute("content-desc"));

       //Test Locator Descendant
       WebElement descendantElement = DriverManager.getDriver().findElement(AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]/descendant::android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/titleTV'][3]"));
       System.out.println("Descendant Element: " + descendantElement.getAttribute("text"));

       //Test Locator Following-Sibling
       WebElement followingSiblingElement = DriverManager.getDriver().findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Product Title\" and @text=\"Sauce Labs Backpack\"]/following-sibling::android.widget.TextView"));
       System.out.println("Following-Sibling Element: "+ followingSiblingElement.getAttribute("text"));

       //Test Locator Following-Sibling
       WebElement precedingSiblingElement = DriverManager.getDriver().findElement(AppiumBy.xpath("(//android.widget.TextView[@content-desc=\"Product Price\"])[4]/preceding-sibling::android.widget.TextView"));
       System.out.println("Preceding-Sibling Element: "+ precedingSiblingElement.getAttribute("text"));

       //Test Locator Following
       //WebElement followingElement = DriverManager.getDriver().findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Product Title\" and @text=\"Sauce Labs Backpack\"]/following::android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/priceTV'][4]"));
       //System.out.println("Following Element: " + followingElement.getAttribute("text"));

       //Test Locator Following
       //WebElement precedingElement = DriverManager.getDriver().findElement(AppiumBy.xpath("(//android.widget.TextView[@content-desc=\"Product Price\"])[4]/preceding::android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/titleTV'][3]"));
       //System.out.println("Preceding Element: " + precedingElement.getAttribute("text"));
    }

}

