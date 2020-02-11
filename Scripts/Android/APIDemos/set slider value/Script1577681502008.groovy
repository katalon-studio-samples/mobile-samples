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


//apps is started from TestListner

Mobile.scrollToText('Views')

Mobile.tap(findTestObject('Android/Seek Bar/android.widget.TextView0 - Views'), 0)

Mobile.scrollToText('Seek Bar')

Mobile.tap(findTestObject('Android/Seek Bar/android.widget.TextView0 - Seek Bar'), 0)

Mobile.setSliderValue(findTestObject('Android/Seek Bar/android.widget.SeekBar0'), value, 3)

Mobile.verifyElementAttributeValue(findTestObject('Android/Seek Bar/android.widget.TextView0'), 'text', value + ' from touch=true', 0)


