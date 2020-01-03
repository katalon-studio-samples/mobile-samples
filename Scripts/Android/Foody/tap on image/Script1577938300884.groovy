import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'apps is started from TestListner'

'dismiss What"s New pop up'
TestObject btnWhatNewclose = findTestObject('Android/Tap On Image/android.widget.TextView0 - Foody Whats New pop up - Close')
Mobile.tap(btnWhatNewclose, 60, FailureHandling.OPTIONAL)
Mobile.waitForElementPresent(findTestObject('Android/Tap On Image/android.widget.ImageView0 - top products list'),60)

'dismiss advertisement'
Mobile.tap(findTestObject('Android/Tap On Image/android.widget.TextView0 - Dont show again'), 7, FailureHandling.OPTIONAL)

'tap on Discovery image'
String imageFullPath = GlobalVariable.currentProjDir + imageShortPath
Mobile.tapOnImage(imageFullPath)
Mobile.verifyElementExist(findTestObject('Android/Tap On Image/android.widget.TextView0 - Choose delivery address'), 3)
