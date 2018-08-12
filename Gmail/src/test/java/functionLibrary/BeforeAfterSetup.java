package functionLibrary;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BeforeAfterSetup {
	
	@BeforeTest
	public static void beforeTest() {
		OpenCloseBrowser.openBrowser(Constant.bName, Constant.appUrl);
	}
	
	@AfterTest
	public static void afterTest() {
		OpenCloseBrowser.closeBrowser();
	}

}
