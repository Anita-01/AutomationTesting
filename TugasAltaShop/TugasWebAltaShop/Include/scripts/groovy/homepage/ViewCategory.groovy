package homepage
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



class ViewCategory {
	@Given("I am Login to AltaShop Website")
	def SuccessfullLogin() {
		println("As a user i am can login to AltaShop")
		WebUI.callTestCase(findTestCase('Authenfication/RightLogin'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@When("I am in DashboardPage")
	def DashboardPage() {
		println("I am on the dashboard page")
		WebUI.verifyElementPresent(findTestObject('Login/Dashboard'), 0)
	}
	@Then("I click the SearchMenu")
	def SearchMenu() {
		println("I click search menu in the dashboard page")
		WebUI.click(findTestObject('ViewCategory/DragDown'))
	}
	@And("I Search Kesehatan")
	def EnterKeywordsForSearchMenu1() {
		println("I enter the keywords in the search meny ")
		WebUI.click(findTestObject('ViewCategory/Kesehatan'))
	}
	@Then("I see the list item of Kesehatan")
	def ListOfItemKesehatan() {
		println("I see the list item of Kesehatan")
		WebUI.verifyElementPresent(findTestObject('ViewCategory/VerifyViewCategory'), 3)
	}
	@And("I Search Tensi Darah Elektrik")
	def EnterKeywordsForSearchMenu2() {
		println("I enter the keywords in the search meny ")
		WebUI.click(findTestObject('ViewCategory/DragDown'))
		WebUI.click(findTestObject('ViewCategory/Tensi Darah Elektrik'), FailureHandling.STOP_ON_FAILURE)
	}
	@And("I see the list item of Tensi Darah Elektrik")
	def ListOfItemTensiDarahElektrik() {
		println("I see the list item of Tensi Darah Elektrik")
		WebUI.verifyElementPresent(findTestObject('ViewCategory/VerifyViewCategory'), 3)
	}
	@Then("I close the browser")
	def CloseBrowser() {
		println("I close browser")
		WebUI.closeBrowser()
	}
}