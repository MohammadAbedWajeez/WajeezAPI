<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Edit a Role Claim</name>
   <tag></tag>
   <elementGuidId>8ccba729-943f-431a-b46c-4055dfafeb31</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n \&quot;roleId\&quot;: \&quot;b8954d2b-950b-8ed6-6ac3-2832a23ed86b\&quot;,\n \&quot;roleClaims\&quot;: [\n  {\n   \&quot;id\&quot;: -10840540,\n   \&quot;roleId\&quot;: \&quot;75766cc8-b5e1-421a-9265-0a3ad7cff162\&quot;,\n   \&quot;type\&quot;: \&quot;Permission\&quot;,\n   \&quot;value\&quot;: \&quot;17.0\&quot;,\n   \&quot;description\&quot;: \&quot;test\&quot;,\n   \&quot;selected\&quot;: true\n  },\n  {\n   \&quot;id\&quot;: 4986051,\n   \&quot;roleId\&quot;: \&quot;b714fbf6-22dd-36cf-a2f2-51271230624a\&quot;,\n   \&quot;type\&quot;: \&quot;\u003cstring\u003e\&quot;,\n   \&quot;value\&quot;: \&quot;\u003cstring\u003e\&quot;,\n   \&quot;description\&quot;: \&quot;\u003cstring\u003e\&quot;,\n   \&quot;selected\&quot;: true\n  }\n ]\n}&quot;,
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
   <katalonVersion>8.1.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>${baseUrl}/api/identity/v${version}/role/permissions/update</restUrl>
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
      <id>e039f985-74cb-4a27-86e9-6298400f7347</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.version</defaultValue>
      <description></description>
      <id>f3cb34c5-3aab-4117-9232-e6f5b1036271</id>
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
