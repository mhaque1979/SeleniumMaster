package smoke_test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import functionLibrary.BeforeAfterSetup;
import functionLibrary.SWD_Function;

public class New_TestNG extends BeforeAfterSetup{
  @Test
  public void zubai() {
	  System.out.println("I am here");
	  SWD_Function.typeValue(By.name("userName"), "ufttest01");
	  SWD_Function.typeValue(By.name("password"), "1234uft1");
	  SWD_Function.clickObject(By.xpath("//input[@name='login']"));
	  
	  try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
