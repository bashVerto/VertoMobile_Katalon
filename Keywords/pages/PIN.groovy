package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class PIN {

	TestObject no0 = findTestObject('Object Repository/PIN/0')
	TestObject no1 = findTestObject('Object Repository/PIN/1')
	TestObject no2 = findTestObject('Object Repository/PIN/2')
	TestObject no3 = findTestObject('Object Repository/PIN/3')
	TestObject no4 = findTestObject('Object Repository/PIN/4')
	TestObject no5 = findTestObject('Object Repository/PIN/5')
	TestObject no6 = findTestObject('Object Repository/PIN/6')
	TestObject no7 = findTestObject('Object Repository/PIN/7')
	TestObject no8 = findTestObject('Object Repository/PIN/8')
	TestObject no9 = findTestObject('Object Repository/PIN/9')
	TestObject back = findTestObject('Object Repository/PIN/Back')
	TestObject pinComplete = findTestObject('Object Repository/PIN/PINComplete')


	public void to0() {
		Mobile.waitForElementPresent(no0, 45)
		Mobile.tap(no0, 0)
	}

	public void to1() {
		Mobile.waitForElementPresent(no1, 45)
		Mobile.tap(no1, 0)
	}

	public void to2() {
		Mobile.waitForElementPresent(no2, 45)
		Mobile.tap(no2, 0)
	}

	public void to3() {
		Mobile.waitForElementPresent(no3, 45)
		Mobile.tap(no3, 0)
	}

	public void to4() {
		Mobile.waitForElementPresent(no4, 45)
		Mobile.tap(no4, 0)
	}

	public void to5() {
		Mobile.waitForElementPresent(no5, 45)
		Mobile.tap(no5, 0)
	}

	public void to6() {
		Mobile.waitForElementPresent(no6, 45)
		Mobile.tap(no6, 0)
	}

	public void to7() {
		Mobile.waitForElementPresent(no7, 45)
		Mobile.tap(no7, 0)
	}

	public void to8() {
		Mobile.waitForElementPresent(no8, 45)
		Mobile.tap(no8, 0)
	}

	public void to9() {
		Mobile.waitForElementPresent(no9, 45)
		Mobile.tap(no9, 0)
	}

	public void toBack() {
		Mobile.waitForElementPresent(back, 45)
		Mobile.tap(back, 0)
	}

	public void toPINComplete() {
		Mobile.waitForElementPresent(pinComplete, 45)
		Mobile.tap(pinComplete, 0)
	}
}
