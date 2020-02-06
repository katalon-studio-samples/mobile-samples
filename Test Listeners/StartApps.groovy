import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

import com.kms.katalon.core.configuration.RunConfiguration
import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import com.kms.katalon.core.mobile.driver.MobileDriverType

class StartApps {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	
	@BeforeTestCase
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {		
		String fullTestCasePath = testCaseContext.getTestCaseId()
		Number lastSlashIndex = fullTestCasePath.lastIndexOf('/')
		String partialTestCasepPath = fullTestCasePath.substring(19, lastSlashIndex)
		if (GlobalVariable.deviceName) {
			'start application in saucelabs'
			String sauceLabsServerUrl = "https://eu1.appium.testobject.com/wd/hub";
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("platformName", GlobalVariable.platformName);
			capabilities.setCapability("platformVersion", GlobalVariable.platformVersion);
			capabilities.setCapability("deviceName", GlobalVariable.deviceName);
			switch (partialTestCasepPath) {
				case 'APIDemos':
					capabilities.setCapability("testobject_api_key", GlobalVariable.apiDemoApps_api_key);
					capabilities.setCapability('app', GlobalVariable.apiDemoAppsId)
					AppiumDriverManager.createMobileDriver(MobileDriverType.ANDROID_DRIVER, capabilities, new URL(sauceLabsServerUrl))
					break;
				case 'DragAndDropDemos':
					capabilities.setCapability("testobject_api_key", GlobalVariable.dragSortApps_api_key);
					capabilities.setCapability('app', GlobalVariable.dragSortDemoAppsId)
					AppiumDriverManager.createMobileDriver(MobileDriverType.ANDROID_DRIVER, capabilities, new URL(sauceLabsServerUrl))
					break;
				case 'Foody':
					testCaseContext.skipThisTestCase() //image_based keywords requires opencv4nodejs to be installed to verify them
					break;
			}
		} else {
			'start application in real device'
			switch (partialTestCasepPath) {
				case 'APIDemos':
					Mobile.startApplication(GlobalVariable.currentProjDir + GlobalVariable.apiDemoAppsPath, true)
					break;
				case 'DragAndDropDemos':
					Mobile.startApplication(GlobalVariable.currentProjDir + GlobalVariable.dragAndDropDemoAppsPath, true)
					break;
				case 'Foody':
					Mobile.startApplication(GlobalVariable.currentProjDir + GlobalVariable.foodyAppsPath, true)
					break;
			}
		}

		
	}
}