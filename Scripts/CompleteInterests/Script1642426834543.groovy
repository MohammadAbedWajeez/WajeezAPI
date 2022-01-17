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

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Register new user using email and password
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

println(UserToken)

//assertThat(RegisteredEmail).isEqualTo(randomBodyEmail)
WS.verifyResponseStatusCode(RegisterTheUserUsingEmailAndPassword, 200)

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
GetAllInterests = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Content/Interests/Get All Interest', [('baseUrl') : GlobalVariable.baseUrl
            , ('version') : GlobalVariable.version, ('UserToken') : GlobalVariable.UserToken]))

def GetAllInterestsSlurper = new groovy.json.JsonSlurper()

def GetAllInterestsResult = GetAllInterestsSlurper.parseText(GetAllInterests.getResponseBodyContent())

println(GetAllInterestsResult)

def InterestSelfDev = GetAllInterestsResult.data[0].id

GlobalVariable.InterestSelfDev = InterestSelfDev

def InterestMoneyEco = GetAllInterestsResult.data[1].id

GlobalVariable.InterestMoneyEco = InterestMoneyEco

def InterestCV = GetAllInterestsResult.data[2].id

GlobalVariable.InterestCV = InterestCV

def Interesthistory = GetAllInterestsResult.data[3].id

GlobalVariable.Interesthistory = Interesthistory

def InterestHealth = GetAllInterestsResult.data[4].id

GlobalVariable.InterestHealth = InterestHealth

def InterestFamily = GetAllInterestsResult.data[5].id

GlobalVariable.InterestFamily = InterestFamily

def InterestReligion = GetAllInterestsResult.data[6].id

GlobalVariable.InterestReligion = InterestReligion

WS.verifyResponseStatusCode(GetAllInterests, 200)

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
SetUserInterestsSix = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Content/Interests/Set user interests six', 
        [('baseUrl') : GlobalVariable.baseUrl, ('version') : GlobalVariable.version, ('InterestSelfDev') : GlobalVariable.InterestSelfDev
            , ('InterestMoneyEco') : GlobalVariable.InterestMoneyEco, ('InterestCV') : GlobalVariable.InterestCV, ('Interesthistory') : GlobalVariable.Interesthistory
            , ('InterestFamily') : GlobalVariable.InterestFamily, ('InterestReligion') : GlobalVariable.InterestReligion
            , ('UserToken') : GlobalVariable.UserToken]))

def SetUserInterestsSixSlurper = new groovy.json.JsonSlurper()

def SetUserInterestsSixResult = SetUserInterestsSixSlurper.parseText(SetUserInterestsSix.getResponseBodyContent())

println(SetUserInterestsSixResult)

def ErrorMessage = SetUserInterestsSixResult.message

assertThat(ErrorMessage).isEqualTo('NewUsersCanHaveMaxFive')

WS.verifyResponseStatusCode(SetUserInterestsSix, 400)

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
SetUserInterests = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Content/Interests/Set user interests', [('baseUrl') : GlobalVariable.baseUrl
            , ('version') : GlobalVariable.version, ('InterestSelfDev') : GlobalVariable.InterestSelfDev, ('InterestMoneyEco') : GlobalVariable.InterestMoneyEco
            , ('InterestCV') : GlobalVariable.InterestCV, ('Interesthistory') : GlobalVariable.Interesthistory, ('InterestFamily') : GlobalVariable.InterestFamily
            , ('UserToken') : GlobalVariable.UserToken]))

def SetUserInterestsSlurper = new groovy.json.JsonSlurper()

def SetUserInterestsResult = SetUserInterestsSlurper.parseText(SetUserInterests.getResponseBodyContent())

println(SetUserInterestsResult)

//def ErrorMessage = SetUserInterestsResult.message
//assertThat(ErrorMessage).isEqualTo("NewUsersCanHaveMaxFive")
WS.verifyResponseStatusCode(SetUserInterests, 200)

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

GetUserInterests = WS.sendRequestAndVerify(findTestObject('Version_1/Wajeez_Content/Interests/Get user Interests', [('baseUrl') : GlobalVariable.baseUrl
            , ('version') : GlobalVariable.version, ('UserToken') : GlobalVariable.UserToken]))
def GetUserInterestsSlurper = new groovy.json.JsonSlurper()

def GetUserInterestsResult = GetUserInterestsSlurper.parseText(GetUserInterests.getResponseBodyContent())

println(GetUserInterestsResult)
WS.verifyResponseStatusCode(GetUserInterests, 200)
