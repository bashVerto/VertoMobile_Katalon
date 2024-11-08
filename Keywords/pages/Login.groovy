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
import data.InBuiltFunction

import internal.GlobalVariable

public class Login {
	InBuiltFunction newFunction = new InBuiltFunction()

	TestObject email = findTestObject('Object Repository/Login/Email')
	TestObject password = findTestObject('Object Repository/Login/Password')
	TestObject authenticator = findTestObject('Object Repository/Login/AuthInput')
	TestObject back = findTestObject('Object Repository/Login/BackButton')
	TestObject confirmOTP = findTestObject('Object Repository/Login/ConfirmOTP')
	TestObject forgotPassword = findTestObject('Object Repository/Login/ForgotPasswordButton')
	TestObject signUp = findTestObject('Object Repository/Login/SignUpButton')
	TestObject skip = findTestObject('Object Repository/Login/SkipButton')
	TestObject tryAnotherMethod = findTestObject('Object Repository/Login/TryAnotherMethod')
	TestObject login = findTestObject('Object Repository/Login/Login')
	TestObject toLogin = findTestObject('Object Repository/Login/ToLogin')


	public void toEmail(String myEmail) {
		Mobile.waitForElementPresent(email, 45)
		Mobile.tap(email, 0)
		Mobile.sendKeys(email, myEmail)
	}

	public void toPassword(String myPassword) {
		Mobile.waitForElementPresent(password, 45)
		Mobile.tap(password, 0)
		Mobile.sendKeys(password, myPassword)
	}


	public void toLogin() {
		Mobile.waitForElementPresent(login, 45)
		Mobile.tap(login, 0)
	}

	public void toLoginScreen() {
		Mobile.waitForElementPresent(toLogin, 45)
		Mobile.tap(toLogin, 0)
	}

	public void toAuthenticator() {
		Mobile.waitForElementPresent(authenticator, 45)
		Mobile.tap(authenticator, 0)
		String scriptPath = "javascript/token.js"
		String otp = newFunction.runNodeScript(scriptPath)
		Mobile.sendKeys(authenticator, otp)
	}

	public void toBack() {
		Mobile.waitForElementPresent(back, 45)
		Mobile.tap(back, 0)
	}

	public void toConfirmOTP() {
		Mobile.waitForElementPresent(confirmOTP, 45)
		Mobile.tap(confirmOTP, 0)
	}

	public void toForgotPassword() {
		Mobile.waitForElementPresent(forgotPassword, 45)
		Mobile.tap(forgotPassword, 0)
	}

	public void toSignUp() {
		Mobile.waitForElementPresent(signUp, 45)
		Mobile.tap(signUp, 0)
	}

	public void toSkip() {
		Mobile.waitForElementPresent(skip, 45)
		Mobile.tap(skip, 0)
	}

	public void toTryAnotherMethod() {
		Mobile.waitForElementPresent(tryAnotherMethod, 45)
		Mobile.tap(tryAnotherMethod, 0)
	}
}
