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

///////////////////////////////////////////////////////////
countryName = ('Australia' + ((Math.random() * 1000) as int))

GlobalVariable.CountryName = countryName

countryRegion = ('AU' + ((Math.random() * 100) as int))

GlobalVariable.CountryRegion = countryRegion

randomCountryCode2 = ('CC' + ((Math.random() * 10) as int))

GlobalVariable.randomCountryCode2 = randomCountryCode2

randomCountryCode3 = ('CC' + ((Math.random() * 100) as int))

GlobalVariable.randomCountryCode3 = randomCountryCode3

randomCurrencyCode = ('CC' + ((Math.random() * 100) as int))

GlobalVariable.randomCurrencyCode = randomCurrencyCode

///////////////////////////////////////////////////////////
CreateNewCountry = WS.sendRequestAndVerify(findTestObject('api/management/countries/Create new country', [('baseUrl') : GlobalVariable.baseUrl
            , ('CountryName') : GlobalVariable.CountryName, ('CountryRegion') : GlobalVariable.CountryRegion, ('randomCurrencyCode') : GlobalVariable.randomCurrencyCode
            , ('randomCountryCode2') : GlobalVariable.randomCountryCode2, ('randomCountryCode3') : GlobalVariable.randomCountryCode3
            , ('token') : GlobalVariable.token]))

def CreateNewCountrySlurper = new groovy.json.JsonSlurper()

def CreateNewCountryResult = CreateNewCountrySlurper.parseText(CreateNewCountry.getResponseBodyContent())

println(CreateNewCountryResult)

WS.verifyResponseStatusCode(CreateNewCountry, 200)

///////////////////////////////////////////////////////////
GetAllCountries = WS.sendRequest(findTestObject('api/management/countries/Get all countries', [('baseUrl') : GlobalVariable.baseUrl
            , ('token') : GlobalVariable.token]))

def GetAllCountriesSlurper = new groovy.json.JsonSlurper()

def GetAllCountriesResult = GetAllCountriesSlurper.parseText(GetAllCountries.getResponseBodyContent())

countryID = (GetAllCountriesResult.data.id[200])

GlobalVariable.CountryID = countryID

println(GetAllCountriesResult)

println(countryID)

WS.verifyResponseStatusCode(GetAllCountries, 200)

///////////////////////////////////////////////////////////
EditExistingCountry = WS.sendRequest(findTestObject('api/management/countries/Edit existing country', [('baseUrl') : GlobalVariable.baseUrl
            , ('token') : GlobalVariable.token, ('CountryID') : GlobalVariable.CountryID, ('CountryName') : GlobalVariable.CountryName
            , ('CountryRegion') : GlobalVariable.CountryRegion]))

def EditExistingCountrySlurper = new groovy.json.JsonSlurper()

def EditExistingCountryResult = EditExistingCountrySlurper.parseText(EditExistingCountry.getResponseBodyContent())

println(EditExistingCountryResult)

WS.verifyResponseStatusCode(EditExistingCountry, 200)

////////////////////////////////////////////////////////////

InvalidCreateNewCountry = WS.sendRequestAndVerify(findTestObject('api/management/countries/Invalid Create new country', 
        [('baseUrl') : GlobalVariable.baseUrl, ('null') : GlobalVariable.Null  , ('token') : GlobalVariable.token]))

def InvalidCreateNewCountrySlurper = new groovy.json.JsonSlurper()

def InvalidCreateNewCountryResult = InvalidCreateNewCountrySlurper.parseText(InvalidCreateNewCountry.getResponseBodyContent())

println(InvalidCreateNewCountryResult)

WS.verifyResponseStatusCode(InvalidCreateNewCountry, 400)

