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

def AuthenticateUserUsingEmailAndPasswordSlurper = new JsonSlurper()

def AuthenticateUserUsingEmailAndPasswordResult = AuthenticateUserUsingEmailAndPasswordSlurper.parseText(AuthenticateUserUsingEmailAndPassword.getResponseBodyContent())

def Token = AuthenticateUserUsingEmailAndPasswordResult.data.token

GlobalVariable.token = Token

WS.verifyResponseStatusCode(AuthenticateUserUsingEmailAndPassword, 200)

///////////////////////////////////////////////////////////////////////
TagName = ('Tags' + ((Math.random() * 100) as int))

GlobalVariable.TagName = TagName

CreateNewTag = WS.sendRequestAndVerify(findTestObject('api/management/Tags/Create new tag', [('baseUrl') : GlobalVariable.baseUrl
            , ('TagName') : GlobalVariable.TagName, ('token') : GlobalVariable.token]))

def CreateNewTagSlurper = new JsonSlurper()

def CreateNewTagResult = CreateNewTagSlurper.parseText(CreateNewTag.getResponseBodyContent())

println(CreateNewTagResult)

def TagID = CreateNewTagResult.data.id

GlobalVariable.TagID = TagID

def EditTagID = CreateNewTagResult.data.name

GlobalVariable.EditTagID = EditTagID

WS.verifyResponseStatusCode(CreateNewTag, 200)
/////////////////////////////////////////////////////////////////////////

EditTag = WS.sendRequestAndVerify(findTestObject('api/management/Tags/Edit tag', [('baseUrl') : GlobalVariable.baseUrl, ('EditTagID') : GlobalVariable.EditTagID
            , ('TagID') : GlobalVariable.TagID, ('token') : GlobalVariable.token]))

def EditTagSlurper = new JsonSlurper()

def EditTagResult = EditTagSlurper.parseText(EditTag.getResponseBodyContent())

println(EditTagResult)

WS.verifyResponseStatusCode(EditTag, 200)


