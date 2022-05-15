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



class BuyItem {
	@Given("I am on the HomePage")
	def dashboardPage() {
		println("I am inside HomePage")
		WebUI.callTestCase(findTestCase('Authenfication/RightLogin'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.refresh()
		WebUI.verifyElementPresent(findTestObject('Login/Dashboard'), 0)
	}
	@When("I choose one item")
	def clickOneItem() {
		println("I add one item to cart")
		WebUI.verifyElementPresent(findTestObject('BuyItem/VerifyOneItem'), 5)
	}
	@When("I choose two item")
	def clickTwoItem() {
		println("I add two item to cart")
		WebUI.verifyElementPresent(findTestObject('BuyItem/BuyItemTwo'), 0)
		WebUI.verifyElementPresent(findTestObject('BuyItem/BuyItemThree'), 0)
	}
	@When("I choose more item")
	def clickMoreItem() {
		println("I add more item to cart")
		WebUI.verifyElementPresent(findTestObject('BuyItem/BuyItemTwo'), 0)
		WebUI.verifyElementPresent(findTestObject('BuyItem/BuyItemThree'), 0)
		WebUI.verifyElementPresent(findTestObject('BuyItem/BuyItemFour'), 0)
	}
	@Then("I click button beli for two item")
	def buttonTwoItem() {
		println("I buy two item")
		WebUI.click(findTestObject('BuyItem/BuyItemTwo'))
		WebUI.click(findTestObject('BuyItem/BuyItemThree'))
	}
	@Then("I click button beli for more item")
	def buttonMoreitem() {
		println("I buy more item")
		WebUI.click(findTestObject('BuyItem/BuyItemTwo'))
		WebUI.click(findTestObject('BuyItem/BuyItemThree'))
		WebUI.click(findTestObject('BuyItem/BuyItemFour'))
	}
	@Then("I click button beli")
	def buttonBeli() {
		println("I buy item")
		WebUI.click(findTestObject('BuyItem/ButtonBeli'))
	}
	@Then("I double click button beli")
	def buttonBeli2() {
		println("I buy item")
		WebUI.click(findTestObject('BuyItem/ButtonOneItem'))
		WebUI.click(findTestObject('BuyItem/ButtonOneItem'))
	}
	@Then("I double click button beli for two item")
	def buttonBeli3() {
		println("I buy item")
		WebUI.click(findTestObject('BuyItem/BuyItemTwo'))
		WebUI.click(findTestObject('BuyItem/BuyItemThree'))
	}
	@Then("I double click button beli for more item")
	def buttonBeli4() {
		println("I buy more item")
		WebUI.click(findTestObject('BuyItem/BuyItemTwo'))
		WebUI.click(findTestObject('BuyItem/BuyItemTwo'))
		WebUI.click(findTestObject('BuyItem/BuyItemThree'))
		WebUI.click(findTestObject('BuyItem/BuyItemThree'))
		WebUI.click(findTestObject('BuyItem/BuyItemFour'))
		WebUI.click(findTestObject('BuyItem/BuyItemFour'))
	}
	@And("I click cart menu")
	def cartMenu() {
		println("I buy item in AltaShop")
		WebUI.click(findTestObject('BuyItem/Cart'))
	}
	@And("I click bayar button")
	def bayarButton() {
		println("I click bayar button")
		WebUI.verifyElementPresent(findTestObject('BuyItem/VerifyHargaTwoItem'), 0)
	}
	@Then("I am on the transaction page")
	def transactionPage() {
		println("I am on transaction page")
		WebUI.verifyElementPresent(findTestObject('BuyItem/VerifyHarga'), 0)
	}

	// For Buy Item Without Login
	@Given("I am on the Website")
	def websiteWithoutLogin() {
		println("I am on the website without login")
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://qa.alta.id/')
	}
	@When("I choose item")
	def chooseItem() {
		println("I am choose Item in AltaShop")
		WebUI.verifyElementPresent(findTestObject('BuyItem/VerifyElement'), 0)
	}
	@Then("I am failed to pay the item")
	def payItem() {
		println("I am failed to pay")
		WebUI.verifyElementPresent(findTestObject('BuyItem/VerifyLogin'), 0)
	}
	@When("I click cart menu AltaShop")
	def cartMenuAltaShop() {
		println("I buy item in AltaShop")
		WebUI.click(findTestObject('BuyItem/Cart'))
	}
	@Then("I verification alert notification")
	def verificationAlertNotification() {
		println("I alert the notification")
		WebUI.verifyTextPresent('Order is empty!', true)
	}

}