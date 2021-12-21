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
import static org.assertj.core.api.Assertions.*


//Send Auth reuest to save token
AuthenticateUsingEmailAndPassword = WS.sendRequest(findTestObject('api/management/account/authenticate/Authenticate user using Email and Password', 
        [('baseUrl') : GlobalVariable.baseUrl, ('email') : 'SuperAdmin@wajeez.co', ('password') : 'wajeez@123']))

def AuthenticateUsingEmailAndPasswordslurper = new groovy.json.JsonSlurper()

def AuthenticateUsingEmailAndPasswordresult = AuthenticateUsingEmailAndPasswordslurper.parseText(AuthenticateUsingEmailAndPassword.getResponseBodyContent())

def Token = AuthenticateUsingEmailAndPasswordresult.data.token

GlobalVariable.token = Token

///////////////////////////////////////////////////////////////////////
//Register new user using email and password

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

assertThat(RegisteredEmail).isEqualTo(randomBodyEmail)

WS.verifyResponseStatusCode(RegisterTheUserUsingEmailAndPassword, 200)

///////////////////////////////////////////////////////////////////////////////////
// Block registered user

def UserRegisteredID = RegisterTheUserUsingEmailAndPasswordresult.data.id
GlobalVariable.UserRegisteredID = UserRegisteredID
println(Token)
BlockForTheRequestedUser = WS.sendRequest(findTestObject('api/management/account/Block for the requested user', 
        [('baseUrl') : GlobalVariable.baseUrl, ('UserRegisteredID') : GlobalVariable.UserRegisteredID, ('token') : GlobalVariable.token]))

def BlockForTheRequestedUserslurper = new groovy.json.JsonSlurper()
def BlockForTheRequestedUserresult = BlockForTheRequestedUserslurper.parseText(BlockForTheRequestedUser.getResponseBodyContent())
println(BlockForTheRequestedUserresult)

WS.verifyResponseStatusCode(BlockForTheRequestedUser, 200)

//block again

BlockForTheRequestedUseragain = WS.sendRequest(findTestObject('api/management/account/Block for the requested user',
		[('baseUrl') : GlobalVariable.baseUrl, ('UserRegisteredID') : GlobalVariable.UserRegisteredID, ('token') : GlobalVariable.token]))

def BlockForTheRequestedUseragainslurper = new groovy.json.JsonSlurper()
def BlockForTheRequestedUseragainresult = BlockForTheRequestedUseragainslurper.parseText(BlockForTheRequestedUseragain.getResponseBodyContent())
println(BlockForTheRequestedUseragainresult)
def BlockAgainErrorMessage = BlockForTheRequestedUseragainresult.errors[0].message
println(BlockAgainErrorMessage)
WS.verifyResponseStatusCode(BlockForTheRequestedUseragain, 400)

///////////////////////////////////////////////////////////////////////////////////
// Get registered user and verify blocker

GetUserDetailsUsingUserId = WS.sendRequest(findTestObject('api/management/account/user Id/Get user details using his id', 
        [('baseUrl') : GlobalVariable.baseUrl, ('token') : GlobalVariable.token, ('UserRegisteredID') : GlobalVariable.UserRegisteredID]))
def GetUserDetailsUsingUserIdSlurper = new groovy.json.JsonSlurper()

def GetUserDetailsUsingUserIdResult = GetUserDetailsUsingUserIdSlurper.parseText(GetUserDetailsUsingUserId.getResponseBodyContent())

println(GetUserDetailsUsingUserIdResult)

BlockedUserId = GetUserDetailsUsingUserIdResult.data.id

GlobalVariable.BlockedUserId = BlockedUserId

WS.verifyResponseStatusCode(GetUserDetailsUsingUserId, 200)

////////////////////////////////////////////////////////////////////////////////////
//Unblock the blocked user

UnBlockForTheRequestedUser = WS.sendRequest(findTestObject('api/management/account/UnBlockForTheRequestedUser', 
        [('baseUrl') : GlobalVariable.baseUrl, ('BlockedUserId') : GlobalVariable.BlockedUserId, ('token') : GlobalVariable.token]))

def UnBlockForTheRequestedUserSlurper = new groovy.json.JsonSlurper()

def UnBlockForTheRequestedUserResult = UnBlockForTheRequestedUserSlurper.parseText(UnBlockForTheRequestedUser.getResponseBodyContent())

println(UnBlockForTheRequestedUserResult)

WS.verifyResponseStatusCode(UnBlockForTheRequestedUser, 200)

//Unblock Again

UnBlockForTheRequestedUserAgain = WS.sendRequest(findTestObject('api/management/account/UnBlockForTheRequestedUser',
	[('baseUrl') : GlobalVariable.baseUrl, ('BlockedUserId') : GlobalVariable.BlockedUserId, ('token') : GlobalVariable.token]))

def UnBlockForTheRequestedUserAgainSlurper = new groovy.json.JsonSlurper()

def UnBlockForTheRequestedUserAgainResult = UnBlockForTheRequestedUserAgainSlurper.parseText(UnBlockForTheRequestedUserAgain.getResponseBodyContent())

println(UnBlockForTheRequestedUserAgainResult)

def UnBlockAgainErrorMessage = UnBlockForTheRequestedUserAgainResult.errors[0].message
println(UnBlockAgainErrorMessage)

WS.verifyResponseStatusCode(UnBlockForTheRequestedUserAgain, 400)

///////////////////////////////////////////////////////////////////////////////////
//Recall unblocked registered user

GetUserDetailsUsingUserIdafter = WS.sendRequest(findTestObject('api/management/account/user Id/Get user details using his id',
	[('baseUrl') : GlobalVariable.baseUrl, ('token') : GlobalVariable.token, ('UserRegisteredID') : GlobalVariable.UserRegisteredID]))
def GetUserDetailsUsingUserIdafterSlurper = new groovy.json.JsonSlurper()

def GetUserDetailsUsingUserIdafterResult = GetUserDetailsUsingUserIdafterSlurper.parseText(GetUserDetailsUsingUserIdafter.getResponseBodyContent())

println(GetUserDetailsUsingUserIdafterResult)

WS.verifyResponseStatusCode(GetUserDetailsUsingUserIdafter, 200)

////////////////////////////////////////////////////////////////////////////////////
//Register User withput filling password scenarios

UN_RegisterTheUserUsingEmailAndPassword = WS.sendRequest(findTestObject('api/management/account/user Id/Register the user using email and password',
	[('baseUrl') : GlobalVariable.baseUrl, ('randomBodyEmail') : GlobalVariable.randomBodyEmail, ('randomFirstName') : GlobalVariable.randomFirstName
		, ]))
def UN_RegisterTheUserUsingEmailAndPasswordSlurper = new groovy.json.JsonSlurper()

def UN_RegisterTheUserUsingEmailAndPasswordResult =UN_RegisterTheUserUsingEmailAndPasswordSlurper.parseText(UN_RegisterTheUserUsingEmailAndPassword.getResponseBodyContent())

println(UN_RegisterTheUserUsingEmailAndPasswordResult)

//Assert Email exist
def ErrorMessage = UN_RegisterTheUserUsingEmailAndPasswordResult.errors[0].message
println(ErrorMessage)
assertThat("Email Already Exist").isEqualTo(ErrorMessage)
WS.verifyResponseStatusCode(UN_RegisterTheUserUsingEmailAndPassword, 400)


/////////////////////////////////////////////////////////////////////////////////////
//send epty request

//Empty_RegisterTheUserUsingEmailAndPassword =WS.sendRequest(findTestObject('api/management/account/user Id/Register the user using email and password', 
//        [('baseUrl') : GlobalVariable.baseUrl, (null) : GlobalVariable.randomBodyEmail, (null) : GlobalVariable.randomFirstName
//            , (null) : GlobalVariable.RegisterUserPassword]))
//def Empty_RegisterTheUserUsingEmailAndPasswordSlurper = new groovy.json.JsonSlurper()
//
//def Empty_RegisterTheUserUsingEmailAndPasswordResult = Empty_RegisterTheUserUsingEmailAndPasswordSlurper.parseText(Empty_RegisterTheUserUsingEmailAndPassword.getResponseBodyContent())
//
//println(Empty_RegisterTheUserUsingEmailAndPasswordResult)
//
////Assert Email exist
//def PasswordErrorMessage = UN_RegisterTheUserUsingEmailAndPasswordResult.errors[1].message
//println(PasswordErrorMessage)
//assertThat("Unexpected character encountered while parsing value: ,. Path 'password', line 10, position 15.").isEqualTo(PasswordErrorMessage)
//WS.verifyResponseStatusCode(Empty_RegisterTheUserUsingEmailAndPassword, 400)

