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

GetAllPlanGroups = WS.sendRequestAndVerify(findTestObject('api/management/PlanGroup/GetAllPlanGroups', [('baseUrl') : GlobalVariable.baseUrl
            , ('token') : GlobalVariable.token]))

def GetAllPlanGroupsSlurper = new groovy.json.JsonSlurper()

def GetAllPlanGroupsResult = GetAllPlanGroupsSlurper.parseText(GetAllPlanGroups.getResponseBodyContent())

println(GetAllPlanGroupsResult)

WS.verifyResponseStatusCode(GetAllPlanGroups, 200)

PlanGroupName = ('PlanGroup' + ((Math.random() * 1000) as int))

GlobalVariable.PlanGroupName = PlanGroupName

CreateNewPlanGroup = WS.sendRequestAndVerify(findTestObject('api/management/PlanGroup/CreateNewPlanGroup', [('baseUrl') : GlobalVariable.baseUrl
            , ('PlanGroupName') : GlobalVariable.PlanGroupName, ('token') : GlobalVariable.token]))

def CreateNewPlanGroupSlurper = new groovy.json.JsonSlurper()

def CreateNewPlanGroupResult = CreateNewPlanGroupSlurper.parseText(CreateNewPlanGroup.getResponseBodyContent())

println(CreateNewPlanGroupResult)

WS.verifyResponseStatusCode(CreateNewPlanGroup, 200)

def PlanGroupId = CreateNewPlanGroupResult.data.id
GlobalVariable.PlanGroupId = PlanGroupId

//def CreatedPlanGroupName = CreateNewPlanGroupResult.data.name
//GlobalVariable.CreatedPlanGroupName = CreatedPlanGroupName
println(PlanGroupId)

EditPlanGroup = WS.sendRequestAndVerify(findTestObject('api/management/PlanGroup/EditExistPlanGroup', [('baseUrl') : GlobalVariable.baseUrl
            , ('PlanGroupId') : GlobalVariable.PlanGroupId, ('token') : GlobalVariable.token, ('PlanGroupName') : GlobalVariable.PlanGroupName]))

WS.verifyResponseStatusCode(EditPlanGroup, 200)


