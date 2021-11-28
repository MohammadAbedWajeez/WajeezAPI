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

CreateNewFeature = WS.sendRequestAndVerify(findTestObject('api/management/features/Create new feature', [('baseUrl') : GlobalVariable.baseUrl
            , ('token') : GlobalVariable.token]))

def CreateNewFeatureSlurper = new groovy.json.JsonSlurper()

def CreateNewFeatureResult = CreateNewFeatureSlurper.parseText(CreateNewFeature.getResponseBodyContent())

println(CreateNewFeatureResult)

def FeatureID = CreateNewFeatureResult.data

GlobalVariable.FeatureID = FeatureID

WS.verifyResponseStatusCode(CreateNewFeature, 200)

EditExistingFeature = WS.sendRequestAndVerify(findTestObject('api/management/features/Edit existing feature', 
        [('baseUrl') : GlobalVariable.baseUrl, ('FeatureID') : GlobalVariable.FeatureID, ('token') : GlobalVariable.token]))

def EditExistingFeatureSlurper = new groovy.json.JsonSlurper()

def EditExistingFeatureResult = EditExistingFeatureSlurper.parseText(EditExistingFeature.getResponseBodyContent())

println(EditExistingFeatureResult)

WS.verifyResponseStatusCode(EditExistingFeature, 200)

GetAllPlans = WS.sendRequestAndVerify(findTestObject('api/management/plans/GetAllPlans', [('baseUrl') : GlobalVariable.baseUrl
            , ('token') : GlobalVariable.token]))

def GetAllPlansSlurper = new groovy.json.JsonSlurper()

def GetAllPlansResult = GetAllPlansSlurper.parseText(GetAllPlans.getResponseBodyContent())

def PlanID = GetAllPlansResult.data[0].id

GlobalVariable.PlanID = PlanID

AssignFeatureToPlan = WS.sendRequestAndVerify(findTestObject('api/management/features/Assign Feature To Plan', 
        [('baseUrl') : GlobalVariable.baseUrl, ('PlanID') : GlobalVariable.PlanID, ('FeatureID') : GlobalVariable.FeatureID
            , ('token') : GlobalVariable.token]))

def AssignFeatureToPlanSlurper = new groovy.json.JsonSlurper()

def AssignFeatureToPlanResult = AssignFeatureToPlanSlurper.parseText(AssignFeatureToPlan.getResponseBodyContent())

println(AssignFeatureToPlanResult)

WS.verifyResponseStatusCode(AssignFeatureToPlan, 200)

GetAllFeatures = WS.sendRequestAndVerify(findTestObject('api/management/features/Get all features', [('baseUrl') : GlobalVariable.baseUrl
            , ('token') : GlobalVariable.token]))

WS.verifyResponseStatusCode(GetAllFeatures, 200)

GetFeaturesById = WS.sendRequestAndVerify(findTestObject('api/management/features/Get feature by id', [('baseUrl') : GlobalVariable.baseUrl
            , ('FeatureID') : GlobalVariable.FeatureID, ('token') : GlobalVariable.token]))

WS.verifyResponseStatusCode(GetFeaturesById, 200)

GetFeatureByPlanId = WS.sendRequestAndVerify(findTestObject('api/management/features/GetFeatureByPlanId', [('baseUrl') : GlobalVariable.baseUrl
            , ('PlanID') : GlobalVariable.PlanID, ('token') : GlobalVariable.token]))

WS.verifyResponseStatusCode(GetFeatureByPlanId, 200)



UnAssignFeatureByPlanId = WS.sendRequestAndVerify(findTestObject('api/management/features/UnAssignFeatureToPlan', 
        [('baseUrl') : GlobalVariable.baseUrl, ('PlanID') : GlobalVariable.PlanID, ('FeatureID') : GlobalVariable.FeatureID
            , ('token') : GlobalVariable.token]))
def UnAssignFeatureByPlanIdSlurper = new groovy.json.JsonSlurper()

def UnAssignFeatureByPlanIdResult = UnAssignFeatureByPlanIdSlurper.parseText(UnAssignFeatureByPlanId.getResponseBodyContent())

println(UnAssignFeatureByPlanIdResult)
WS.verifyResponseStatusCode(UnAssignFeatureByPlanId, 200)


DeleteFeature = WS.sendRequestAndVerify(findTestObject('api/management/features/Delete feature', [('baseUrl') : GlobalVariable.baseUrl
            , ('FeatureID') : GlobalVariable.FeatureID, ('token') : GlobalVariable.token]))

def DeleteFeatureSlurper = new groovy.json.JsonSlurper()

def DeleteFeatureResult = DeleteFeatureSlurper.parseText(DeleteFeature.getResponseBodyContent())

println(DeleteFeatureResult)

WS.verifyResponseStatusCode(DeleteFeature, 200)

