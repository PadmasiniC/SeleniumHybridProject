package PomPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.BaseClass;

public class SkillraryLoginpage {
	// declaration
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy (xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	@FindBy(name="q")
	private WebElement searchtextfield;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchicon;
	
	public void searchfield(String searchtext) {
		searchtextfield.sendKeys(searchtext);
	}
	public void iconsearch() {
		searchicon.click();
	}
	
//Initializing process
	public SkillraryLoginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void gearsbutton() {
		gearsbtn.click();
	}
	
	public void skillrarydemoapplication() {
		skillrarydemoapp.click();
	}
}

