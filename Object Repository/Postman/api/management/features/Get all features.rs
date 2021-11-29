<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get all features</name>
   <tag></tag>
   <elementGuidId>4d674acb-cdf3-4611-8902-d787ba94b773</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\r\n  \&quot;code\&quot;: 1,\r\n  \&quot;message\&quot;: \&quot;string\&quot;,\r\n  \&quot;errors\&quot;: [\r\n    {\r\n      \&quot;code\&quot;: 1,\r\n      \&quot;field\&quot;: \&quot;string\&quot;,\r\n      \&quot;message\&quot;: \&quot;string\&quot;\r\n    }\r\n  ],\r\n  \&quot;success\&quot;: true,\r\n  \&quot;data\&quot;: [\r\n    {\r\n      \&quot;id\&quot;: 1,\r\n      \&quot;name\&quot;: \&quot;string\&quot;,\r\n      \&quot;score\&quot;: 0,\r\n      \&quot;description\&quot;: \&quot;string\&quot;\r\n    }\r\n  ]\r\n}&quot;,
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
   <katalonVersion>8.2.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${baseUrl}/api/management/features</restUrl>
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
      <id>03733c42-d7bb-4a9e-a150-a3cf74a18faf</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
