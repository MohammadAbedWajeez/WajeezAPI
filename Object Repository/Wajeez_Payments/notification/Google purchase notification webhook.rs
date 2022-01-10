<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Google purchase notification webhook</name>
   <tag></tag>
   <elementGuidId>4f8ddd05-2e51-43ad-9a2a-a8d3039ee553</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;message\&quot;: {\n        \&quot;attributes\&quot;: {\n            \&quot;key\&quot;: \&quot;amet ut pariatur\&quot;\n        },\n        \&quot;data\&quot;: \&quot;exercitation laboris irure qui dolore\&quot;,\n        \&quot;messageId\&quot;: \&quot;Ut laboris velit culpa\&quot;\n    },\n    \&quot;subscription\&quot;: \&quot;Duis ir\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <katalonVersion>8.2.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${baseUrl}/api/payment/notification/google</restUrl>
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
      <id>80c2354c-f9b4-4374-a770-416024e04a5d</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
