package shoppingcart
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



class AddItem {
	@Given("I am on order page")
	def orderPage() {
		println("I am inside on order page")
		WebUI.callTestCase(findTestCase('ShoppingCart/BuyBarang'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@When("I click icon plus")
	def iconPlus() {
		println("I click icon plus to add item ")
		WebUI.click(findTestObject('ShoppingCart/AddItem'))
	}
	// click icon plus as twice
	@When("I click icon plus as twice")
	def iconPlus1() {
		println("I click icon plus to add item ")
		WebUI.click(findTestObject('ShoppingCart/AddItem'))
		WebUI.click(findTestObject('ShoppingCart/AddItem'))
	}
	@Then("I verify the price of item")
	def verifyPriceItem() {
		println("I verify the price after i add item")
		WebUI.verifyElementPresent(findTestObject('ShoppingCart/VerifyPrice'), 0)
	}
	@And("I click button bayar")
	def clickButtonBayar() {
		println("I click button bayar")
		WebUI.click(findTestObject('BuyItem/Pay'))
	}
	@Then("I am inside transaction page")
	def verifyTransactionPage() {
		println("I click button bayar")
		WebUI.verifyElementPresent(findTestObject('ShoppingCart/VerifyTransactionPage'), 0)
	}
	@When("I click icon plus as many one hundred")
	def clickIconPlusOneHundred() {
		println("I click icon plus as many one hundred")

		for (def index : (0..100)) {
			WebUI.click(findTestObject('ShoppingCart/AddItem'))

		}

	}
	@Given("I am on order page AltaShop")
	def clickOrderPageAltaShop() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://qa.alta.id/')
		WebUI.maximizeWindow()
		WebUI.refresh()
		WebUI.click(findTestObject('ShoppingCart/BackBeranda'))
		WebUI.verifyElementPresent(findTestObject('Login/VerifyLogin'), 2)
		WebUI.refresh()
		WebUI.setText(findTestObject('Login/email'), 'anitasiagian11@gmail.com')
		WebUI.setText(findTestObject('Login/password'), 'AnitaLasmariaSiagian')
		WebUI.click(findTestObject('Login/Login'))
	}




}