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
import org.assertj.core.api.Assertions
import static org.assertj.core.api.Assertions.*


AuthenticateUsingEmailAndPassword = WS.sendRequest(findTestObject('version_1/Wajeez_Identity/account/authenticate/Authenticate user using Email and Password', 
        [('baseUrl') : GlobalVariable.baseUrl, ('email') : 'SuperAdmin@wajeez.co', ('password') : 'wajeez@123']))

def AuthenticateUsingEmailAndPasswordslurper = new groovy.json.JsonSlurper()

def AuthenticateUsingEmailAndPasswordresult = AuthenticateUsingEmailAndPasswordslurper.parseText(AuthenticateUsingEmailAndPassword.getResponseBodyContent())

def Token = AuthenticateUsingEmailAndPasswordresult.data.token

GlobalVariable.token = Token

println(AuthenticateUsingEmailAndPasswordresult)

WS.verifyResponseStatusCode(AuthenticateUsingEmailAndPassword, 200)

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
randomBodyEmail = (('RandomEmail' + ((Math.random() * 1000) as int)) + '@gmail.com')

GlobalVariable.randomBodyEmail = randomBodyEmail

randomFirstName = ('RandomFirstName' + ((Math.random() * 1000) as int))

GlobalVariable.randomFirstName = randomFirstName

RegisterUserPassword = ('Password' + ((Math.random() * 1000) as int))

GlobalVariable.RegisterUserPassword = RegisterUserPassword

RegisterTheUserUsingEmailAndPassword = WS.sendRequest(findTestObject('Version_1/Wajeez_Identity/Account/Register the user using email and password', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('randomBodyEmail') : GlobalVariable.randomBodyEmail
            , ('RegisterUserPassword') : GlobalVariable.RegisterUserPassword]))

def RegisterTheUserUsingEmailAndPasswordslurper = new groovy.json.JsonSlurper()

def RegisterTheUserUsingEmailAndPasswordresult = RegisterTheUserUsingEmailAndPasswordslurper.parseText(RegisterTheUserUsingEmailAndPassword.getResponseBodyContent())

println(RegisterTheUserUsingEmailAndPasswordresult)

def UserToken = RegisterTheUserUsingEmailAndPasswordresult.data.token

GlobalVariable.UserToken = UserToken

def UserRegisteredID = RegisterTheUserUsingEmailAndPasswordresult.data.id

GlobalVariable.UserRegisteredID = UserRegisteredID

println(UserToken)

WS.verifyResponseStatusCode(RegisterTheUserUsingEmailAndPassword, 200)

////////////////////////////////////////////////////////////////////////////////////////////////////////
GetUserDetailsById = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Identity/Account/{user Id}/Get user details using his id', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('token') : GlobalVariable.token, ('UserRegisteredID') : GlobalVariable.UserRegisteredID]))

def GetUserDetailsByIdSlurper = new groovy.json.JsonSlurper()

def GetUserDetailsByIdResult = GetUserDetailsByIdSlurper.parseText(GetUserDetailsById.getResponseBodyContent())

println(GetUserDetailsByIdResult)

def UserRegName = 'NewUpdatedUserName'

GlobalVariable.UserRegName = UserRegName

//println(UserRegName)

WS.verifyResponseStatusCode(GetUserDetailsById, 200)

//////////////////////////////////////////////////////////////////////////////////////////////////////////

UpdateUserNameUser = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Identity/Account/Update the name of the user NormalUser', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('UserToken') : GlobalVariable.UserToken, ('UserRegName') : GlobalVariable.UserRegName]))

def UpdateUserNameUserSlurper = new groovy.json.JsonSlurper()

def UpdateUserNameUserResult = UpdateUserNameUserSlurper.parseText(UpdateUserNameUser.getResponseBodyContent())

println(UpdateUserNameUserResult)
def UpdatedName = UpdateUserNameUserResult.data.name
println(UpdatedName)
GlobalVariable.UpdatedName = UpdatedName

assert assertThat(UpdatedName).isEqualTo(UserRegName)
WS.verifyResponseStatusCode(UpdateUserNameUser, 200)
