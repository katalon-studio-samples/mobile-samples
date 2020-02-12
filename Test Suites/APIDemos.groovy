import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.annotation.SetupTestCase
import com.kms.katalon.core.annotation.TearDown
import com.kms.katalon.core.annotation.TearDownTestCase

import com.kms.katalon.core.configuration.RunConfiguration
import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import com.kms.katalon.core.mobile.driver.MobileDriverType

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver

/**
 * Some methods below are samples for using SetUp/TearDown in a test suite.
 */

/**
 * Setup test suite environment.
 */
@SetUp(skipped = false) 
def setUp() {
	if (GlobalVariable.deviceName) {
		'start application in saucelabs'
		String sauceLabsServerUrl = "https://eu1.appium.testobject.com/wd/hub";
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", GlobalVariable.platformName);
		capabilities.setCapability("platformVersion", GlobalVariable.platformVersion);
		capabilities.setCapability("deviceName", GlobalVariable.deviceName);
		capabilities.setCapability("testobject_api_key", GlobalVariable.apiDemoApps_api_key);
		capabilities.setCapability('app', GlobalVariable.apiDemoAppsId)
		AppiumDriverManager.createMobileDriver(MobileDriverType.ANDROID_DRIVER, capabilities, new URL(sauceLabsServerUrl))
	} else {
		'start application in real device'
		Mobile.startApplication(GlobalVariable.currentProjDir + GlobalVariable.apiDemoAppsPath, true)		
	}
}

/**
 * Clean test suites environment.
 */
@TearDown(skipped = false) 
def tearDown() {
	Mobile.closeApplication()
}

/**
 * Run before each test case starts.
 */
@SetupTestCase(skipped = true) 
def setupTestCase() {
	// Put your code here.
}

/**
 * Run after each test case ends.
 */
@TearDownTestCase(skipped = false) 
def tearDownTestCase() {
	AppiumDriver driver = MobileDriverFactory.getDriver();
	driver.resetApp()
}

/**
 * References:
 * Groovy tutorial page: http://docs.groovy-lang.org/next/html/documentation/
 */