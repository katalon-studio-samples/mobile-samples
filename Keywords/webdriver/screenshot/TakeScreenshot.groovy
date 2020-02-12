package webdriver.screenshot

import org.apache.commons.io.FileUtils
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling

import io.appium.java_client.AppiumDriver
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import katalon.common.BaseKeyword

public class TakeScreenshot extends BaseKeyword{

	/**
	 * Verify two images are matched or not
	 * @param expectedImgPath the location of expected image
	 * @param actualImgPath the location of actual image
	 * @return
	 */
	@Keyword
	public boolean takeScreenshot(String expectedFilename, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE){
		AppiumDriver driver = MobileDriverFactory.getDriver();
		try{
			//Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot = (TakesScreenshot)driver

			//Call getScreenshotAs method to create image file
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE)

			//Move image file to new destination
			File DestFile = new File(expectedFilename)

			//Copy file at destination
			FileUtils.copyFile(SrcFile, DestFile)
		}catch(ex){
			handleError(ex, flowControl)
		}
	}
}
