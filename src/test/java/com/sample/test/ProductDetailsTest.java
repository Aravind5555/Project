package com.sample.test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.sample.pages.HomePageObjects;
import com.sample.pages.ProductDetailPageObjects;

public class ProductDetailsTest  {
HomePageObjects homepage;
ProductDetailPageObjects productdetailspage;

public ProductDetailsTest(){
	homepage=new HomePageObjects();
	productdetailspage=new ProductDetailPageObjects();
}

@Test
public void verifyProductDetailsDescription(){

homepage.clickfirstproduct();
Assert.assertTrue(productdetailspage.verifyProductDescription().isDisplayed());
Assert.assertTrue(productdetailspage.clickTweet().contains("Tweet"));
Assert.assertTrue(productdetailspage.clickShare().contains("Share"));

}


}