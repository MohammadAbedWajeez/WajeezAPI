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



AuthenticateUserUsingEmailAndPassword = WS.sendRequest(findTestObject('api/management/account/authenticate/Authenticate user using Email and Password', 
        [('baseUrl') : GlobalVariable.baseUrl]))

def AuthenticateUserUsingEmailAndPasswordSlurper = new groovy.json.JsonSlurper()

def AuthenticateUserUsingEmailAndPasswordResult = AuthenticateUserUsingEmailAndPasswordSlurper.parseText(AuthenticateUserUsingEmailAndPassword.getResponseBodyContent())

def Token = AuthenticateUserUsingEmailAndPasswordResult.data.token

GlobalVariable.token = Token

WS.verifyResponseStatusCode(AuthenticateUserUsingEmailAndPassword, 200)

/////////////////////////////////////////////////////////////////

GetAllProducts = WS.sendRequestAndVerify(findTestObject('api/management/products/Get All Products', [('baseUrl') : GlobalVariable.baseUrl
            , ('token') : GlobalVariable.token]))
WS.verifyResponseStatusCode(GetAllProducts, 200)

/////////////////////////////////////////////////////////////////
RandomProductName = ('Product' + ((Math.random() * 10) as int))
GlobalVariable.RandomProductName = RandomProductName
CreateNewProduct = WS.sendRequestAndVerify(findTestObject('api/management/products/Create New Product', [('baseUrl') : GlobalVariable.baseUrl
            , ('token') : GlobalVariable.token, ('RandomProductName') : GlobalVariable.RandomProductName]))
def CreateNewProductSlurper = new groovy.json.JsonSlurper()
def CreateNewProductResult = CreateNewProductSlurper.parseText(CreateNewProduct.getResponseBodyContent())
println(CreateNewProductResult)
def ProductID = CreateNewProductResult.data.id
GlobalVariable.ProductID = ProductID
def ProductPlanId = CreateNewProductResult.data.planId
GlobalVariable.ProductPlanId = ProductPlanId
WS.verifyResponseStatusCode(CreateNewProduct, 200)

/////////////////////////////////////////////////////////////////
EditProduct = WS.sendRequestAndVerify(findTestObject('api/management/products/Edit Product by product ID and plan ID', 
        [('baseUrl') : GlobalVariable.baseUrl, ('ProductID') : GlobalVariable.ProductID, ('ProductPlanId') : GlobalVariable.ProductPlanId
            , ('token') : GlobalVariable.token]))
WS.verifyResponseStatusCode(EditProduct, 200)

/////////////////////////////////////////////////////////////////
GetProductById = WS.sendRequestAndVerify(findTestObject('api/management/products/Get pProducts By Plan ID', [('baseUrl') : GlobalVariable.baseUrl, ('ProductPlanId') : GlobalVariable.ProductPlanId, ('token') : GlobalVariable.token]))
def GetProductByIdSlurper = new groovy.json.JsonSlurper()

def GetProductByIdResult = GetProductByIdSlurper.parseText(GetProductById.getResponseBodyContent())

println(GetProductByIdResult)

WS.verifyResponseStatusCode(GetProductById, 200)
//abd update 