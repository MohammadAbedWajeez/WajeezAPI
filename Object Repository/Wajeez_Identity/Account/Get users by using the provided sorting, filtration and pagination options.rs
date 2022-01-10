<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get users by using the provided sorting, filtration and pagination options</name>
   <tag></tag>
   <elementGuidId>ed9a50e7-e5d4-4227-93fb-0c14a12dfcb9</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;pageNumber\&quot;: -88819206,\n    \&quot;pageSize\&quot;: 35828633,\n    \&quot;flags\&quot;: 4,\n    \&quot;sortingOperations\&quot;: [\n        {\n            \&quot;property\&quot;: 16,\n            \&quot;orderByDirection\&quot;: 0\n        },\n        {\n            \&quot;property\&quot;: 256,\n            \&quot;orderByDirection\&quot;: 0\n        }\n    ],\n    \&quot;filteringOperations\&quot;: [\n        {\n            \&quot;property\&quot;: 4,\n            \&quot;cretiria\&quot;: \&quot;ali\&quot;,\n            \&quot;comparisonType\&quot;: 2\n        },\n        {\n            \&quot;property\&quot;: 256,\n            \&quot;cretiria\&quot;: \&quot;voluptate ex sed sit\&quot;,\n            \&quot;comparisonType\&quot;: 6\n        }\n    ],\n    \&quot;tablePreferenceId\&quot;: 78094053\n}&quot;,
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
   <restUrl>${baseUrl}/api/identity/v${version}/Account/get</restUrl>
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
      <id>56dbe02d-fdbf-412d-965b-f28f61b1b187</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.version</defaultValue>
      <description></description>
      <id>c1040383-d5a1-4dc3-a8d5-5783d183577f</id>
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
