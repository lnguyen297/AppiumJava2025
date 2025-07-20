package com.appium2025.testcases;

import com.appium2025.Keywords.MobileUI;
import com.appium2025.common.BaseTest;
import com.appium2025.drivers.DriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TaurusAppTest extends BaseTest {
   // @Test
    public void testLoginTaurusApp() {
        // Tìm và tương tác với các phần tử giao diện
        // Nhập email
        WebElement inputEmail = DriverManager.getDriver().findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"Mobile App Flutter Beta\"]/following-sibling::android.widget.EditText)[1]"));
        inputEmail.click();
        inputEmail.sendKeys("admin");

        // Nhập password
        WebElement inputPassword = DriverManager.getDriver().findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"Mobile App Flutter Beta\"]/following-sibling::android.widget.EditText)[2]"));
        inputPassword.click();
        inputPassword.sendKeys("admin");

        // Nhấn nút "Sign in"
        WebElement signInButton = DriverManager.getDriver().findElement(AppiumBy.accessibilityId("Sign in"));
        signInButton.click();

        // Đợi sau khi nhấn nút Sign in
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Kiểm tra kết quả đăng nhập
        // Ví dụ: Tìm kiếm một phần tử chỉ xuất hiện khi đăng nhập thành công
        WebElement menuElement = DriverManager.getDriver().findElement(AppiumBy.accessibilityId("Menu"));
        if (menuElement.isDisplayed()) {
            System.out.println("Login thành công!");
        } else {
            System.out.println("Login thất bại!");
        }
    }

    //Test Login Page Verification
    @Test
    public void loginPageVerification(){
        WebElement loginPageImage = DriverManager.getDriver().findElement(AppiumBy.xpath("//android.widget.ImageView"));
        loginPageImage.isDisplayed();

        WebElement loginPageContent = DriverManager.getDriver().findElement(AppiumBy.accessibilityId("Mobile App Flutter Beta"));
        loginPageContent.isDisplayed();

        WebElement loginPageEmail = DriverManager.getDriver().findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
        loginPageEmail.isEnabled();

        WebElement loginPagePassword = DriverManager.getDriver().findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
        loginPagePassword.isEnabled();

        WebElement loginPageSignInButton = DriverManager.getDriver().findElement(AppiumBy.accessibilityId("Sign in"));
        loginPageSignInButton.isEnabled();

        WebElement loginPageResetAccount = DriverManager.getDriver().findElement(AppiumBy.accessibilityId("Reset account"));
        loginPageResetAccount.isEnabled();
        MobileUI.sleep(3);
    }

    @Test
    public void loginFunction(){

        //Test Reset Account
        WebElement resetAccount = DriverManager.getDriver().findElement(AppiumBy.accessibilityId("Reset account"));
        resetAccount.click();
        //WebElement resetAccountMessage = DriverManager.getDriver().findElement(AppiumBy.accessibilityId("Account reset successfully"));
        //resetAccountMessage.isDisplayed();

        //Test Warning Message
        WebElement loginPageSignInButton = DriverManager.getDriver().findElement(AppiumBy.accessibilityId("Sign in"));
        loginPageSignInButton.click();
        WebElement emailIsRequired = DriverManager.getDriver().findElement(AppiumBy.accessibilityId("Email is required"));
        emailIsRequired.isDisplayed();
        WebElement passwordIsRequired = DriverManager.getDriver().findElement(AppiumBy.accessibilityId("Password is required"));
        passwordIsRequired.isDisplayed();

        //Test Input Email
        WebElement loginPageEmail = DriverManager.getDriver().findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
        loginPageEmail.click();
        loginPageEmail.sendKeys("admin");

        //Test Input Password
        WebElement loginPagePassword = DriverManager.getDriver().findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
        loginPagePassword.click();
        loginPagePassword.sendKeys("admin");

        //Test Click Sign In Button
        loginPageSignInButton.click();

        //Test Sign In Successfully With Menu Is Displayed
        WebElement mainPageMenu = DriverManager.getDriver().findElement(AppiumBy.accessibilityId("Menu"));
        mainPageMenu.isDisplayed();
        MobileUI.sleep(3);
    }
}