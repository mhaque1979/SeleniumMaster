package revisions;

import org.openqa.selenium.WebDriver;

public class calling_opencloseBR {
	
	public static WebDriver dr = opencloseBR.dr;

	public static void main(String[] args) {
		
		opencloseBR.openBR("https://www.cnn.com/");
		utility.click("//*[@id=\"search-button\"]");
		utility.typing("//*[@id=\"search-input-field\"]", "bangladesh");
		utility.click("//*[@id=\"submit-button\"]");
		
		
		
		opencloseBR.closeBR();
	}

}
