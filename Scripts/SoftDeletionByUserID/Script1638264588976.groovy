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

AuthenticateUsingEmailAndPassword = WS.sendRequest(findTestObject('api/management/account/authenticate/Authenticate user using Email and Password', 
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

RegisterTheUserUsingEmailAndPassword = WS.sendRequest(findTestObject('api/management/account/user Id/Register the user using email and password', 
        [('baseUrl') : GlobalVariable.baseUrl, ('randomBodyEmail') : GlobalVariable.randomBodyEmail, ('randomFirstName') : GlobalVariable.randomFirstName
            , ('RegisterUserPassword') : GlobalVariable.RegisterUserPassword]))

def RegisterTheUserUsingEmailAndPasswordslurper = new groovy.json.JsonSlurper()

def RegisterTheUserUsingEmailAndPasswordresult = RegisterTheUserUsingEmailAndPasswordslurper.parseText(RegisterTheUserUsingEmailAndPassword.getResponseBodyContent())

println(RegisterTheUserUsingEmailAndPasswordresult)

def RegisteredEmail = RegisterTheUserUsingEmailAndPasswordresult.data.email

println(RegisteredEmail)

 
UserRegisteredID = RegisterTheUserUsingEmailAndPasswordresult.data.id
println(UserRegisteredID)

WS.verifyResponseStatusCode(RegisterTheUserUsingEmailAndPassword, 200)

//////////////////////////////////////////////////////////////////////////
CheckEmailValidityAndExistenceEmailExist = WS.sendRequest(findTestObject('api/management/account/token/Check email validity and existence', 
        [('baseUrl') : GlobalVariable.baseUrl, ('RegisteredEmail') : GlobalVariable.EmailValidity]))

def CheckEmailValidityAndExistenceEmailExistslurper = new groovy.json.JsonSlurper()

def CheckEmailValidityAndExistenceEmailExistresult = CheckEmailValidityAndExistenceEmailExistslurper.parseText(CheckEmailValidityAndExistenceEmailExist.getResponseBodyContent())

println(CheckEmailValidityAndExistenceEmailExistresult)



GlobalVariable.UserRegisteredID = UserRegisteredID

WS.verifyResponseStatusCode(CheckEmailValidityAndExistenceEmailExist, 200)

/////////////////////////////////////////////////////////////////////////////
GetUserDetailsUsingUserId = WS.sendRequest(findTestObject('api/management/account/user Id/Get user details using his id', 
        [('baseUrl') : GlobalVariable.baseUrl, ('token') : GlobalVariable.token, ('UserRegisteredID') : GlobalVariable.UserRegisteredID]))

def GetUserDetailsUsingUserIdSlurper = new groovy.json.JsonSlurper()

def GetUserDetailsUsingUserIdResult = GetUserDetailsUsingUserIdSlurper.parseText(GetUserDetailsUsingUserId.getResponseBodyContent())

println(GetUserDetailsUsingUserIdResult)

println(UserRegisteredID)

WS.verifyResponseStatusCode(GetUserDetailsUsingUserId, 200)


////////////////////////////////////////////////////////////

SoftDeletionOfTheRequestedUser = WS.sendRequestAndVerify(findTestObject('api/management/account/user Id/Soft deletion of the requested user', 
        [('baseUrl') : GlobalVariable.baseUrl, ('UserRegisteredID') : GlobalVariable.UserRegisteredID, ('token') : GlobalVariable.token ]))


def SoftDeletionOfTheRequestedUserSlurper = new groovy.json.JsonSlurper()

def SoftDeletionOfTheRequestedUserResult = SoftDeletionOfTheRequestedUserSlurper.parseText(SoftDeletionOfTheRequestedUser.getResponseBodyContent())

println(SoftDeletionOfTheRequestedUserResult)


WS.verifyResponseStatusCode(SoftDeletionOfTheRequestedUser, 200)

 ///////////////////////////////////////////////////////////////////////////////

println(UserRegisteredID)  

GetUserDetailsUsingUserIdII = WS.sendRequest(findTestObject('api/management/account/user Id/Get user details using his id',
	[('baseUrl') : GlobalVariable.baseUrl, ('token') : GlobalVariable.token, ('UserRegisteredID') : GlobalVariable.UserRegisteredID]))

def GetUserDetailsUsingUserIdIISlurper = new groovy.json.JsonSlurper()

def GetUserDetailsUsingUserIdIIResult = GetUserDetailsUsingUserIdIISlurper.parseText(GetUserDetailsUsingUserIdII.getResponseBodyContent())

println(GetUserDetailsUsingUserIdIIResult)

Userdataafterdelete = GetUserDetailsUsingUserIdIIResult.data

if(Userdataafterdelete == null) {
	println (" The User was deleted successfuly")
}

WS.verifyResponseStatusCode(GetUserDetailsUsingUserIdII, 200)

///////////////////////////////////////////////////////////////////////

CheckEmailValidityAndExistenceEmailExistII = WS.sendRequest(findTestObject('api/management/account/token/Check email validity and existence',
	[('baseUrl') : GlobalVariable.baseUrl, ('RegisteredEmail') : GlobalVariable.EmailValidity, ('token') : GlobalVariable.token]))

def CheckEmailValidityAndExistenceEmailExistIIslurper = new groovy.json.JsonSlurper()

def CheckEmailValidityAndExistenceEmailExistIIresult = CheckEmailValidityAndExistenceEmailExistIIslurper.parseText(CheckEmailValidityAndExistenceEmailExistII.getResponseBodyContent())

println(CheckEmailValidityAndExistenceEmailExistIIresult)

//Done By Abd

