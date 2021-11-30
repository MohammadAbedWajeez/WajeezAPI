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

///////////////////////////////////////////////////////////
GetAllPlanGroups = WS.sendRequestAndVerify(findTestObject('api/management/PlanGroup/GetAllPlanGroups', [('baseUrl') : GlobalVariable.baseUrl
            , ('token') : GlobalVariable.token]))

def GetAllPlanGroupsSlurper = new groovy.json.JsonSlurper()

def GetAllPlanGroupsResult = GetAllPlanGroupsSlurper.parseText(GetAllPlanGroups.getResponseBodyContent())

println(GetAllPlanGroupsResult)

WS.verifyResponseStatusCode(GetAllPlanGroups, 200)

///////////////////////////////////////////////////////////
def PlanGroupId = GetAllPlanGroupsResult.data[2].id

println(PlanGroupId)

GlobalVariable.PlanGroupId = PlanGroupId

PlanName = ('PlanName' + ((Math.random() * 1000) as int))

GlobalVariable.PlanName = PlanName

CreateNewPlan = WS.sendRequestAndVerify(findTestObject('api/management/plans/CreateNewPlan', [('baseUrl') : GlobalVariable.baseUrl
            , ('token') : GlobalVariable.token, ('PlanName') : GlobalVariable.PlanName, ('PlanGroupId') : GlobalVariable.PlanGroupId]))

def CreateNewPlanSlurper = new groovy.json.JsonSlurper()

def CreateNewPlanResult = CreateNewPlanSlurper.parseText(CreateNewPlan.getResponseBodyContent())

println(CreateNewPlanResult)

WS.verifyResponseStatusCode(CreateNewPlan, 200)

///////////////////////////////////////////////////////////
GetAllPlans = WS.sendRequestAndVerify(findTestObject('api/management/plans/GetAllPlans', [('baseUrl') : GlobalVariable.baseUrl
            , ('token') : GlobalVariable.token]))

def GetAllPlansSlurper = new groovy.json.JsonSlurper()

def GetAllPlansResult = GetAllPlansSlurper.parseText(GetAllPlans.getResponseBodyContent())

println(GetAllPlansResult)

def PlanId = GetAllPlansResult.data[1].id

GlobalVariable.PlanID = PlanId

println(PlanId)

WS.verifyResponseStatusCode(GetAllPlans, 200)

///////////////////////////////////////////////////////////

GetPlanById = WS.sendRequestAndVerify(findTestObject('api/management/plans/Get plan by id', [('baseUrl') : GlobalVariable.baseUrl
            , ('PlanId') : GlobalVariable.PlanID, ('token') : GlobalVariable.token]))
def GetPlanByIdSlurper = new groovy.json.JsonSlurper()
def GetPlanByIdResult = GetPlanByIdSlurper.parseText(GetPlanById.getResponseBodyContent())
println(GetPlanByIdResult)
WS.verifyResponseStatusCode(GetPlanById, 200)

///////////////////////////////////////////////////////////
EditExistingPlan = WS.sendRequestAndVerify(findTestObject('api/management/plans/EditExistingPlan', [('baseUrl') : GlobalVariable.baseUrl
            , ('PlanId') : GlobalVariable.PlanID, ('PlanName') : GlobalVariable.PlanName, ('PlanGroupId') : GlobalVariable.PlanGroupId
            , ('token') : GlobalVariable.token]))

def EditExistingPlanSlurper = new groovy.json.JsonSlurper()
def EditExistingPlanResult = EditExistingPlanSlurper.parseText(EditExistingPlan.getResponseBodyContent())
println(EditExistingPlanResult)

WS.verifyResponseStatusCode(EditExistingPlan, 200)

/////////////////////////////////////////////////////////////
DeletePlan = WS.sendRequestAndVerify(findTestObject('api/management/plans/DeletePlan', [('baseUrl') : GlobalVariable.baseUrl
            , ('token') : GlobalVariable.token, ('PlanId') : GlobalVariable.PlanID]))

WS.verifyResponseStatusCode(DeletePlan, 200)

