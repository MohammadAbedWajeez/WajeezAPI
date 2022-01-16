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

AuthenticateUserUsingEmailAndPassword = WS.sendRequest(findTestObject('Version_1/Wajeez_Identity/Account/authenticate/Authenticate user using Email and Password', 
        [('baseUrl') : GlobalVariable.baseUrl]))

def AuthenticateUserUsingEmailAndPasswordSlurper = new groovy.json.JsonSlurper()

def AuthenticateUserUsingEmailAndPasswordResult = AuthenticateUserUsingEmailAndPasswordSlurper.parseText(AuthenticateUserUsingEmailAndPassword.getResponseBodyContent())

def Token = AuthenticateUserUsingEmailAndPasswordResult.data.token

GlobalVariable.token = Token

WS.verifyResponseStatusCode(AuthenticateUserUsingEmailAndPassword, 200)




//UploadNewIcon = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_MMS/Upload new icon', [('baseUrl') : GlobalVariable.baseUrl
//            , ('version') : GlobalVariable.version, ('token') : GlobalVariable.token]))


WS.
 WS.uploadFile (findTestObject('Version_1/Wajeez_MMS/Upload new icon', [('baseUrl') : GlobalVariable.baseUrl
            , ('version') : GlobalVariable.version, ('token') : GlobalVariable.token]), 'C:\\Users\\DELL\\Desktop\\MMS\\icon.svg')
//
//def UploadNewIconSlurper = new groovy.json.JsonSlurper()
//
//def UploadNewIconResult = UploadNewIconSlurper.parseText(UploadNewIcon.getResponseBodyContent())
//
//println(UploadNewIconResult)
//
//WS.verifyResponseStatusCode(UploadNewIcon, 200)

//CreateNewtime = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Engagement/Times/Create new time', [('baseUrl') : GlobalVariable.baseUrl
//            , ('version') : GlobalVariable.version, ('token') : GlobalVariable.token]))
//
//def CreateNewtimeSlurper = new groovy.json.JsonSlurper()
//
//def CreateNewtimeResult = CreateNewtimeSlurper.parseText(CreateNewtime.getResponseBodyContent())
//
//println(CreateNewtimeResult)

