<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get users by using the provided sorting, filtration and pagination options</name>
   <tag></tag>
   <elementGuidId>d02a459f-1a2e-4c90-8847-48db9e79bd38</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n \&quot;pageNumber\&quot;: 83813739,\n \&quot;pageSize\&quot;: 7493415,\n \&quot;flags\&quot;: 8,\n \&quot;sortingOperations\&quot;: [\n  {\n   \&quot;property\&quot;: 2,\n   \&quot;orderByDirection\&quot;: 1\n  },\n  {\n   \&quot;property\&quot;: 2,\n   \&quot;orderByDirection\&quot;: 1\n  }\n ],\n \&quot;filteringOperations\&quot;: [\n  {\n   \&quot;property\&quot;: 2,\n   \&quot;cretiria\&quot;: \&quot;\u003cstring\u003e\&quot;,\n   \&quot;comparisonType\&quot;: 5\n  },\n  {\n   \&quot;property\&quot;: 32,\n   \&quot;cretiria\&quot;: \&quot;\u003cstring\u003e\&quot;,\n   \&quot;comparisonType\&quot;: 6\n  }\n ],\n \&quot;tablePreferenceId\&quot;: 98470116\n}&quot;,
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
   <restUrl>${baseUrl}/api/management/account/get</restUrl>
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
      <id>6024d4a8-9328-47cf-8e25-7ef6d4bd943b</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>