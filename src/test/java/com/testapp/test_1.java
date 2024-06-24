package com.testapp;

import org.testng.annotations.Test;

public class test_1 extends BaseTest{
    @Test
    public void useCase() {
        driver.get("https://www.google.com");
    }
}
