package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumTraining {

	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playicon;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pauseicon;
	
	@FindBy(xpath="//span[contains(text(),'Add To Wishlist')]")
	private WebElement addtowishlist;
	
	
	public SeleniumTraining(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void play() {
		playicon.click();
	}

	public void pause() {
		pauseicon.click();
	}
	
	public void wishlist() {
		addtowishlist.click();
	}
}
