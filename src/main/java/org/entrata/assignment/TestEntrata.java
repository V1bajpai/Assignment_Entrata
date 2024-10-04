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

