package com.appium2025.testcases;

import com.appium2025.common.BaseTest;
import com.appium2025.drivers.DriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

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


}
