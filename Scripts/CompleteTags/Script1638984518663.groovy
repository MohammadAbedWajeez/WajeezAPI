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
import groovy.json.JsonSlurper as JsonSlurper
import org.assertj.core.api.Assertions as Assertions

AuthenticateUserUsingEmailAndPassword = WS.sendRequest(findTestObject('version_1/Wajeez_Identity/account/authenticate/Authenticate user using Email and Password', 
        [('baseUrl') : GlobalVariable.baseUrl]))

def AuthenticateUserUsingEmailAndPasswordSlurper = new JsonSlurper()

def AuthenticateUserUsingEmailAndPasswordResult = AuthenticateUserUsingEmailAndPasswordSlurper.parseText(AuthenticateUserUsingEmailAndPassword.getResponseBodyContent())

def Token = AuthenticateUserUsingEmailAndPasswordResult.data.token

GlobalVariable.token = Token

WS.verifyResponseStatusCode(AuthenticateUserUsingEmailAndPassword, 200)

///////////////////////////////////////////////////////////////////////
TagName = ('Tags' + ((Math.random() * 100) as int))

GlobalVariable.TagName = TagName

CreateNewTag = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Logging/Tags/Create new tag', [('baseUrl') : GlobalVariable.baseUrl
            , ('version') : GlobalVariable.version, ('token') : GlobalVariable.token, ('TagName') : GlobalVariable.TagName]))

def CreateNewTagSlurper = new JsonSlurper()

def CreateNewTagResult = CreateNewTagSlurper.parseText(CreateNewTag.getResponseBodyContent())

println(CreateNewTagResult)

def TagID = CreateNewTagResult.data.id

GlobalVariable.TagID = TagID

def EditTagID = 'Edit' + CreateNewTagResult.data.name

GlobalVariable.EditTagID = EditTagID

WS.verifyResponseStatusCode(CreateNewTag, 200)

/////////////////////////////////////////////////////////////////////////
EditTag = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Logging/Tags/Edit tag', [('NewBase') : GlobalVariable.NewBase
            , ('TagName') : GlobalVariable.TagName, ('EditTagID') : GlobalVariable.EditTagID, ('token') : GlobalVariable.token]))

def EditTagSlurper = new JsonSlurper()

def EditTagResult = EditTagSlurper.parseText(EditTag.getResponseBodyContent())

println(EditTagResult)

WS.verifyResponseStatusCode(EditTag, 200)

/////////////////////////////////////////////////////////////////////////
GetAllTags = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Logging/Tags/Get all tags', [('baseUrl') : GlobalVariable.baseUrl
            , ('version') : GlobalVariable.version]))

def GetAllTagsSlurper = new JsonSlurper()

def GetAllTagsResult = GetAllTagsSlurper.parseText(GetAllTags.getResponseBodyContent())

println(GetAllTagsResult)

WS.verifyResponseStatusCode(GetAllTags, 200)

/////////////////////////////////////////////////////////////////////////
GetContentitems = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Logging/Tags/GetContentItems', [('baseUrl') : GlobalVariable.baseUrl]))

def GetContentitemsSlurper = new JsonSlurper()

def GetContentitemsResult = GetContentitemsSlurper.parseText(GetContentitems.getResponseBodyContent())

println(GetContentitemsResult)

WS.verifyResponseStatusCode(GetContentitems, 200)

//////////////////////////////////////////////////////////////////////
NewBookContentItem = ('BookContentItem' + ((Math.random() * 100) as int))

GlobalVariable.NewBookContentItem = NewBookContentItem

CreateNewBookContentItem = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Content/Collections/Create new book content item', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('NewBookContentItem') : GlobalVariable.NewBookContentItem]))

def CreateNewBookContentItemSlurper = new JsonSlurper()

def CreateNewBookContentItemResult = CreateNewBookContentItemSlurper.parseText(CreateNewBookContentItem.getResponseBodyContent())

def ContentItemID = CreateNewBookContentItemResult.data

GlobalVariable.ContentItemID = ContentItemID

println(CreateNewBookContentItemResult)

WS.verifyResponseStatusCode(CreateNewBookContentItem, 200)

/////////////////////////////////////////////////////////////////////////
AssignTagsToContentItem = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Logging/Tags/Assign tags to a Content Item', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version]))

def AssignTagsToContentItemSlurper = new JsonSlurper()

def AssignTagsToContentItemResult = AssignTagsToContentItemSlurper.parseText(AssignTagsToContentItem.getResponseBodyContent())

println(AssignTagsToContentItemResult)

WS.verifyResponseStatusCode(AssignTagsToContentItem, 200)

/////////////////////////////////////////////////////////////////////////
UnAssignTagFromContent = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Logging/Tags/Un-Assign tags from a Content Item', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version]))

def UnAssignTagFromContentSlurper = new JsonSlurper()

def UnAssignTagFromContentResult = UnAssignTagFromContentSlurper.parseText(UnAssignTagFromContent.getResponseBodyContent())

println(UnAssignTagFromContentResult)

WS.verifyResponseStatusCode(UnAssignTagFromContent, 200)

