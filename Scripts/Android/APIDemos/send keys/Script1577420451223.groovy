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

Mobile.tap(findTestObject('Android/Set Text/android.widget.TextView0 - Content'), 0)

Mobile.tap(findTestObject('Android/Set Text/android.widget.TextView0 - Clipboard'), 0)

Mobile.tap(findTestObject('Android/Set Text/android.widget.TextView0 - Data Types'), 0)

TestObject txtEdit = findTestObject('Android/Set Text/android.widget.EditText0')

Mobile.clearText(txtEdit, 0)

Mobile.sendKeys(txtEdit, inputText)

String textGot = Mobile.getText(findTestObject('Android/Set Text/android.widget.EditText0'), 0)

Mobile.verifyMatch(inputText, textGot, false)