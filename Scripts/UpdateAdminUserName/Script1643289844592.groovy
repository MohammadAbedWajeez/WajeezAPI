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

AuthenticateUserUsingEmailAndPassword = WS.sendRequest(findTestObject('Version_1/Wajeez_Identity/Account/authenticate/Authenticate user using Email and Password', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version]))

def AuthenticateUserUsingEmailAndPasswordSlurper = new groovy.json.JsonSlurper()

def AuthenticateUserUsingEmailAndPasswordResult = AuthenticateUserUsingEmailAndPasswordSlurper.parseText(AuthenticateUserUsingEmailAndPassword.getResponseBodyContent())

def Token = AuthenticateUserUsingEmailAndPasswordResult.data.token

GlobalVariable.token = Token

println(AuthenticateUserUsingEmailAndPasswordResult)

WS.verifyResponseStatusCode(AuthenticateUserUsingEmailAndPassword, 200)

//////////////////////////////////////////////////////////////////////////////////////////////////////
//randomBodyEmail = (('wajeezTest' + ((Math.random() * 2000) as int)) + '@wajeez.co')
//
//GlobalVariable.randomBodyEmail = randomBodyEmail
randomFirstName = ('TestRegisterUser' + ((Math.random() * 1000) as int))

GlobalVariable.randomFirstName = randomFirstName

RandomSuperEmail = (('wajeezNewAdmin' + ((Math.random() * 900) as int)) + '@wajeez.co')

GlobalVariable.RandomSuperEmail = RandomSuperEmail

def CreateAdminUsingemailAndPassword = WS.sendRequest(findTestObject('Version_1/Wajeez_Identity/Account/Create admin using email and password', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('RandomSuperEmail') : GlobalVariable.RandomSuperEmail
            , ('randomFirstName') : GlobalVariable.randomFirstName, ('RandomSuperPw') : GlobalVariable.RandomSuperPw, ('token') : GlobalVariable.token]))

def CreateAdminUsingemailAndPasswordSlurper = new groovy.json.JsonSlurper()

def CreateAdminUsingemailAndPasswordResult = CreateAdminUsingemailAndPasswordSlurper.parseText(CreateAdminUsingemailAndPassword.getResponseBodyContent())

println(CreateAdminUsingemailAndPasswordResult)

WS.verifyResponseStatusCode(CreateAdminUsingemailAndPassword, 200)

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
GetUserDetails = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Identity/Account/authenticate/AuthenticateUserUsingEmailAndPasswordRegisteredAdmin', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('RandomSuperEmail') : GlobalVariable.RandomSuperEmail
            , ('RandomSuperPw') : GlobalVariable.RandomSuperPw]))

def GetUserDetailsSlurper = new groovy.json.JsonSlurper()

def GetUserDetailsResult = GetUserDetailsSlurper.parseText(GetUserDetails.getResponseBodyContent())

println(GetUserDetailsResult)

def UserToken = GetUserDetailsResult.data.token

GlobalVariable.UserToken = UserToken

def ActualName = GetUserDetailsResult.data.name

GlobalVariable.ActualName = ActualName

WS.verifyResponseStatusCode(GetUserDetails, 200)

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

def UpdatedAdminName = ('NewAdminName' + ((Math.random() * 1000) as int))
GlobalVariable.UpdatedAdminName = UpdatedAdminName

UpdateUserNameAdmin = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Identity/Account/Update the name of the user AdminUser', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('UserToken') : GlobalVariable.UserToken, ('UpdatedAdminName') : GlobalVariable.UpdatedAdminName]))

def UpdateUserNameAdminSlurper = new groovy.json.JsonSlurper()

def UpdateUserNameAdminResult = UpdateUserNameAdminSlurper.parseText(UpdateUserNameAdmin.getResponseBodyContent())

println(UpdateUserNameAdminResult)
def UpdatedName = UpdateUserNameAdminResult.data.name
println(UpdatedName)

GlobalVariable.UpdatedName = UpdatedName

//assert assertThat(UpdatedName).isEqualTo(UpdatedAdminName)
WS.verifyResponseStatusCode(UpdateUserNameAdmin, 200)