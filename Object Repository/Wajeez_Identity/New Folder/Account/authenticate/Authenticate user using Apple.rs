<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Authenticate user using Apple</name>
   <tag></tag>
   <elementGuidId>b6598c58-7ec1-4542-b1e7-8ed4f2f702d4</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;token\&quot;: \&quot;laborum fugiat\&quot;,\n    \&quot;uniqueUserIdentifier\&quot;: \&quot;voluptate ipsum\&quot;,\n    \&quot;referralCode\&quot;: \&quot;est adip\&quot;,\n    \&quot;deviceDetails\&quot;: {\n        \&quot;applicationVersion\&quot;: \&quot;ex Lorem\&quot;,\n        \&quot;deviceMaker\&quot;: \&quot;reprehenderit occaecat\&quot;,\n        \&quot;modelName\&quot;: \&quot;Excepteur\&quot;,\n        \&quot;operatingSystem\&quot;: 0,\n        \&quot;operatingSystemVersion\&quot;: \&quot;nostrud non magna\&quot;\n    }\n}&quot;,
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
   <restUrl>${baseUrl}/api/identity/v${version}/Account/authenticate/apple</restUrl>
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
      <id>8c861080-6b60-4ca8-bc7d-a66553e5d5a3</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.version</defaultValue>
      <description></description>
      <id>b40b4e62-2ae3-4ae6-9569-06d42ee68bef</id>
      <masked>false</masked>
      <name>version</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>