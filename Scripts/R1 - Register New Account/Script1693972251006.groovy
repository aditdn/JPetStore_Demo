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

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/Btn-Sign_In'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/Btn-Register_Now'))

WebUI.setText(findTestObject('Page_JPetStore Demo/Field-User_ID'), GlobalVariable.UserID)

WebUI.setText(findTestObject('Object Repository/Page_JPetStore Demo/Field-New_password'), GlobalVariable.NewPassword)

WebUI.setText(findTestObject('Object Repository/Page_JPetStore Demo/Field-Repeat_password'), GlobalVariable.RepeatPassword)

WebUI.setText(findTestObject('Object Repository/Page_JPetStore Demo/Field-First_name'), GlobalVariable.FirstName)

WebUI.setText(findTestObject('Object Repository/Page_JPetStore Demo/Field-Last_name'), GlobalVariable.LastName)

WebUI.setText(findTestObject('Object Repository/Page_JPetStore Demo/Field-Email'), GlobalVariable.Email)

WebUI.setText(findTestObject('Object Repository/Page_JPetStore Demo/Field-Phone'), GlobalVariable.Phone)

WebUI.setText(findTestObject('Object Repository/Page_JPetStore Demo/Field-Address_1'), GlobalVariable.Address1)

WebUI.setText(findTestObject('Object Repository/Page_JPetStore Demo/Field-Address_2'), GlobalVariable.Address2)

WebUI.setText(findTestObject('Object Repository/Page_JPetStore Demo/Field-City'), GlobalVariable.City)

WebUI.setText(findTestObject('Object Repository/Page_JPetStore Demo/Field-State'), GlobalVariable.State)

WebUI.setText(findTestObject('Object Repository/Page_JPetStore Demo/Field-Zip'), GlobalVariable.Zip)

WebUI.setText(findTestObject('Object Repository/Page_JPetStore Demo/Field-Country'), GlobalVariable.Country)

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/Checkbox-Enable_MyList'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/Checkbox-Enable_MyBanner'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/Btn-Save_account_information'))

WebUI.verifyElementText(findTestObject('Page_JPetStore Demo/Btn_Sign In_homepage'), 'Sign In')

WebUI.closeBrowser()

