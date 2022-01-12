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
import cucumber.runtime.junit.Assertions as Assertions
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import static org.assertj.core.api.Assertions.*



AuthenticateUserUsingEmailAndPassword = WS.sendRequest(findTestObject('version_1/Wajeez_Identity/account/authenticate/Authenticate user using Email and Password', 
        [('baseUrl') : GlobalVariable.baseUrl]))
def AuthenticateUserUsingEmailAndPasswordSlurper = new groovy.json.JsonSlurper()
def AuthenticateUserUsingEmailAndPasswordResult = AuthenticateUserUsingEmailAndPasswordSlurper.parseText(AuthenticateUserUsingEmailAndPassword.getResponseBodyContent())
def Token = AuthenticateUserUsingEmailAndPasswordResult.data.token
GlobalVariable.token = Token
WS.verifyResponseStatusCode(AuthenticateUserUsingEmailAndPassword, 200)

///////////////////////////////////////////////////////////////////////////////

RandomRoleName = ('RoleName' + ((Math.random() * 1000) as int))
GlobalVariable.RandomRoleName = RandomRoleName
AddOrUpdateRole = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Identity/role/Add pr update a Role', [('baseUrl') : GlobalVariable.baseUrl
	, ('db126f9e-3245-4c15-b812-d13240f26bae') : GlobalVariable.ContentManagerID, ('token') : GlobalVariable.token, ('RandomRoleName') : GlobalVariable.RandomRoleName]))

def AddOrUpdateRoleSlurper = new groovy.json.JsonSlurper()
def AddOrUpdateRoleResult = AddOrUpdateRoleSlurper.parseText(AddOrUpdateRole.getResponseBodyContent())
println(AddOrUpdateRoleResult)
def Success = AddOrUpdateRoleResult.success
assertThat(Success).isEqualTo(true)
WS.verifyResponseStatusCode(AddOrUpdateRole, 200)

///////////////////////////////////////////////////////////////////////////////


GetAllRoles = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Identity/role/Get All Roles (basic, admin etc.)', [('baseUrl') : GlobalVariable.baseUrl
            , ('token') : GlobalVariable.token]))
WS.verifyResponseStatusCode(GetAllRoles, 200)
def GetAllRolesSlurper = new groovy.json.JsonSlurper()
def GetAllRolesResult = GetAllRolesSlurper.parseText(GetAllRoles.getResponseBodyContent())
println(GetAllRolesResult)
//def ContentManagerID = GetAllRolesResult.hasProperty("ContentManager")
def ContentManagerID = GetAllRolesResult.data[13].id
//assertThat(ContentManagerID).isEqualTo('646b33f2-c3a0-4061-85ff-48d2178899e4')
def AudioManagerID = GetAllRolesResult.data[0].id
assertThat(AudioManagerID).isEqualTo('26a8e7b5-17af-481d-bb12-4898fcc85e12')
def ContentOfficerID = GetAllRolesResult.data[1].id
assertThat(ContentOfficerID).isEqualTo('05ce4999-a2d6-42b8-97cc-f4653e4fb8df')
def AudioOfficerID = GetAllRolesResult.data[2].id
//assertThat(AudioOfficerID).isEqualTo('a71b663f-6de2-479e-9823-1833879a2948')
GlobalVariable.ContentManagerID = ContentManagerID
GlobalVariable.AudioManagerID = AudioManagerID
GlobalVariable.ContentOfficerID = ContentOfficerID
GlobalVariable.AudioOfficerID = AudioOfficerID


///////////////////////////////////////////////////////////////////////////////

DeleteRole = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Identity/role/Delete a Role', [('baseUrl') : GlobalVariable.baseUrl, ('token') : GlobalVariable.token, ('ContentManagerID') : GlobalVariable.ContentManagerID]))
def DeleteRoleSlurper = new groovy.json.JsonSlurper()
def DeleteRoleResult = DeleteRoleSlurper.parseText(DeleteRole.getResponseBodyContent())
println(DeleteRoleResult)
WS.verifyResponseStatusCode(DeleteRole, 400)

///////////////////////////////////////////////////////////////////////////////
AfterDeleteGetAllRoles = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Identity/role/Get All Roles (basic, admin etc.)', [('baseUrl') : GlobalVariable.baseUrl
	, ('token') : GlobalVariable.token]))
def AfterDeleteGetAllRolesSlurper = new groovy.json.JsonSlurper()
def AfterDeleteGetAllRolesResult = AfterDeleteGetAllRolesSlurper.parseText(AfterDeleteGetAllRoles.getResponseBodyContent())
println(AfterDeleteGetAllRolesResult)
WS.verifyResponseStatusCode(AfterDeleteGetAllRoles, 200)
