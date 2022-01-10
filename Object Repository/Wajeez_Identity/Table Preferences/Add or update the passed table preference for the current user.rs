<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Add or update the passed table preference for the current user</name>
   <tag></tag>
   <elementGuidId>9811ab70-f9c5-43f4-bf4a-a404339b75b1</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;name\&quot;: \&quot;deserunt\&quot;,\n    \&quot;tableName\&quot;: \&quot;ea ipsum amet\&quot;,\n    \&quot;id\&quot;: -62099183,\n    \&quot;flags\&quot;: -25628110,\n    \&quot;sortingOperations\&quot;: [\n        {\n            \&quot;property\&quot;: -96867614,\n            \&quot;orderByDirection\&quot;: 1\n        },\n        {\n            \&quot;property\&quot;: -40868910,\n            \&quot;orderByDirection\&quot;: 1\n        }\n    ],\n    \&quot;filteringOperations\&quot;: [\n        {\n            \&quot;property\&quot;: 25799491,\n            \&quot;cretiria\&quot;: \&quot;eiusmod\&quot;,\n            \&quot;comparisonType\&quot;: 7\n        },\n        {\n            \&quot;property\&quot;: 79546690,\n            \&quot;cretiria\&quot;: \&quot;laboris nisi\&quot;,\n            \&quot;comparisonType\&quot;: 1\n        }\n    ]\n}&quot;,
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
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${token}</value>
   </httpHeaderProperties>
   <katalonVersion>8.2.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${baseUrl}/api/identity/v${version}/TablePreferences</restUrl>
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
      <id>5ef789f4-0054-42f7-a2a8-0e68d281ed08</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.version</defaultValue>
      <description></description>
      <id>636515a6-1a0a-4228-9064-99767a79e6b0</id>
      <masked>false</masked>
      <name>version</name>
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
