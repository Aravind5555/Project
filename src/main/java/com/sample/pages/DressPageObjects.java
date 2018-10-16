package com.sample.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DressPageObjects extends BasePage {

	@FindBy(xpath="//*[@class='heading-counter']")
	private WebElement header;
	
	@FindBys(@FindBy(xpath="//*[@id='center_column']/ul/li"))
	private List<WebElement> ProductList;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[1]")
	private WebElement SizeS;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[2]")
	private WebElement SizeM;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[3]")
	private WebElement SizeL;
	
	@FindBy(xpath="//*[@id='center_column']/ul/li[1]//h5/a")
	private WebElement Imgcartbtn; 
	
	@FindBy(xpath="//*[@id='add_to_cart']")
	private WebElement Cartbtn; 
	
	@FindBy(xpath="//*[@class='icon-ok']")
	private WebElement Cartpageproductadded; 
	
	@FindBy(xpath="//*[@id='layer_cart']//span")
	private WebElement Closecartpage; 

	@FindBy(xpath="//*[@id='center_column']/h1/span[2]")
	private List<WebElement> Producttext; 
	
	@FindBy(xpath="//*[@class='product_list grid row']/li")
	private List<WebElement> Productsize; 
	
	@FindBy(xpath="//*[@id='selectProductSort']")
	private List<WebElement> Selectlowest; 
	
	
	public DressPageObjects(){
		PageFactory.initElements(driver, this);
	}
		
	public int getHeaderProductNo(){
		String word=header.getText().split(" ")[2];
		return Integer.parseInt(word);
	}
		public int getTotalproduct(){
			return  ProductList.size();
		}
		
	public WebElement sizeScategory(){
		return SizeS;
		
	}
	public WebElement sizeMcategory(){
		return SizeM;
		
	}
	public WebElement sizeLcategory(){
		return SizeL;
		
	}
	public WebElement clickimgcart(){
		 Imgcartbtn.click();
		 return Imgcartbtn;
		
	}
	public WebElement clickcartbtn(){
		Cartbtn.click();
		return Cartbtn;
	}
	
	public WebElement Closecartbtn(){
		Closecartpage.click();
		return Cartbtn;
	}
	
	public WebElement productaddedsuccessfully(){
	
		return Cartpageproductadded;
	}
	
	
	public List<String> productno(){
		List<String>listno=new ArrayList<String>();
		for(WebElement e:Producttext){
			listno.add(e.getText().split(" ")[2]);
		
	}
	
		return listno;
	}

	
}
