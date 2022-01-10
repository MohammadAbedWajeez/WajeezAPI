<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Register the user using email and password</name>
   <tag></tag>
   <elementGuidId>c3016513-b93f-4aa7-baba-345b9b8c5479</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;email\&quot;: \&quot;VqDnNqrTlz@ovVxrmUvyJQegjCco.rrum\&quot;,\n    \&quot;password\&quot;: \&quot;laboredolor Excepteur ex cillum\&quot;,\n    \&quot;referralCode\&quot;: \&quot;esse cupidatat sunt\&quot;,\n    \&quot;deviceDetails\&quot;: {\n        \&quot;applicationVersion\&quot;: \&quot;voluptate incididunt in\&quot;,\n        \&quot;deviceMaker\&quot;: \&quot;do eu\&quot;,\n        \&quot;modelName\&quot;: \&quot;consequat Lorem id reprehenderit\&quot;,\n        \&quot;operatingSystem\&quot;: 3,\n        \&quot;operatingSystemVersion\&quot;: \&quot;qui pariatur incididunt\&quot;\n    }\n}&quot;,
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
   <restUrl>${baseUrl}/api/identity/v${version}/Account/register</restUrl>
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
      <id>f392a9f3-e1e6-4662-a060-6b11457bde66</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.version</defaultValue>
      <description></description>
      <id>123f339f-dce1-4fde-a6b6-a0ae9191ae6b</id>
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
