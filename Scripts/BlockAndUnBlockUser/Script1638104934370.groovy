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

AuthenticateUsingEmailAndPassword = WS.sendRequest(findTestObject('api/management/account/authenticate/Authenticate user using Email and Password', 
        [('baseUrl') : GlobalVariable.baseUrl, ('email') : 'SuperAdmin@wajeez.co', ('password') : 'wajeez@123']))

def AuthenticateUsingEmailAndPasswordslurper = new groovy.json.JsonSlurper()

def AuthenticateUsingEmailAndPasswordresult = AuthenticateUsingEmailAndPasswordslurper.parseText(AuthenticateUsingEmailAndPassword.getResponseBodyContent())

def Token = AuthenticateUsingEmailAndPasswordresult.data.token

GlobalVariable.token = Token

randomBodyEmail = (('RandomEmail' + ((Math.random() * 1000) as int)) + '@gmail.com')

GlobalVariable.randomBodyEmail = randomBodyEmail

randomFirstName = ('RandomFirstName' + ((Math.random() * 1000) as int))

GlobalVariable.randomFirstName = randomFirstName

RegisterUserPassword = ('Password' + ((Math.random() * 1000) as int))

GlobalVariable.RegisterUserPassword = RegisterUserPassword

RegisterTheUserUsingEmailAndPassword = WS.sendRequest(findTestObject('api/management/account/{user Id}/Register the user using email and password', 
        [('baseUrl') : GlobalVariable.baseUrl, ('randomBodyEmail') : GlobalVariable.randomBodyEmail, ('randomFirstName') : GlobalVariable.randomFirstName
            , ('RegisterUserPassword') : GlobalVariable.RegisterUserPassword]))

def RegisterTheUserUsingEmailAndPasswordslurper = new groovy.json.JsonSlurper()

def RegisterTheUserUsingEmailAndPasswordresult = RegisterTheUserUsingEmailAndPasswordslurper.parseText(RegisterTheUserUsingEmailAndPassword.getResponseBodyContent())

println(RegisterTheUserUsingEmailAndPasswordresult)

def RegisteredEmail = RegisterTheUserUsingEmailAndPasswordresult.data.email

assertThat(RegisteredEmail).isEqualTo(randomBodyEmail)

WS.verifyResponseStatusCode(RegisterTheUserUsingEmailAndPassword, 200)






def UserRegisteredID = RegisterTheUserUsingEmailAndPasswordresult.data.id
GlobalVariable.UserRegisteredID = UserRegisteredID
println(Token)
BlockForTheRequestedUser = WS.sendRequest(findTestObject('api/management/account/Block for the requested user', 
        [('baseUrl') : GlobalVariable.baseUrl, ('UserRegisteredID') : GlobalVariable.UserRegisteredID, ('token') : GlobalVariable.token]))

def BlockForTheRequestedUserslurper = new groovy.json.JsonSlurper()

def BlockForTheRequestedUserresult = BlockForTheRequestedUserslurper.parseText(BlockForTheRequestedUser.getResponseBodyContent())

println(BlockForTheRequestedUserresult)

WS.verifyResponseStatusCode(BlockForTheRequestedUser, 200)





GetUserDetailsUsingUserId = WS.sendRequest(findTestObject('api/management/account/{user Id}/Get user details using his id', 
        [('baseUrl') : GlobalVariable.baseUrl, ('token') : GlobalVariable.token, ('UserRegisteredID') : GlobalVariable.UserRegisteredID]))
def GetUserDetailsUsingUserIdSlurper = new groovy.json.JsonSlurper()

def GetUserDetailsUsingUserIdResult = GetUserDetailsUsingUserIdSlurper.parseText(GetUserDetailsUsingUserId.getResponseBodyContent())

println(GetUserDetailsUsingUserIdResult)

BlockedUserId = GetUserDetailsUsingUserIdResult.data.id

GlobalVariable.BlockedUserId = BlockedUserId

WS.verifyResponseStatusCode(GetUserDetailsUsingUserId, 200)


UnBlockForTheRequestedUser = WS.sendRequest(findTestObject('api/management/account/UnBlockForTheRequestedUser', 
        [('baseUrl') : GlobalVariable.baseUrl, ('BlockedUserId') : GlobalVariable.BlockedUserId, ('token') : GlobalVariable.token]))

def UnBlockForTheRequestedUserSlurper = new groovy.json.JsonSlurper()

def UnBlockForTheRequestedUserResult = UnBlockForTheRequestedUserSlurper.parseText(UnBlockForTheRequestedUser.getResponseBodyContent())

println(UnBlockForTheRequestedUserResult)

WS.verifyResponseStatusCode(UnBlockForTheRequestedUser, 200)


GetUserDetailsUsingUserIdafter = WS.sendRequest(findTestObject('api/management/account/{user Id}/Get user details using his id',
	[('baseUrl') : GlobalVariable.baseUrl, ('token') : GlobalVariable.token, ('UserRegisteredID') : GlobalVariable.UserRegisteredID]))
def GetUserDetailsUsingUserIdafterSlurper = new groovy.json.JsonSlurper()

def GetUserDetailsUsingUserIdafterResult = GetUserDetailsUsingUserIdafterSlurper.parseText(GetUserDetailsUsingUserIdafter.getResponseBodyContent())

println(GetUserDetailsUsingUserIdafterResult)

WS.verifyResponseStatusCode(GetUserDetailsUsingUserIdafter, 200)



