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
import groovy.json.JsonSlurper as JsonSlurper
import org.assertj.core.api.Assertions as Assertions

AuthenticateUserUsingEmailAndPassword = WS.sendRequest(findTestObject('api/management/account/authenticate/Authenticate user using Email and Password', 
        [('baseUrl') : GlobalVariable.baseUrl]))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(AuthenticateUserUsingEmailAndPassword.getResponseBodyContent())

def Token = result.data.token

GlobalVariable.token = Token

WS.verifyResponseStatusCode(AuthenticateUserUsingEmailAndPassword, 200)

countryName = ('Australia' + ((Math.random() * 1000) as int))

GlobalVariable.CountryName = countryName

countryRegion = ('AU' + ((Math.random() * 100) as int))

GlobalVariable.CountryRegion = countryRegion

countryID = ('AU' + ((Math.random() * 100) as int))

GlobalVariable.CountryID = countryID

CreateNewCountry = WS.sendRequest(findTestObject('Postmannew/api/management/countries/Create new country', [('baseUrl') : GlobalVariable.baseUrl
            , ('token') : GlobalVariable.token, ('countryName') : GlobalVariable.CountryName, ('countryID') : GlobalVariable.CountryID
            , ('countryRegion') : GlobalVariable.CountryRegion]))

WS.verifyResponseStatusCode(CreateNewCountry, 200)

GetAllCountries = WS.sendRequest(findTestObject('Postmannew/api/management/countries/Get all countries', [('baseUrl') : GlobalVariable.baseUrl
            , ('token') : GlobalVariable.token]))

WS.verifyResponseStatusCode(GetAllCountries, 200)


EditExistingCountry = WS.sendRequest(findTestObject('Postmannew/api/management/countries/Edit existing country', [('baseUrl') : GlobalVariable.baseUrl, ('token') : GlobalVariable.token]))
WS.verifyResponseStatusCode(EditExistingCountry, 200)
