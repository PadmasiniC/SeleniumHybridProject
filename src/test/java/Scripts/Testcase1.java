package Scripts;

import org.testng.annotations.Test;

import GenericLib.BaseClass;
import GenericLib.WebDriverUtilies;
import PomPages.AddtoCart;
import PomPages.SkillraryLoginpage;
import PomPages.SkillrarydemoApp;

public class Testcase1  extends BaseClass {
	
	@Test
	public void tc1() {
		SkillraryLoginpage s=new SkillraryLoginpage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication(); 
		
		SkillrarydemoApp sd =new SkillrarydemoApp(driver);
		driverutilies.switchTabs(driver);
		driverutilies.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingbtn();
		
		AddtoCart a=new AddtoCart(driver);
		driverutilies.doubleClick(driver,a.getAdd());
		a.addtocart();
	}
} 