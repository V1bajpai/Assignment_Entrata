package org.entrata.assignment;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestEntrata extends BaseTest {

//    // Test 1: Verify navigation to the Login page
//    @Test
//    public void testNavigateToLogin() {
//        driver.findElement(By.linkText("Login")).click();
//        String expectedUrl = "https://www.entrata.com/login"; // Update with actual URL
//        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "User should be navigated to the login page.");
//    }
//
//    // Test 2: Check if the Contact Us form is displayed
//    @Test
//    public void testContactUsFormVisible() {
//        driver.findElement(By.linkText("Contact Us")).click();
//        WebElement form = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.id("contact-form"))); // Adjust ID accordingly
//        Assert.assertTrue(form.isDisplayed(), "Contact Us form should be visible.");
//    }
//
//    // Test 3: Verify the existence of dynamic content
//    @Test
//    public void testDynamicContent() {
//        driver.findElement(By.linkText("Features")).click();
//        String dynamicText = driver.findElement(By.className("dynamic-content")).getText(); // Adjust class accordingly
//        Assert.assertFalse(dynamicText.isEmpty(), "Dynamic content should not be empty.");
//    }
//
//    // Test 4: Validate that the Sign Up button is present
//    @Test
//    public void testSignUpButtonPresence() {
//        WebElement signUpButton = driver.findElement(By.id("signup-button")); // Adjust ID accordingly
//        Assert.assertTrue(signUpButton.isDisplayed(), "Sign Up button should be present on the page.");
//    }
//
//    // Test 5: Check if the search functionality is available
//    @Test
//    public void testSearchFunctionality() {
//        WebElement searchBox = driver.findElement(By.name("search")); // Adjust name accordingly
//        Assert.assertTrue(searchBox.isDisplayed(), "Search box should be present on the page.");
//    }
	// Test 1: Validate the title of a page
	@Test
    public void test1_testNavigateToHomePage() {
        // Navigate to Amazon India
        driver.get("https://www.amazon.in/");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Title should match");
    }

    // Test 2: Validate search functionality Search for a product
    @Test
    public void test2_testSearchFunctionality() {
        driver.get("https://www.amazon.in/");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Laptop");
        Assert.assertEquals(searchBox.getAttribute("value"), "Laptop", "Search box should contain 'Laptop'");
    }

    // Test 3: Navigate to the Deals section
    @Test
    public void test3_testNavigateToDeals() {
        driver.get("https://www.amazon.in/");
        WebElement dealsLink = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
        dealsLink.click();
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Great Indian Festival"), "Should navigate to Today's Deals page");
    }

    // Test 4: Verify dynamic content on the homepage
    @Test
    public void test4_testVerifyDynamicContent() {
        driver.get("https://www.amazon.in/");
        WebElement signInButton = driver.findElement(By.id("nav-link-accountList"));
        Assert.assertTrue(signInButton.isDisplayed(), "Sign In button should be visible");
    }
}

