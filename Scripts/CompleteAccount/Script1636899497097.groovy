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

AuthenticateUserUsingEmailAndPassword = WS.sendRequest(findTestObject('api/management/account/authenticate/Authenticate user using Email and Password', 
        [('baseUrl') : GlobalVariable.baseUrl]))
def AuthenticateUserUsingEmailAndPasswordSlurper = new groovy.json.JsonSlurper()
def AuthenticateUserUsingEmailAndPasswordResult = AuthenticateUserUsingEmailAndPasswordSlurper.parseText(AuthenticateUserUsingEmailAndPassword.getResponseBodyContent())
def Token = AuthenticateUserUsingEmailAndPasswordResult.data.token
GlobalVariable.token = Token
WS.verifyResponseStatusCode(AuthenticateUserUsingEmailAndPassword, 200)


randomBodyEmail = (('wajeezTest' + ((Math.random() * 2000) as int)) + '@wajeez.co')
GlobalVariable.randomBodyEmail = randomBodyEmail
randomFirstName = ('TestRegisterUser' + ((Math.random() * 1000) as int))
GlobalVariable.randomFirstName = randomFirstName

RegisterTheUserUusingEmailAndPassword = WS.sendRequestAndVerify(findTestObject('api/management/account/user Id/Register the user using email and password', 
        [('baseUrl') : GlobalVariable.baseUrl, ('token') : GlobalVariable.token, ('randomFirstName') : GlobalVariable.randomFirstName
            , ('randomBodyEmail') : GlobalVariable.randomBodyEmail]))
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

CheckEmailValidityAndExistenceEmailExist = WS.sendRequest(findTestObject('api/management/account/token/Check email validity and existence', 
        [('baseUrl') : GlobalVariable.baseUrl, ('SuperAdmin@wajeez.co') : GlobalVariable.EmailValidity]))

WS.verifyResponseStatusCode(CheckEmailValidityAndExistenceEmailExist, 200)
RandomSuperEmail = (('wajeezTest' + ((Math.random() * 900) as int)) + '@wajeez.co')

GlobalVariable.RandomSuperEmail = RandomSuperEmail

def CreateAdminUsingemailAndPassword = WS.sendRequest(findTestObject('api/management/account/Create admin using email and password', 
        [('baseUrl') : GlobalVariable.baseUrl, ('RandomSuperEmail') : GlobalVariable.RandomSuperEmail,
			 ('randomFirstName') : GlobalVariable.randomFirstName, ('token') : GlobalVariable.token]))
def CreateAdminUsingemailAndPasswordSlurper = new groovy.json.JsonSlurper()
def CreateAdminUsingemailAndPasswordResult = CreateAdminUsingemailAndPasswordSlurper.parseText(CreateAdminUsingemailAndPassword.getResponseBodyContent())
println(CreateAdminUsingemailAndPasswordResult)
WS.verifyResponseStatusCode(CreateAdminUsingemailAndPassword, 200)



//def CreateAdminUsingemailAndPasswordSlurper = new groovy.json.JsonSlurper()
//def CreateAdminUsingemailAndPasswordResult = CreateAdminUsingemailAndPasswordSlurper.parseText(CreateAdminUsingemailAndPassword.getResponseBodyContent())
//println(CreateAdminUsingemailAndPasswordResult)
//WS.verifyResponseStatusCode(CreateAdminUsingemailAndPassword, 200)
//
//def SecondAdminID = CreateAdminUsingemailAndPasswordResult.data.id
//def SecondAdminToken = CreateAdminUsingemailAndPasswordResult.data.token
//println(CreateAdminUsingemailAndPasswordResult)
//GlobalVariable.SecondAdminToken = SecondAdminToken
//GlobalVariable.SecondAdminID = SecondAdminID
//ChangeTheEmailOfTheCurrentUser = WS.sendRequest(findTestObject('api/management/account/Change the email of the current user', 
//        [('baseUrl') : GlobalVariable.baseUrl, ('UserRegisteredToken') : GlobalVariable.UserRegisteredToken, ('SecondRandomEmail') : GlobalVariable.randomEmail]))
//def ChangeTheEmailOfTheCurrentUserSlurper = new groovy.json.JsonSlurper()
//def ChangeTheEmailOfTheCurrentUserResult = ChangeTheEmailOfTheCurrentUserSlurper.parseText(ChangeTheEmailOfTheCurrentUser.getResponseBodyContent())
//println(ChangeTheEmailOfTheCurrentUserResult)
//WS.verifyResponseStatusCode(ChangeTheEmailOfTheCurrentUser, 200)
//SoftDeletionOfTheCurrentUser = WS.sendRequest(findTestObject('PostmanNew/api/management/account/Soft deletion of the current user', 
//        [('baseUrl') : GlobalVariable.baseUrl, ('UserRegisteredToken') : GlobalVariable.UserRegisteredToken, ('UserRegisteredID') : GlobalVariable.UserRegisteredID]))
//def SoftDeletionOfTheCurrentUserSlurper = new groovy.json.JsonSlurper()
//def SoftDeletionOfTheCurrentUserResult = SoftDeletionOfTheCurrentUserSlurper.parseText(SoftDeletionOfTheCurrentUser.getResponseBodyContent())
//println(SoftDeletionOfTheCurrentUserResult)
//WS.verifyResponseStatusCode(SoftDeletionOfTheCurrentUser, 200)

