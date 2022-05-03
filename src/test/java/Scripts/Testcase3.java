package Scripts;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLib.BaseClass;
import PomPages.CorejavaSeleniumpage;
import PomPages.SeleniumTraining;
import PomPages.SkillraryLoginpage;

public class Testcase3 extends BaseClass {

	@Test
	public void tc3() throws IOException {
		SkillraryLoginpage s=new SkillraryLoginpage(driver);
		s.searchfield(pdata.getPropertyfiledata("searchtext"));
		s.iconsearch(); 
		//driverutilies.alertPopups(driver);
		CorejavaSeleniumpage cs=new CorejavaSeleniumpage(driver);
		cs.javalink();
	
		// handle the cookies 
		driver.findElement(By.xpath("//a[@class='close_cookies']")).click();
		driverutilies.switchFrame(driver);
								
		SeleniumTraining st=new SeleniumTraining(driver);
		st.play();
		st.pause();
		driverutilies.switchBackFrame(driver);
		st.wishlist();
	}
}
