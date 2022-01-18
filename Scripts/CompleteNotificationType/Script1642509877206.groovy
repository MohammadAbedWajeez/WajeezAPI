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

/////////////////////////////////////////////////////////////////////////////////////////////////
AuthenticateUsingEmailAndPassword = WS.sendRequest(findTestObject('version_1/Wajeez_Identity/account/authenticate/Authenticate user using Email and Password', 
        [('baseUrl') : GlobalVariable.baseUrl, ('email') : 'SuperAdmin@wajeez.co', ('password') : 'wajeez@123']))

def AuthenticateUsingEmailAndPasswordslurper = new groovy.json.JsonSlurper()

def AuthenticateUsingEmailAndPasswordresult = AuthenticateUsingEmailAndPasswordslurper.parseText(AuthenticateUsingEmailAndPassword.getResponseBodyContent())

def Token = AuthenticateUsingEmailAndPasswordresult.data.token

GlobalVariable.token = Token

WS.verifyResponseStatusCode(AuthenticateUsingEmailAndPassword, 200)

////////////////////////////////////////////////////////////////////////////////////////////////////
NotifTypeName = ('NotifName' + ((Math.random() * 1000) as int))

GlobalVariable.NotifTypeName = NotifTypeName

CreateNewNotifType = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Engagement/Notification Types/Create new notificationType', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('LanguageID') : GlobalVariable.LanguageID
            , ('NotifTypeName') : GlobalVariable.NotifTypeName, ('token') : GlobalVariable.token]))

def CreateNewNotifTypeSlurper = new groovy.json.JsonSlurper()

def CreateNewNotifTypeResult = CreateNewNotifTypeSlurper.parseText(CreateNewNotifType.getResponseBodyContent())

println(CreateNewNotifTypeResult)

def NotiftypeID = CreateNewNotifTypeResult.data

GlobalVariable.NotiftypeID = NotiftypeID

WS.verifyResponseStatusCode(CreateNewNotifType, 200)

////////////////////////////////////////////////////////////////////////////////////////////////////////
EditNotifType = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Engagement/Notification Types/Edit existing notificationType', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('LanguageID') : GlobalVariable.LanguageID
            , ('UpdatedNotifTypeName') : GlobalVariable.NotifTypeName, ('NotiftypeID') : GlobalVariable.NotiftypeID, ('token') : GlobalVariable.token]))

def EditNotifTypeSlurper = new groovy.json.JsonSlurper()

def EditNotifTypeResult = EditNotifTypeSlurper.parseText(EditNotifType.getResponseBodyContent())

println(EditNotifTypeResult)

def NotiftypeIDUpdated = EditNotifTypeResult.data

GlobalVariable.NotiftypeIDUpdated = NotiftypeIDUpdated

WS.verifyResponseStatusCode(EditNotifType, 200)

////////////////////////////////////////////////////////////////////////////////////////////////////////
GetAllPaginatedNoti = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Engagement/Notification Types/Get all notificationTypes paginated for admin', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('token') : GlobalVariable.token]))

def GetAllPaginatedNotiSlurper = new groovy.json.JsonSlurper()

def GetAllPaginatedNotiResult = GetAllPaginatedNotiSlurper.parseText(GetAllPaginatedNoti.getResponseBodyContent())

println(GetAllPaginatedNotiResult)

WS.verifyResponseStatusCode(GetAllPaginatedNoti, 200)

////////////////////////////////////////////////////////////////////////////////////////////////////////
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

//assertThat(RegisteredEmail).isEqualTo(randomBodyEmail)
WS.verifyResponseStatusCode(RegisterTheUserUsingEmailAndPassword, 200)

////////////////////////////////////////////////////////////////////////////////////////////////////////
GetAllNotifType = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Engagement/Notification Types/Get all notificationTypes', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('UserToken') : GlobalVariable.UserToken]))

def GetAllNotifTypeSlurper = new groovy.json.JsonSlurper()

def GetAllNotifTypeResult = GetAllNotifTypeSlurper.parseText(GetAllNotifType.getResponseBodyContent())

println(GetAllNotifTypeResult)

WS.verifyResponseStatusCode(GetAllNotifType, 200)

////////////////////////////////////////////////////////////////////////////////////////////////////////
GetNotifByID = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Engagement/Notification Types/Get notificationType by id', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('token') : GlobalVariable.token, ('NotiftypeIDUpdated') : GlobalVariable.NotiftypeIDUpdated]))

def GetNotifByIDSlurper = new groovy.json.JsonSlurper()

def GetNotifByIDResult = GetNotifByIDSlurper.parseText(GetNotifByID.getResponseBodyContent())

println(GetNotifByIDResult)

WS.verifyResponseStatusCode(GetNotifByID, 200)

////////////////////////////////////////////////////////////////////////////////////////////////////////
SetRecNotifType = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Engagement/Notification Types/Set Receiver notificationType', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('UserToken') : GlobalVariable.UserToken
            , ('NotiftypeIDUpdated') : GlobalVariable.NotiftypeIDUpdated]))

def SetRecNotifTypeSlurper = new groovy.json.JsonSlurper()

def SetRecNotifTypeResult = SetRecNotifTypeSlurper.parseText(SetRecNotifType.getResponseBodyContent())

println(SetRecNotifTypeResult)

WS.verifyResponseStatusCode(SetRecNotifType, 200)

////////////////////////////////////////////////////////////////////////////////////////////////////////
GetRecNotifType = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Engagement/Notification Types/Get Receiver notificationType', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('UserToken') : GlobalVariable.UserToken]))

def GetRecNotifTypeSlurper = new groovy.json.JsonSlurper()

def GetRecNotifTypeResult = GetRecNotifTypeSlurper.parseText(GetRecNotifType.getResponseBodyContent())

println(GetRecNotifTypeResult)

WS.verifyResponseStatusCode(GetRecNotifType, 200)
////////////////////////////////////////////////////////////////////////////////////////////////////////

DeleteNotifType = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Engagement/Notification Types/Delete notificationType', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('token') : GlobalVariable.token, ('NotiftypeIDUpdated') : GlobalVariable.NotiftypeIDUpdated]))
def DeleteNotifTypeSlurper = new groovy.json.JsonSlurper()

def DeleteNotifTypeResult = DeleteNotifTypeSlurper.parseText(DeleteNotifType.getResponseBodyContent())

println(DeleteNotifTypeResult)

WS.verifyResponseStatusCode(DeleteNotifType, 200)
