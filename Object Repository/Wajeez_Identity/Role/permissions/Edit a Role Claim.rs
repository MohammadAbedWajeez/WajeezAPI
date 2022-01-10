<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Edit a Role Claim</name>
   <tag></tag>
   <elementGuidId>26d70d1d-db4d-483f-8298-aab7db51fdcc</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;roleId\&quot;: \&quot;9b38f7c1-177f-ea40-cde4-9f102d5273ad\&quot;,\n    \&quot;roleClaims\&quot;: [\n        {\n            \&quot;id\&quot;: -86255249,\n            \&quot;roleId\&quot;: \&quot;65cc1cfe-b0be-ca4d-8b18-e7ac22a1bf80\&quot;,\n            \&quot;type\&quot;: \&quot;irure nulla minim ipsum\&quot;,\n            \&quot;value\&quot;: \&quot;laboris aute esse\&quot;,\n            \&quot;description\&quot;: \&quot;officia dolor\&quot;,\n            \&quot;group\&quot;: \&quot;consequat sit commodo exercitation\&quot;,\n            \&quot;selected\&quot;: true\n        },\n        {\n            \&quot;id\&quot;: 30682235,\n            \&quot;roleId\&quot;: \&quot;urn:uuid:de127ccc-539e-f028-9f17-9e0abb59f592\&quot;,\n            \&quot;type\&quot;: \&quot;culpa occaecat enim nulla\&quot;,\n            \&quot;value\&quot;: \&quot;voluptate enim irure\&quot;,\n            \&quot;description\&quot;: \&quot;dese\&quot;,\n            \&quot;group\&quot;: \&quot;occaecat sint\&quot;,\n            \&quot;selected\&quot;: false\n        }\n    ]\n}&quot;,
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
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>${baseUrl}/api/identity/v${version}/Role/permissions/update</restUrl>
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
      <id>775f3dd6-97ec-4a5d-9a3f-d46cd6685d87</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.version</defaultValue>
      <description></description>
      <id>7b34ea53-79b8-4262-950b-2d8b6f25b6b3</id>
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
