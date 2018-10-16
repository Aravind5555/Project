package com.sample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPageObjects extends BasePage {
	@FindBy(xpath="//*[@id='short_description_block']")
	private WebElement ProductDescription;
	
	@FindBy(xpath="//*[@class='btn btn-default btn-twitter']")
	private WebElement Tweet;
	
	@FindBy(xpath="//*[@class='btn btn-default btn-facebook']")
	private WebElement Share;
	
	public ProductDetailPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement  verifyProductDescription(){
		return ProductDescription;
		
	}
	
	
	
public String clickTweet(){
	String Tweetget=Tweet.getText();
	System.out.println(Tweetget);
	return Tweetget;
}

public String clickShare(){
	String Shareget=Share.getText();
	return Shareget;
}
}
