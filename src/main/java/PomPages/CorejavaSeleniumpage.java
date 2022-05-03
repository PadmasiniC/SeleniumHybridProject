package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorejavaSeleniumpage {
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
			private WebElement corejavalink;
	
	public void javalink( ) {
		corejavalink.click();	
			
		}
	
	public CorejavaSeleniumpage(WebDriver driver) {
		PageFactory.initElements (driver, this);
	}

}
