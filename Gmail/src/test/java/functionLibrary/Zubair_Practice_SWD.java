



	package functionLibrary;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;


	public class Zubair_Practice_SWD {

		public static WebDriver driver=OpenCloseBrowser.driver;
		
		
		public static void clickObject(final By propertyValue) {
			driver.findElement(propertyValue).click();
				
		}
		public static void typeValue(final By propertyValue,String inputValue) {
			driver.findElement(propertyValue).sendKeys(inputValue);
		}
					
		public static void waitForObjectDisplay(final By propertyValue) {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(propertyValue));
		}
		
		public static void selectByValue(final By propertyValue, String selectValue) {
		
				WebElement element=driver.findElement(propertyValue);
				Select select = new Select (element);
				select.selectByValue(selectValue.trim());
				
			}
		
		
		
		public static void selectByText(final By propertyValue, String selectValue) {
		
				WebElement element=driver.findElement(propertyValue);
				Select select = new Select (element);
				select.selectByVisibleText(selectValue.trim());
				
			}
		
		
		public static void selectByIndex(final By propertyValue, int indexNumber) {
		
				WebElement element=driver.findElement(propertyValue);
				Select select = new Select (element);
				select.selectByIndex(indexNumber);
		
			}
		
	}
