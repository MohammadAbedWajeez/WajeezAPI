<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create new country</name>
   <tag></tag>
   <elementGuidId>1427e190-a314-4ef2-a736-a4896bb5860d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;name\&quot;: \&quot;${CountryName}\&quot;,\n  \&quot;twoDigitCode\&quot;: \&quot;${randomCountryCode2}\&quot;,\n  \&quot;threeDigitCode\&quot;: \&quot;${randomCountryCode3}\&quot;,\n  \&quot;currencyCode\&quot;: \&quot;${randomCurrencyCode}\&quot;,\n  \&quot;region\&quot;: \&quot;${CountryRegion}\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept-Language</name>
      <type>Main</type>
      <value>en</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${token}</value>
   </httpHeaderProperties>
   <katalonVersion>8.1.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${baseUrl}/api/management/countries</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.baseUrl</defaultValue>
      <description></description>
      <id>5e2db741-587d-4670-8a74-ba75a68f5413</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.CountryName</defaultValue>
      <description></description>
      <id>5126ca8e-cdcc-45ef-9086-4628a3a8cf49</id>
      <masked>false</masked>
      <name>CountryName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.CountryRegion</defaultValue>
      <description></description>
      <id>7be6b6b6-8ec4-42d0-b182-02699d604e04</id>
      <masked>false</masked>
      <name>CountryRegion</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.randomCurrencyCode</defaultValue>
      <description></description>
      <id>5547b938-15b7-4997-87bd-d97bc0fc41d7</id>
      <masked>false</masked>
      <name>randomCurrencyCode</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.randomCountryCode2</defaultValue>
      <description></description>
      <id>0f1df698-a0f1-4aa7-b1a0-68b9a2d347cf</id>
      <masked>false</masked>
      <name>randomCountryCode2</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.randomCountryCode3</defaultValue>
      <description></description>
      <id>cddc8cd5-fdca-40e7-b2a9-e02ba1db6aee</id>
      <masked>false</masked>
      <name>randomCountryCode3</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
