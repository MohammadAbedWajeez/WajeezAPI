<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Assign tags to a Content Item</name>
   <tag></tag>
   <elementGuidId>7fbe9389-d4a7-46ed-8f0c-fa9b7282ee0f</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;contentItemId\&quot;: \&quot;${ContentItemID}\&quot;,\n    \&quot;tagIds\&quot;: [\n      \&quot;${TagID}\&quot;\n      ]\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept-Language</name>
      <type>Main</type>
      <value>ar</value>
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
      <value>Bearer eyJhbGciOiJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGRzaWctbW9yZSNobWFjLXNoYTI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1laWRlbnRpZmllciI6IjZhNzgxNWMxLTUxY2YtNGI2Zi1hMjdjLTFlODJjYWI3NjgyZiIsImh0dHA6Ly9zY2hlbWFzLnhtbHNvYXAub3JnL3dzLzIwMDUvMDUvaWRlbnRpdHkvY2xhaW1zL2VtYWlsYWRkcmVzcyI6IlN1cGVyQWRtaW5Ad2FqZWV6LmNvIiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6IlN1cGVyQWRtaW4iLCJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9tb2JpbGVwaG9uZSI6IiIsImh0dHA6Ly9zY2hlbWFzLm1pY3Jvc29mdC5jb20vd3MvMjAwOC8wNi9pZGVudGl0eS9jbGFpbXMvcm9sZSI6IlN1cGVyQWRtaW4iLCJQZXJtaXNzaW9uIjpbIjEuNCIsIjI1LjAiLCIyNC4zIiwiMjQuMiIsIjI0LjEiLCIyNC4wIiwiMjMuMiIsIjIzLjEiLCIyMy4wIiwiMjIuMSIsIjIyLjAiLCIyMS4xIiwiMjUuMSIsIjIxLjAiLCIyMC4zIiwiMjAuMiIsIjIwLjEiLCIyMC4wIiwiMTkuNCIsIjE5LjMiLCIxOS4yIiwiMTkuMSIsIjE5LjAiLCIxOC4xMSIsIjE4LjEwIiwiMjAuNCIsIjI1LjIiLCIyNS4zIiwiMjUuNCIsIjMwLjEiLCIzMC4wIiwiMjkuNSIsIjI5LjQiLCIyOS4zIiwiMjkuMiIsIjI5LjEiLCIyOS4wIiwiMjguMSIsIjI4LjAiLCIyNy4xNSIsIjI3LjE0IiwiMjcuMTMiLCIyNy4xMiIsIjI3LjExIiwiMjcuMTAiLCIyNy45IiwiMjcuOCIsIjI3LjYiLCIyNy41IiwiMjcuNCIsIjI3LjMiLCIyNy4yIiwiMjcuMSIsIjI3LjAiLCIxOC45IiwiMTguOCIsIjE4LjciLCIxOC42IiwiNS4xIiwiNS4wIiwiNC40IiwiNC4zIiwiNC4yIiwiNC4xIiwiNC4wIiwiMy4zIiwiMy4yIiwiMy4xIiwiMy4wIiwiMi40IiwiMi4zIiwiMi4yIiwiMi4xIiwiMi4wIiwiMC4wIiwiMC4xIiwiMC4yIiwiMC4zIiwiMC40IiwiMS4wIiwiMS4xIiwiMS4yIiwiMS4zIiwiNS4yIiwiMzAuMiIsIjUuMyIsIjYuMSIsIjE4LjQiLCIxOC4zIiwiMTguMiIsIjE4LjEiLCIxOC4wIiwiMTcuNiIsIjE3LjUiLCIxNy40IiwiMTcuMyIsIjE3LjIiLCIxNy4xIiwiMTcuMCIsIjguMyIsIjguMiIsIjguMSIsIjguMCIsIjcuMiIsIjcuMSIsIjcuMCIsIjYuNyIsIjYuNiIsIjYuNSIsIjYuNCIsIjYuMyIsIjYuMiIsIjYuMCIsIjMwLjMiXSwiZXhwIjoxNjQxMzgyMjg1fQ.yfJdwiMn18YXjJZ4y_QqDBXYqDtPmK0_eXGlbu1tJQw</value>
   </httpHeaderProperties>
   <katalonVersion>8.2.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${baseUrl}/api/content/v1/Tags/assign</restUrl>
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
      <id>7dfb51b5-789a-46ca-8915-39825020d8fe</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.ContentItemID</defaultValue>
      <description></description>
      <id>6769f6b6-8877-4fb3-9ab0-3afaebbdcaa4</id>
      <masked>false</masked>
      <name>ContentItemID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.TagID</defaultValue>
      <description></description>
      <id>2aa3dc5f-804e-470e-b2e3-17d3819c6827</id>
      <masked>false</masked>
      <name>TagID</name>
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
