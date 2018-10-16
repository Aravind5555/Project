package com.sample.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sample.pages.HomePageObjects;
import com.sample.pages.ProductDetailPageObjects;
public class HomePageTest {
	HomePageObjects homepage;
	String name="kumar555@gmail.com";
	public HomePageTest(){
		homepage=new HomePageObjects();
		
	}
	
	@Test
	public void verifytabdisplay(){

Assert.assertTrue(homepage.checkwomentabs().isDisplayed());
Assert.assertTrue(homepage.checkdresstabs().isDisplayed());
Assert.assertTrue(homepage.checktshirttabs().isDisplayed());	
}
	
	
	
	@Test
	public void verifyPageNavigation(){

Assert.assertTrue(homepage.clickWomenpage().contains("WOMEN"));
Assert.assertTrue(homepage.clickDresspage().contains("DRESSES"));
Assert.assertTrue(homepage.clicktshirtpage().contains("T-SHIRTS"));
	
	
}
	
	@Test
	public void verifysubscription(){
		homepage.mailid(name);
		System.out.println(homepage.verifysubscriptionlert());
	Assert.assertTrue(homepage.verifysubscriptionlert().contains("Newsletter"));
	
		
		
	}
	
	
}
