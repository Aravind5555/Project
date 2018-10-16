package com.sample.test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sample.pages.BasePage;
import com.sample.pages.DressPageObjects;
import com.sample.pages.HomePageObjects;

public class DressPageTest{
	BasePage bp;
	HomePageObjects homepage;
	DressPageObjects dresspage;
	

public DressPageTest(){
	homepage=new HomePageObjects();
	dresspage=new DressPageObjects();
	bp=new BasePage();
}


@Test
	public void verifyProductSizeCount(){
		homepage.clickDresspage();
		Assert.assertEquals(dresspage.getTotalproduct(),dresspage.getHeaderProductNo(), "Failed");
		Assert.assertTrue(dresspage.sizeScategory().isDisplayed());
		Assert.assertTrue(dresspage.sizeMcategory().isDisplayed());
		Assert.assertTrue(dresspage.sizeLcategory().isDisplayed());
	}
@Test
public void verifyaddcart(){
	homepage.clickDresspage();
	dresspage.clickimgcart();
	dresspage.clickcartbtn();
    bp.isElementVisible(dresspage.productaddedsuccessfully());
Assert.assertTrue(bp.elementFound(dresspage.productaddedsuccessfully()));
 dresspage.Closecartbtn();
	
}

@Test
public void verifyproductno(){
	homepage.clickDresspage();
	List<String>l1=dresspage.productno();
	
	
	
	
}


}