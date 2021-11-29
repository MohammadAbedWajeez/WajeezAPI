<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Edit a Role Claim</name>
   <tag></tag>
   <elementGuidId>afc881c3-231e-4a71-92e7-8003d2d7450b</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n \&quot;roleId\&quot;: \&quot;2f6bef92-60f6-4b24-95db-36dc0f8420e6\&quot;,\n \&quot;roleClaims\&quot;: [\n  {\n   \&quot;id\&quot;: 200,\n   \&quot;roleId\&quot;: \&quot;2f6bef92-60f6-4b24-95db-36dc0f8420e6\&quot;,\n   \&quot;type\&quot;: \&quot;\u003cUpdate Role Claim\u003e\&quot;,\n   \&quot;value\&quot;: \&quot;\u003cstring\u003e\&quot;,\n   \&quot;description\&quot;: \&quot;\u003cstring\u003e\&quot;,\n   \&quot;selected\&quot;: false\n  }\n ]\n}&quot;,
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
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>${baseUrl}/api/management/role/permissions/update</restUrl>
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
      <id>cc90b3b5-0751-4b7b-b22b-742884efd87c</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
