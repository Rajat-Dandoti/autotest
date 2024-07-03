package com.testapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class test_1 extends BaseTest{
    @Test
    public void useCase() throws InterruptedException {
        driver.get("https://www.globalsqa.com/demo-site/");
        WebElement test = driver.findElement(By.xpath("(//div[text()='contact@globalsqa.com'])[2]"));
        Actions action = new Actions(driver);
        Thread.sleep(2000);
        action.scrollToElement(test).perform();
        Thread.sleep(3000);
    }
}
