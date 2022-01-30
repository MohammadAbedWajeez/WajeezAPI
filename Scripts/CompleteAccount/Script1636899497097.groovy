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
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version]))

def AuthenticateUserUsingEmailAndPasswordSlurper = new groovy.json.JsonSlurper()

def AuthenticateUserUsingEmailAndPasswordResult = AuthenticateUserUsingEmailAndPasswordSlurper.parseText(AuthenticateUserUsingEmailAndPassword.getResponseBodyContent())

def Token = AuthenticateUserUsingEmailAndPasswordResult.data.token

GlobalVariable.token = Token

WS.verifyResponseStatusCode(AuthenticateUserUsingEmailAndPassword, 200)
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

randomBodyEmail = (('wajeezTest' + ((Math.random() * 2000) as int)) + '@wajeez.co')

GlobalVariable.randomBodyEmail = randomBodyEmail

randomFirstName = ('TestRegisterUser' + ((Math.random() * 1000) as int))

GlobalVariable.randomFirstName = randomFirstName

RegisterUserPassword = "wajeez1234"
GlobalVariable.RegisterUserPassword = RegisterUserPassword

RegisterTheUserUusingEmailAndPassword = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Identity/Account/Register the user using email and password', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('randomBodyEmail') : GlobalVariable.randomBodyEmail
            , ('RegisterUserPassword') : GlobalVariable.RegisterUserPassword, ('$randomFirstName') : GlobalVariable.randomFirstName]))

def RegisterTheUserUusingEmailAndPasswordSlurper = new groovy.json.JsonSlurper()

def RegisterTheUserUusingEmailAndPasswordResult = RegisterTheUserUusingEmailAndPasswordSlurper.parseText(RegisterTheUserUusingEmailAndPassword.getResponseBodyContent())

println(RegisterTheUserUusingEmailAndPasswordResult)


//def UserRegisteredID = RegisterTheUserUusingEmailAndPasswordResult.data.id
//
//def UserRegisteredToken = RegisterTheUserUusingEmailAndPasswordResult.data.token
//
//println(RegisterTheUserUusingEmailAndPasswordResult)
//
//GlobalVariable.UserRegisteredID = UserRegisteredID
//
//GlobalVariable.UserRegisteredToken = UserRegisteredToken


WS.verifyResponseStatusCode(RegisterTheUserUusingEmailAndPassword, 200)
//////////////////////////////////////////////////////////////////////////////////////////
CheckEmailValidityAndExistenceEmailExist = WS.sendRequest(findTestObject('Version_1/Wajeez_Identity/Account/Check email validity and existence', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('randomBodyEmail') : GlobalVariable.randomBodyEmail, ('token') : GlobalVariable.token]))
def CheckEmailValidityAndExistenceEmailExistSlurper = new groovy.json.JsonSlurper()

def CheckEmailValidityAndExistenceEmailExistResult = CheckEmailValidityAndExistenceEmailExistSlurper.parseText(CheckEmailValidityAndExistenceEmailExist.getResponseBodyContent())

println(CheckEmailValidityAndExistenceEmailExistResult)
WS.verifyResponseStatusCode(CheckEmailValidityAndExistenceEmailExist, 400)

/////////////////////////////////////////////////////////////////////////////////////////
RandomSuperEmail = (('wajeezNewAdmin' + ((Math.random() * 900) as int)) + '@wajeez.co')

GlobalVariable.RandomSuperEmail = RandomSuperEmail

def CreateAdminUsingemailAndPassword = WS.sendRequest(findTestObject('Version_1/Wajeez_Identity/Account/Create admin using email and password', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('RandomSuperEmail') : GlobalVariable.RandomSuperEmail
            , ('randomFirstName') : GlobalVariable.randomFirstName, ('token') : GlobalVariable.token]))

def CreateAdminUsingemailAndPasswordSlurper = new groovy.json.JsonSlurper()

def CreateAdminUsingemailAndPasswordResult = CreateAdminUsingemailAndPasswordSlurper.parseText(CreateAdminUsingemailAndPassword.getResponseBodyContent())

println(CreateAdminUsingemailAndPasswordResult)

WS.verifyResponseStatusCode(CreateAdminUsingemailAndPassword, 401)

