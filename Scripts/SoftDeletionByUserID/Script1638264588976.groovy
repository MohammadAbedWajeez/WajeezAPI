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
import org.assertj.core.api.Assertions as Assertions

AuthenticateUsingEmailAndPassword = WS.sendRequest(findTestObject('version_1/Wajeez_Identity/account/authenticate/Authenticate user using Email and Password', 
        [('baseUrl') : GlobalVariable.baseUrl, ('email') : 'SuperAdmin@wajeez.co', ('password') : 'wajeez@123']))

def AuthenticateUsingEmailAndPasswordslurper = new groovy.json.JsonSlurper()

def AuthenticateUsingEmailAndPasswordresult = AuthenticateUsingEmailAndPasswordslurper.parseText(AuthenticateUsingEmailAndPassword.getResponseBodyContent())

def Token = AuthenticateUsingEmailAndPasswordresult.data.token

GlobalVariable.token = Token

///////////////////////////////////////////////////////////////////////////
randomBodyEmail = (('RandomEmail' + ((Math.random() * 1000) as int)) + '@gmail.com')

GlobalVariable.randomBodyEmail = randomBodyEmail

randomFirstName = ('RandomFirstName' + ((Math.random() * 1000) as int))

GlobalVariable.randomFirstName = randomFirstName

RegisterUserPassword = ('Password' + ((Math.random() * 1000) as int))

GlobalVariable.RegisterUserPassword = RegisterUserPassword

RegisterTheUserUsingEmailAndPassword = WS.sendRequest(findTestObject('Version_1/Wajeez_Identity/Account/Register the user using email and password', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('randomBodyEmail') : GlobalVariable.randomBodyEmail
            , ('$randomHexColor') : GlobalVariable.randomHexColor, ('$randomFirstName') : GlobalVariable.randomFirstName]))

def RegisterTheUserUsingEmailAndPasswordslurper = new groovy.json.JsonSlurper()

def RegisterTheUserUsingEmailAndPasswordresult = RegisterTheUserUsingEmailAndPasswordslurper.parseText(RegisterTheUserUsingEmailAndPassword.getResponseBodyContent())

println(RegisterTheUserUsingEmailAndPasswordresult)

def RegisteredEmail = RegisterTheUserUsingEmailAndPasswordresult.data.email

println(RegisteredEmail)

UserRegisteredID = RegisterTheUserUsingEmailAndPasswordresult.data.id

println(UserRegisteredID)

WS.verifyResponseStatusCode(RegisterTheUserUsingEmailAndPassword, 200)

//////////////////////////////////////////////////////////////////////////
CheckEmailValidityAndExistenceEmailExist = WS.sendRequest(findTestObject('Version_1/Wajeez_Identity/Account/Check email validity and existence', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version]))

def CheckEmailValidityAndExistenceEmailExistslurper = new groovy.json.JsonSlurper()

def CheckEmailValidityAndExistenceEmailExistresult = CheckEmailValidityAndExistenceEmailExistslurper.parseText(CheckEmailValidityAndExistenceEmailExist.getResponseBodyContent())

println(CheckEmailValidityAndExistenceEmailExistresult)

GlobalVariable.UserRegisteredID = UserRegisteredID

WS.verifyResponseStatusCode(CheckEmailValidityAndExistenceEmailExist, 200)

/////////////////////////////////////////////////////////////////////////////
GetUserDetailsUsingUserId = WS.sendRequest(findTestObject('Version_1/Wajeez_Identity/Account/{user Id}/Get user details using his id', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version]))

def GetUserDetailsUsingUserIdSlurper = new groovy.json.JsonSlurper()

def GetUserDetailsUsingUserIdResult = GetUserDetailsUsingUserIdSlurper.parseText(GetUserDetailsUsingUserId.getResponseBodyContent())

println(GetUserDetailsUsingUserIdResult)

println(UserRegisteredID)

WS.verifyResponseStatusCode(GetUserDetailsUsingUserId, 200)

////////////////////////////////////////////////////////////
SoftDeletionOfTheRequestedUser = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Identity/Account/Soft deletion of the current user', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version]))

def SoftDeletionOfTheRequestedUserSlurper = new groovy.json.JsonSlurper()

def SoftDeletionOfTheRequestedUserResult = SoftDeletionOfTheRequestedUserSlurper.parseText(SoftDeletionOfTheRequestedUser.getResponseBodyContent())

println(SoftDeletionOfTheRequestedUserResult)

WS.verifyResponseStatusCode(SoftDeletionOfTheRequestedUser, 200)

///////////////////////////////////////////////////////////////////////////////
println(UserRegisteredID)

GetUserDetailsUsingUserIdII = WS.sendRequest(findTestObject('Version_1/Wajeez_Identity/Account/{user Id}/Get user details using his id', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version]))

def GetUserDetailsUsingUserIdIISlurper = new groovy.json.JsonSlurper()

def GetUserDetailsUsingUserIdIIResult = GetUserDetailsUsingUserIdIISlurper.parseText(GetUserDetailsUsingUserIdII.getResponseBodyContent())

println(GetUserDetailsUsingUserIdIIResult)

Userdataafterdelete = GetUserDetailsUsingUserIdIIResult.data

if (Userdataafterdelete == null) {
    println(' The User was deleted successfuly')
}

WS.verifyResponseStatusCode(GetUserDetailsUsingUserIdII, 200)

///////////////////////////////////////////////////////////////////////
CheckEmailValidityAndExistenceEmailExistII = WS.sendRequest(findTestObject('Version_1/Wajeez_Identity/Account/Check email validity and existence', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version]))

def CheckEmailValidityAndExistenceEmailExistIIslurper = new groovy.json.JsonSlurper()

def CheckEmailValidityAndExistenceEmailExistIIresult = CheckEmailValidityAndExistenceEmailExistIIslurper.parseText(CheckEmailValidityAndExistenceEmailExistII.getResponseBodyContent())

println(CheckEmailValidityAndExistenceEmailExistIIresult)

