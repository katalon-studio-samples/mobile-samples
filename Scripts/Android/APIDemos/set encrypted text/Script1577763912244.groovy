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
import com.kms.katalon.util.CryptoUtil



//apps is started from TestListner

Mobile.scrollToText('Views')

Mobile.tap(findTestObject('Android/Set Encrypted Text/android.widget.TextView0 - Views'), 0)

Mobile.scrollToText('Layouts')

Mobile.tap(findTestObject('Android/Set Encrypted Text/android.widget.TextView0 - Lists'), 0)

Mobile.scrollToText('Transcript')

Mobile.tap(findTestObject('Android/Set Encrypted Text/android.widget.TextView0 - 12. Transcript'), 0)

def encryptedText = CryptoUtil.encode(CryptoUtil.getDefault(inputText))

Mobile.setEncryptedText(findTestObject('Android/Set Encrypted Text/android.widget.EditText0'), encryptedText, 0)

String textGot = Mobile.getText(findTestObject('Android/Set Encrypted Text/android.widget.EditText0'), 0)

Mobile.verifyMatch(textGot, inputText, false)



