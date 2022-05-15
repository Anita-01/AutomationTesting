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



class Login {
	@Given("User open link webAltaShop")
	def openAltaShop() {
		println("I am inside AltaShop")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://qa.alta.id/')
		WebUI.maximizeWindow()
	}

	@When("User Fill LoginForm")
	def fillLoginForm() {
		println("I am fill LoginForm")
		WebUI.click(findTestObject('Register/Navigate'))
		WebUI.verifyElementPresent(findTestObject('Login/VerifyLogin'), 2)
	}

	@Then("User enter email and password")
	def userEnterEmailandPassword() {
		println("I enter email and password")
		WebUI.setText(findTestObject('Login/email'), 'anitasiagian11@gmail.com')
		WebUI.setText(findTestObject('Login/password'), 'AnitaLasmariaSiagian')
	}
	@And("Click on login button")
	def clickLoginButton() {
		println("I click Login Button")
		WebUI.click(findTestObject('Login/Login'))
	}
	@Then("User is navigated to dashboard page")
	def userNavigatedDashboard() {
		println("I am successfull login")
		WebUI.verifyElementPresent(findTestObject('Login/Dashboard'), 5)
	}
	@Then("User enter (.*) and (.*) in Login Page")
	def enterNamaLengkapEmailPassword(String Email,String Password) {
		println("I fill the login page")
		print ("Email : " + Email)
		print ("Password: " + Password)

		WebUI.setText(findTestObject('Login/email'),Email)
		WebUI.setText(findTestObject('Login/password'),Password)
	}
}