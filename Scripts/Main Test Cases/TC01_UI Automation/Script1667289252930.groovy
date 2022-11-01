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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.service.nsw.gov.au/')

WebUI.setText(findTestObject('Object Repository/Page_Home  Service NSW/input_Service NSW makes it easier to find g_bdb6ca'), 
    'apply for a number plate')

WebUI.click(findTestObject('Object Repository/Page_Home  Service NSW/button_apply for a number plate_button butt_2c4e78'))

WebUI.click(findTestObject('Object Repository/Page_Search  Service NSW/button_Menu'))

WebUI.click(findTestObject('Object Repository/Page_Search  Service NSW/a_Find locations'))

WebUI.setText(findTestObject('Object Repository/Page_Find a Service NSW location  Service NSW/input_Search by suburb, postcode or current_d530bf'), 
    'Sydney 2000')

WebUI.click(findTestObject('Object Repository/Page_Find a Service NSW location  Service NSW/button_Sydney South 2000_button button--pri_c5c898'))

WebUI.click(findTestObject('Object Repository/Page_Find a Service NSW location  Service NSW/div_To navigate, press the arrow keys.Today_e34fe5'))

WebUI.click(findTestObject('Object Repository/Page_Find a Service NSW location  Service NSW/a_Marrickville Service Centre'))

WebUI.closeBrowser()

