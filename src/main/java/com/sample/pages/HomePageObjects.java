package com.sample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {

	
	
@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]")
private WebElement clickwomen;

@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]")
private WebElement clickdress;

@FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]")
private WebElement clicktshirt;

@FindBy(xpath="//*[@id='newsletter-input']")
private WebElement Email;

@FindBy(xpath="//*[@name='submitNewsletter']")
private WebElement SubmitBtn;

@FindBy(xpath="//*[@id='homefeatured']/li[1]//h5/a")
private WebElement firstproduct;

@FindBy(xpath="//*[@id='columns']/p")
private WebElement verifyemail;



public HomePageObjects() {
	PageFactory.initElements(driver, this);
}

public WebElement checkwomentabs(){
	
	return clickwomen;
	
}

public WebElement checkdresstabs(){
	
	return clickdress;
	
}

public WebElement checktshirttabs(){
	
	return clicktshirt;
	
}

public void clickfirstproduct(){
	firstproduct.click();
	

}
public String clickWomenpage(){
	clickwomen.click();
	String women=clickwomen.getText();
	return women;
	}

public String clickDresspage(){
	clickdress.click();
	String dress=clickdress.getText();
	return dress;
}


public String clicktshirtpage(){
	clicktshirt.click();
	String out=clicktshirt.getText();
	return out;
}

public void mailid(String name){
Email.sendKeys(name);	
SubmitBtn.click();

}
public String verifysubscriptionlert(){
	String mail=verifyemail.getText();
	return mail;
}	

}





