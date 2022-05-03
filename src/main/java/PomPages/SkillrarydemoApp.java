package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillrarydemoApp {
//declaring webelements
	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtrainingtab;
			
//Initializing	
	public  SkillrarydemoApp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="addresstype")
	private WebElement address;
	
	
	//utilizing
	public WebElement getCoursetab() {
		return coursetab;
	}

	public  SkillrarydemoApp(WebElement coursetab) {
		this.coursetab = coursetab;
	}

	
	public WebElement getAddress() {
		return address;
	}

	public WebElement getSeleniumtrainingtab() {
		return seleniumtrainingtab;
	}
	
	public void seleniumtrainingbtn() {
		seleniumtrainingtab.click();
	}
}

