<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Set user interests six</name>
   <tag></tag>
   <elementGuidId>25c17cd3-5b4a-4846-b958-47ab78d6fe9b</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;contentItemIds\&quot;: [\n        \&quot;${InterestReligion}\&quot;,\n        \&quot;${InterestFamily}\&quot;,\n      \&quot;${Interesthistory}\&quot;,\n      \&quot;${InterestCV}\&quot;,\n      \&quot;${InterestMoneyEco}\&quot;,\n      \&quot;${InterestSelfDev}\&quot;\n    ]\n}&quot;,
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
      <value>Bearer ${UserToken}</value>
   </httpHeaderProperties>
   <katalonVersion>8.2.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${baseUrl}/api/content/v${version}/Interests/set</restUrl>
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
      <id>64388720-57fe-415f-a38c-530d6ae9a251</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.version</defaultValue>
      <description></description>
      <id>44d0e314-fe30-4648-9a83-fae9594ded27</id>
      <masked>false</masked>
      <name>version</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.InterestSelfDev</defaultValue>
      <description></description>
      <id>373900f6-7f26-4332-a02e-2a537ca41fd1</id>
      <masked>false</masked>
      <name>InterestSelfDev</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.InterestMoneyEco</defaultValue>
      <description></description>
      <id>d46da584-171b-4741-a2b3-4ed6a9e3908f</id>
      <masked>false</masked>
      <name>InterestMoneyEco</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.InterestCV</defaultValue>
      <description></description>
      <id>3eb6ba16-5d07-454b-bcc0-2be610dadba6</id>
      <masked>false</masked>
      <name>InterestCV</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Interesthistory</defaultValue>
      <description></description>
      <id>9264c6bf-efb6-4c11-8996-59f21ccb0b89</id>
      <masked>false</masked>
      <name>Interesthistory</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.InterestFamily</defaultValue>
      <description></description>
      <id>441dcbbb-f138-4bf6-b3f0-c26d37d78f86</id>
      <masked>false</masked>
      <name>InterestFamily</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.InterestReligion</defaultValue>
      <description></description>
      <id>3fc68872-b748-460d-acf6-0c12e1cae231</id>
      <masked>false</masked>
      <name>InterestReligion</name>
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
