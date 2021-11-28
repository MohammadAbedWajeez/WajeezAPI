<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Block for the requested user</name>
   <tag></tag>
   <elementGuidId>93e6f5ef-f297-435c-aa32-249f805f2dca</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\r\n  \&quot;code\&quot;: 0,\r\n  \&quot;message\&quot;: \&quot;string\&quot;,\r\n  \&quot;errors\&quot;: [\r\n    {\r\n      \&quot;code\&quot;: 0,\r\n      \&quot;field\&quot;: \&quot;string\&quot;,\r\n      \&quot;message\&quot;: \&quot;string\&quot;\r\n    }\r\n  ],\r\n  \&quot;success\&quot;: true\r\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
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
   <katalonVersion>8.1.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${baseUrl}/api/management/account/block?userId=${UserRegisteredID}</restUrl>
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
      <id>676f5b08-59b9-4b32-aca5-99a59e7d304c</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.UserRegisteredID</defaultValue>
      <description></description>
      <id>cf9ef6bd-7192-4186-b873-cbcf5dd218fa</id>
      <masked>false</masked>
      <name>UserRegisteredID</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
