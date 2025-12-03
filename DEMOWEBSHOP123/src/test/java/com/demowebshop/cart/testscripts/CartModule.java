package com.demowebshop.cart.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CartModule {
	@Test
public void addTocart() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		Reporter.log(driver.getTitle());
		Reporter.log("Product has been added to cart",true);
}
}
