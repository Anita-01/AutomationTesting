package transaction
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



class TransactionItem {

	@Given("I add item in AltaShop")
	def itemAltaShop() {
		WebUI.callTestCase(findTestCase('ShoppingCart/AddBarang'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@When("I am on the Transaction Page")
	def verifyTransactionPage() {
		WebUI.verifyElementPresent(findTestObject('ShoppingCart/VerifyTransactionPage'), 5)
	}
	@Then("I filter the item by produk")
	def filterbyProduk() {
		for (def index : (1..3)) {
			WebUI.doubleClick(findTestObject('Transaction/Produk'))
		}
	}
	@Then("I filter the item by Harga")
	def filterByHarga() {
		for (def index : (1..3)) {
			WebUI.doubleClick(findTestObject('Transaction/Harga'))
		}
	}

	@Then("I filter the item by Banyaknya")
	def filterByBanyaknya() {
		for (def index : (1..3)) {
			WebUI.doubleClick(findTestObject('Transaction/Banyaknya'))
		}
	}
	@Then("I filter the item by Subtotal")
	def filterBySubTotal() {
		for (def index : (1..3)) {
			WebUI.doubleClick(findTestObject('Transaction/SubTotal'))
		}
	}

	// Descending

	@Then("I filter the item by produk_1")
	def filterproduk() {
		WebUI.doubleClick(findTestObject('Transaction/Produk'))
	}
	@Then("I filter the item by Harga_1")
	def filterharga() {
		WebUI.doubleClick(findTestObject('Transaction/Harga'))
	}
	@Then("I filter the item by Banyaknya_1")
	def filterbanyaknya() {
		WebUI.doubleClick(findTestObject('Transaction/Banyaknya'))

	}
	@Then("I filter the item by Subtotal_1")
	def filterSubTotal() {
		WebUI.doubleClick(findTestObject('Transaction/SubTotal'))
	}
	@And("I select rows option page")
	def selectRowsOptionPage() {
		WebUI.click(findTestObject('Transaction/RowPerPage'))
		WebUI.click(findTestObject('Transaction/Five'))
		WebUI.click(findTestObject('Transaction/RowPerPage'))
		WebUI.click(findTestObject('Transaction/Ten'))
		WebUI.click(findTestObject('Transaction/RowPerPage'))
		WebUI.click(findTestObject('Transaction/FiveTeen'))
		WebUI.click(findTestObject('Transaction/RowPerPage'))
		WebUI.click(findTestObject('Transaction/All'))
	}
	@Then("I'm Logout From The Website")
	def logoutFromWebsite() {
		WebUI.click(findTestObject('Logout/Profile'))
		WebUI.click(findTestObject('Logout/Logout'))
	}




}