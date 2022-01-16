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

//
//randomBodyEmail = (('RandomEmail' + ((Math.random() * 1000) as int)) + '@gmail.com')
//
//GlobalVariable.randomBodyEmail = randomBodyEmail
//
//randomFirstName = ('RandomFirstName' + ((Math.random() * 1000) as int))
//
//GlobalVariable.randomFirstName = randomFirstName
//
//RegisterUserPassword = ('Password' + ((Math.random() * 1000) as int))
//
//GlobalVariable.RegisterUserPassword = RegisterUserPassword
//
//RegisterTheUserUsingEmailAndPassword = WS.sendRequest(findTestObject('Version_1/Wajeez_Identity/Account/Register the user using email and password', 
//        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('randomBodyEmail') : GlobalVariable.randomBodyEmail
//            , ('$randomHexColor') : GlobalVariable.randomHexColor, ('$randomFirstName') : GlobalVariable.randomFirstName]))
//
//def RegisterTheUserUsingEmailAndPasswordslurper = new groovy.json.JsonSlurper()
//
//def RegisterTheUserUsingEmailAndPasswordresult = RegisterTheUserUsingEmailAndPasswordslurper.parseText(RegisterTheUserUsingEmailAndPassword.getResponseBodyContent())
//
//println(RegisterTheUserUsingEmailAndPasswordresult)
//
//UserToken = RegisterTheUserUsingEmailAndPasswordresult.data.id
//
//
//WS.verifyResponseStatusCode(RegisterTheUserUsingEmailAndPassword, 200)
/////////////////////////////////////////////////////////////////////////////////////////////////
AuthenticateUsingEmailAndPassword = WS.sendRequest(findTestObject('version_1/Wajeez_Identity/account/authenticate/Authenticate user using Email and Password', 
        [('baseUrl') : GlobalVariable.baseUrl, ('email') : 'SuperAdmin@wajeez.co', ('password') : 'wajeez@123']))

def AuthenticateUsingEmailAndPasswordslurper = new groovy.json.JsonSlurper()

def AuthenticateUsingEmailAndPasswordresult = AuthenticateUsingEmailAndPasswordslurper.parseText(AuthenticateUsingEmailAndPassword.getResponseBodyContent())

def Token = AuthenticateUsingEmailAndPasswordresult.data.token

GlobalVariable.token = Token

////////////////////////////////////////////////////////////////////////////////////////////////////////
UploadIcon = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_MMS/Upload new icon', [('baseUrl') : GlobalVariable.baseUrl
            , ('version') : GlobalVariable.version, ('token') : GlobalVariable.token]))

def UploadIconSlurper = new groovy.json.JsonSlurper()

def UploadIconResult = UploadIconSlurper.parseText(UploadIcon.getResponseBodyContent())

println(UploadIconResult)

IconID = UploadIconResult.data

println(IconID)

GlobalVariable.IconID = IconID

WS.verifyResponseStatusCode(UploadIcon, 200)

/////////////////////////////////////////////////////////////////////////////////////////////////////////
CreateNewGoal = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Content/Goals/Create new goal', [('baseUrl') : GlobalVariable.baseUrl
            , ('version') : GlobalVariable.version, ('token') : GlobalVariable.token, ('IconID') : GlobalVariable.IconID]))

def CreateNewGoalSlurper = new groovy.json.JsonSlurper()

def CreateNewGoalResult = CreateNewGoalSlurper.parseText(CreateNewGoal.getResponseBodyContent())

println(CreateNewGoalResult)

WS.verifyResponseStatusCode(CreateNewGoal, 200)

GoalID = CreateNewGoalResult.data

println(GoalID)

GlobalVariable.GoalID = GoalID

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
EditGoal = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Content/Goals/Edit goal', [('baseUrl') : GlobalVariable.baseUrl
            , ('version') : GlobalVariable.version, ('token') : GlobalVariable.token, ('GoalID') : GlobalVariable.GoalID]))

def EditGoalSlurper = new groovy.json.JsonSlurper()

def EditGoalResult = EditGoalSlurper.parseText(EditGoal.getResponseBodyContent())

println(EditGoalResult)

WS.verifyResponseStatusCode(EditGoal, 200)
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
SetReaderGoal = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Content/Goals/Set Reader goal', [('baseUrl') : GlobalVariable.baseUrl
	, ('version') : GlobalVariable.version, ('GoalID') : GlobalVariable.GoalID, ('token') : GlobalVariable.token]))
def SetReaderGoalSlurper = new groovy.json.JsonSlurper()

def SetReaderGoalResult = SetReaderGoalSlurper.parseText(SetReaderGoal.getResponseBodyContent())

println(SetReaderGoalResult)

WS.verifyResponseStatusCode(SetReaderGoal, 200)


///////////////////////////////////////////////////////////////////////////////////////////////////////////////
DeleteGoal = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Content/Goals/Delete goal', [('baseUrl') : GlobalVariable.baseUrl
            , ('version') : GlobalVariable.version, ('token') : GlobalVariable.token, ('GoalID') : GlobalVariable.GoalID]))

def DeleteGoalSlurper = new groovy.json.JsonSlurper()

def DeleteGoalResult = DeleteGoalSlurper.parseText(DeleteGoal.getResponseBodyContent())

println(DeleteGoalResult)

WS.verifyResponseStatusCode(DeleteGoal, 200)



