package Scripts;

import java.awt.Point;
import java.io.IOException;

import org.testng.annotations.Test;

import GenericLib.BaseClass;
import GenericLib.WebDriverUtilies;
import PomPages.SkillraryLoginpage;
import PomPages.SkillrarydemoApp;
import PomPages.TestingPage;

public class Testcase2 extends BaseClass {
	@Test
	public void tc2() throws IOException {
		SkillraryLoginpage s=new SkillraryLoginpage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		SkillrarydemoApp sd=new SkillrarydemoApp(driver);
		driverutilies.switchTabs(driver);
		driverutilies.dropDown(sd.getAddress(),pdata.getPropertyfiledata("dropdowndata"));
		
		TestingPage t=new TestingPage(driver);
		driverutilies.draganddrop(driver,t.getSeleniumTraining(),t.getCart());
		org.openqa.selenium.Point loc=t.getCart().getLocation();
		int x=loc.getX();
		int y=loc.getY();
		driverutilies.scrollBar(driver,x,y);
		}
	}
