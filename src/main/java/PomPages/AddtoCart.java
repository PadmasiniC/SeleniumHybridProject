package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
	//declaring
	@FindBy(id="add")
	private WebElement add;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement cartbtn;

	//intializing
public AddtoCart(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

//utilizing
public WebElement getAdd() {
	return add;
}

public WebElement getCartbtn() {
	return cartbtn;
}


public void addtocart()
{
	cartbtn.click();
}

}









