package authentication
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Register {
	@Given("User open link WebAltaShop")
	def openAltaShop() {
		println("I am inside to AltaShop ")
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://qa.alta.id/')
	}
	@When("User navigate to register page")
	def navigateToRegisterPage() {
		println("I am inside to Register Page")
		WebUI.click(findTestObject('Register/Navigate'))
		WebUI.click(findTestObject('Register/LinkRegister'))
	}
	@And("User enters (.*),(.*) and (.*)")
	def enterNamaLengkapEmailPassword(String Name, String Email, String Password) {
		println("I fill the register page")
		print ("NamaLengkap: " +Name)
		print ("Email : " +Email)
		print ("Password: " +Password)

		WebUI.setText(findTestObject('Register/Name'), Name)
		WebUI.setText(findTestObject('Register/Email'),Email)
		WebUI.setText(findTestObject('Register/Password'), Password)
	}
	@And("User enters (.*),(.*) and (.*) in AltaShop")
	def enterEmailAgain(String Name, String Email, String Password) {
		println("I fill the register page")
		print ("NamaLengkap: " +Name)
		print ("Email : " +Email)
		print ("Password: " +Password)

		WebUI.setText(findTestObject('Register/Name'), Name)
		WebUI.setText(findTestObject('Register/Email'),Email)
		WebUI.setText(findTestObject('Register/Password'), Password)
	}

	@And("User fill Registration Form")
	def registrationform() {
		WebUI.setText(findTestObject('Register/Name'), 'anita')
		WebUI.setText(findTestObject('Register/Email'), 'anitasiagiaM2241@gmail.com')
		WebUI.setText(findTestObject('Register/Password'), 'anitasiagian')
	}
	@Then("User failed to create new account")
	def failedCreateAccount() {
		WebUI.verifyElementPresent(findTestObject('Register/UnsuccessfullRegister'), 0)
	}
	@And("User click Register Button")
	def clickButton() {
		println("I click button")
		WebUI.click(findTestObject('Register/ClickButton'))
	}
	@Then("User succesfull create new account")
	def verifyRegister(){
		println("I am successfull Register")
		WebUI.verifyElementPresent(findTestObject('Register/Login'), 5)
	}

	@Then("I have notification danger")
	def verifyDanger() {
		println("I have danger in AltaShop")
		WebUI.verifyElementPresent(findTestObject('Register/UnsuccessfullRegister'), 5)
		WebUI.closeBrowser()
	}
}