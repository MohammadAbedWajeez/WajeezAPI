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

AuthenticateUserUsingEmailAndPassword = WS.sendRequest(findTestObject('Version_1/Wajeez_Identity/Account/authenticate/Authenticate user using Email and Password', 
        [('baseUrl') : GlobalVariable.baseUrl]))

def AuthenticateUserUsingEmailAndPasswordSlurper = new groovy.json.JsonSlurper()

def AuthenticateUserUsingEmailAndPasswordResult = AuthenticateUserUsingEmailAndPasswordSlurper.parseText(AuthenticateUserUsingEmailAndPassword.getResponseBodyContent())

def Token = AuthenticateUserUsingEmailAndPasswordResult.data.token

GlobalVariable.token = Token

WS.verifyResponseStatusCode(AuthenticateUserUsingEmailAndPassword, 200)

///////////////////////////////////////////////////////////////////
GetAllLanguages = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Payments/v1/languages/Get all languages', [('baseUrl') : GlobalVariable.baseUrl
            , ('version') : GlobalVariable.version, ('token') : GlobalVariable.token]))

WS.verifyResponseStatusCode(GetAllLanguages, 200)

///////////////////////////////////////////////////////////////////
LanguageName = ('Language' + ((Math.random() * 100) as int))

GlobalVariable.LanguageName = LanguageName

LanguageCode = ('LA' + ((Math.random() * 100) as int))

GlobalVariable.LanguageCode = LanguageCode

CreateNewLanguage = WS.sendRequest(findTestObject('Version_1/Wajeez_Payments/v1/languages/Create new language', [('baseUrl') : GlobalVariable.baseUrl
            , ('LanguageName') : GlobalVariable.LanguageName, ('LanguageCode') : GlobalVariable.LanguageCode, ('version') : GlobalVariable.version, ('token') : GlobalVariable.token]))

def CreateNewLanguageSlurper = new groovy.json.JsonSlurper()

def CreateNewLanguageResult = CreateNewLanguageSlurper.parseText(CreateNewLanguage.getResponseBodyContent())

println(CreateNewLanguageResult)

def EditLanguageName = CreateNewLanguageResult.data.name

GlobalVariable.EditLanguageName = EditLanguageName

println(CreateNewLanguageResult)

WS.verifyResponseStatusCode(CreateNewLanguage, 200)

///////////////////////////////////////////////////////////////////
EditLanguage = WS.sendRequest(findTestObject('Version_1/Wajeez_Payments/v1/languages/Edit language', [('baseUrl') : GlobalVariable.baseUrl
            , ('LanguageCode') : GlobalVariable.LanguageCode, ('LanguageName') : GlobalVariable.LanguageName, ('version') : GlobalVariable.version, ('token') : GlobalVariable.token]))

def EditLanguageSlurper = new groovy.json.JsonSlurper()

def EditLanguageResult = EditLanguageSlurper.parseText(EditLanguage.getResponseBodyContent())

println(EditLanguageResult)

