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
import com.kms.katalon.core.webservice.support.UrlEncoder



AuthenticateUser = WS.sendRequest(findTestObject('api/management/account/authenticate/Authenticate user using Email and Password', 
        [('baseUrl') : GlobalVariable.baseUrl]))
def AuthenticateUserSlurper = new groovy.json.JsonSlurper()
def AuthenticateUserResult = AuthenticateUserSlurper.parseText(AuthenticateUser.getResponseBodyContent())
def Token = AuthenticateUserResult.data.token
GlobalVariable.token = Token
WS.verifyResponseStatusCode(AuthenticateUser, 200)

///////////////////////////////////////////////////////////////////////////////


RandomRoleName = ('NewRole' + ((Math.random() * 1000) as int))
GlobalVariable.RandomRoleName = RandomRoleName
AddRoleNull = WS.sendRequestAndVerify(findTestObject('api/management/role/AddRoleNull', [('baseUrl') : GlobalVariable.baseUrl
            , ('NullRoleId') : GlobalVariable.NullRoleId, ('token') : GlobalVariable.token, ('RandomRoleName') : GlobalVariable.RandomRoleName]))
def AddRoleNullSlurper = new groovy.json.JsonSlurper()
def AddRoleNullResult = AddRoleNullSlurper.parseText(AddRoleNull.getResponseBodyContent())
def NewEmptyRoleId = AddRoleNullResult.data
GlobalVariable.NewEmptyRoleId = NewEmptyRoleId
println (NewEmptyRoleId)
WS.verifyResponseStatusCode(AddRoleNull, 200)

///////////////////////////////////////////////////////////////////////////////

AddRoleClaim = WS.sendRequestAndVerify(findTestObject('api/management/roleclaim/Add or update a Role Claim', 
        [('baseUrl') : GlobalVariable.baseUrl, ('NewEmptyRoleId') : GlobalVariable.NewEmptyRoleId, ('token') : GlobalVariable.token]))
def AddRoleClaimSlurper = new groovy.json.JsonSlurper()
def AddRoleClaimResult = AddRoleClaimSlurper.parseText(AddRoleClaim.getResponseBodyContent())
WS.verifyResponseStatusCode(AddRoleClaim, 200)

///////////////////////////////////////////////////////////////////////////////


GetAllRoleClaim = WS.sendRequestAndVerify(findTestObject('api/management/roleclaim/Get All Role Claims(e.g. Product Create Permission)', 
        [('baseUrl') : GlobalVariable.baseUrl, ('token') : GlobalVariable.token]))
def GetAllRoleClaimSlurper = new groovy.json.JsonSlurper()
def GetAllRoleClaimResult = GetAllRoleClaimSlurper.parseText(GetAllRoleClaim.getResponseBodyContent())
WS.verifyResponseStatusCode(GetAllRoleClaim, 200)

///////////////////////////////////////////////////////////////////////////////


GetRoleClaimById = WS.sendRequestAndVerify(findTestObject('api/management/roleclaim/Get All Role Claims By Id', 
        [('baseUrl') : GlobalVariable.baseUrl, ('token') : GlobalVariable.token, ('NewEmptyRoleId') : GlobalVariable.NewEmptyRoleId]))
def GetRoleClaimByIdSlurper = new groovy.json.JsonSlurper()
def GetRoleClaimByIdResult = GetRoleClaimByIdSlurper.parseText(GetRoleClaimById.getResponseBodyContent())
def RoleClaimID = GetRoleClaimByIdResult.data[0].id
GlobalVariable.RoleClaimID = RoleClaimID
def RoleID = GetRoleClaimByIdResult.data[0].roleId
GlobalVariable.RoleID = RoleID
WS.verifyResponseStatusCode(GetRoleClaimById, 200)

///////////////////////////////////////////////////////////////////////////////

DeleteRoleClaim = WS.sendRequest(findTestObject('api/management/roleclaim/Delete a Role Claim', [('baseUrl') : GlobalVariable.baseUrl
            , ('token') : GlobalVariable.token, ('RoleClaimID') : GlobalVariable.RoleClaimID]))
def DeleteRoleClaimSlurper = new groovy.json.JsonSlurper()
def DeleteRoleClaimResult = DeleteRoleClaimSlurper.parseText(DeleteRoleClaim.getResponseBodyContent())
WS.verifyResponseStatusCode(DeleteRoleClaim, 200)
println(NewEmptyRoleId)

///////////////////////////////////////////////////////////////////////////////

GetPermissionsByRoleId = WS.sendRequestAndVerify(findTestObject('api/management/roleclaim/Get Permissions By Role Id In claim', 
        [('baseUrl') : GlobalVariable.baseUrl, ('token') : GlobalVariable.token, ('NewEmptyRoleId') : GlobalVariable.NewEmptyRoleId]))
def GetPermissionsByRoleIdSlurper = new groovy.json.JsonSlurper()
def GetPermissionsByRoleIdResult = GetPermissionsByRoleIdSlurper.parseText(GetPermissionsByRoleId.getResponseBodyContent())
println(GetPermissionsByRoleIdResult)
WS.verifyResponseStatusCode(GetPermissionsByRoleId, 200)

