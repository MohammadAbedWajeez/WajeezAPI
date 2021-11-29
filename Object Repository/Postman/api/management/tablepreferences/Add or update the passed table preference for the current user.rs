<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Add or update the passed table preference for the current user</name>
   <tag></tag>
   <elementGuidId>65b69f16-e633-4973-8e0c-b7c69a078ef7</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n \&quot;name\&quot;: \&quot;\u003cstring\u003e\&quot;,\n \&quot;tableName\&quot;: \&quot;\u003cstring\u003e\&quot;,\n \&quot;id\&quot;: 1,\n \&quot;flags\&quot;: 10,\n \&quot;sortingOperations\&quot;: [\n  {\n   \&quot;property\&quot;: -64162398,\n   \&quot;orderByDirection\&quot;: 0\n  },\n  {\n   \&quot;property\&quot;: 94205240,\n   \&quot;orderByDirection\&quot;: 0\n  }\n ],\n \&quot;filteringOperations\&quot;: [\n  {\n   \&quot;property\&quot;: 47660172,\n   \&quot;cretiria\&quot;: \&quot;\u003cstring\u003e\&quot;,\n   \&quot;comparisonType\&quot;: 6\n  },\n  {\n   \&quot;property\&quot;: 37256353,\n   \&quot;cretiria\&quot;: \&quot;\u003cstring\u003e\&quot;,\n   \&quot;comparisonType\&quot;: 2\n  }\n ]\n}&quot;,
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
   <katalonVersion>8.2.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${baseUrl}/api/management/tablepreferences</restUrl>
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
      <id>b317337d-1f53-4e76-9b29-dd711ba58fbc</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
