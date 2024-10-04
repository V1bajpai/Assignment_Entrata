package org.entrata.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestEntrata extends BaseTest {

    // Test 1: Verify navigation to the Login page
    @Test
    public void testNavigateToLogin() {
        driver.findElement(By.linkText("Login")).click();
        String expectedUrl = "https://www.entrata.com/login"; // Update with actual URL
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "User should be navigated to the login page.");
    }

    // Test 2: Check if the Contact Us form is displayed
    @Test
    public void testContactUsFormVisible() {
        driver.findElement(By.linkText("Contact Us")).click();
        WebElement form = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("contact-form"))); // Adjust ID accordingly
        Assert.assertTrue(form.isDisplayed(), "Contact Us form should be visible.");
    }

    // Test 3: Verify the existence of dynamic content
    @Test
    public void testDynamicContent() {
        driver.findElement(By.linkText("Features")).click();
        String dynamicText = driver.findElement(By.className("dynamic-content")).getText(); // Adjust class accordingly
        Assert.assertFalse(dynamicText.isEmpty(), "Dynamic content should not be empty.");
    }

    // Test 4: Validate that the Sign Up button is present
    @Test
    public void testSignUpButtonPresence() {
        WebElement signUpButton = driver.findElement(By.id("signup-button")); // Adjust ID accordingly
        Assert.assertTrue(signUpButton.isDisplayed(), "Sign Up button should be present on the page.");
    }

    // Test 5: Check if the search functionality is available
    @Test
    public void testSearchFunctionality() {
        WebElement searchBox = driver.findElement(By.name("search")); // Adjust name accordingly
        Assert.assertTrue(searchBox.isDisplayed(), "Search box should be present on the page.");
    }
}

