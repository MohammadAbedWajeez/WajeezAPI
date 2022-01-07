<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create new tag</name>
   <tag></tag>
   <elementGuidId>06fdf433-2c99-4cb9-b152-64b4ea1dc595</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;name\&quot;: \&quot;${TagName}\&quot;\n}&quot;,
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
      <value>Bearer eyJhbGciOiJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGRzaWctbW9yZSNobWFjLXNoYTI1NiIsInR5cCI6IkpXVCJ9.eyJJZCI6IjA5Njg2ZDliLWZjNTAtNGE3Yy04YjE3LWNhOTFmZTY2NWZkMCIsIlJvbGUiOiJTdXBlckFkbWluIiwiUGVybWlzc2lvbiI6WyIwLjAiLCIwLjEiLCIwLjIiLCIwLjMiLCIwLjQiLCIxLjAiLCIxLjEiLCIxLjIiLCIxLjMiLCIxLjQiLCIyLjAiLCIyLjEiLCIyLjIiLCIyLjMiLCIyLjQiLCIzLjAiLCIzLjEiLCIzLjIiLCIzLjMiLCI0LjAiLCI0LjEiLCI0LjIiLCI0LjMiLCI0LjQiLCI1LjAiLCI1LjEiLCI1LjIiLCI1LjMiLCI2LjAiLCI2LjEiLCI2LjIiLCI2LjMiLCI2LjQiLCI2LjUiLCI2LjYiLCI2LjciLCI3LjAiLCI3LjEiLCI3LjIiLCI4LjAiLCI4LjEiLCI4LjIiLCI4LjMiLCIxMC4wIiwiMTAuMSIsIjEwLjIiLCIxMC4zIiwiMTAuNCIsIjE3LjAiLCIxNy4xIiwiMTcuMiIsIjE3LjMiLCIxNy40IiwiMTcuNSIsIjE3LjYiLCIxOC4wIiwiMTguMSIsIjE4LjIiLCIxOC4zIiwiMTguNCIsIjE4LjYiLCIxOC43IiwiMTguOCIsIjE4LjkiLCIxOC4xMCIsIjE4LjExIiwiMTguMTIiLCIxOC4xMyIsIjE5LjAiLCIxOS4xIiwiMTkuMiIsIjE5LjMiLCIxOS40IiwiMjAuMCIsIjIwLjEiLCIyMC4yIiwiMjAuMyIsIjIwLjQiLCIyMS4wIiwiMjEuMSIsIjIyLjAiLCIyMi4xIiwiMjMuMCIsIjIzLjEiLCIyMy4yIiwiMjQuMCIsIjI0LjEiLCIyNC4yIiwiMjQuMyIsIjI1LjAiLCIyNS4xIiwiMjUuMiIsIjI1LjMiLCIyNS40IiwiMjcuMCIsIjI3LjEiLCIyNy4yIiwiMjcuMyIsIjI3LjQiLCIyNy41IiwiMjcuNiIsIjI3LjgiLCIyNy45IiwiMjcuMTAiLCIyNy4xMSIsIjI3LjEyIiwiMjcuMTMiLCIyNy4xNCIsIjI3LjE1IiwiMjguMCIsIjI4LjEiLCIyOS4wIiwiMjkuMSIsIjI5LjIiLCIyOS4zIiwiMjkuNCIsIjI5LjUiLCIzMC4wIiwiMzAuMSIsIjMwLjIiLCIzMC4zIiwiMzEuMCIsIjMxLjEiLCIzMS4yIiwiMzEuMyIsIjMxLjQiLCIzMS41IiwiMzIuMCIsIjMzLjAiLCIzMy4xIiwiNDEuMyIsIjMzLjIiLCIzMy4zIiwiMzQuMCIsIjM1LjAiLCI5IiwiMzIuMSIsIjM2LjAiLCIzNi4xIiwiMzYuMiIsIjM2LjMiLCIzNi40IiwiMzYuNSIsIjIwLjUiLCIyMC42IiwiMjAuNyIsIjMyLjIiLCIzNi42IiwiMzYuNyIsIjM3LjAiLCIzNy4xIiwiMzcuMiIsIjM4LjAiLCIzOC4xIiwiMzguMiIsIjM4LjMiLCIzOS4wIiwiMzkuMSIsIjM5LjIiLCI0MC4wIiwiNDAuMSIsIjQwLjIiLCI0MC4zIiwiNDAuNCIsIjQxLjAiLCI0MS4xIiwiNDEuMiIsIjQxLjQiLCI0MS41IiwiNDEuNiIsIjE4LjE0IiwiNDIuMCIsIjQyLjEiLCI0Mi4yIiwiNDIuMyIsIjQyLjQiLCI0Mi41IiwiNDIuNiIsIjQyLjciXSwiZXhwIjoxNjQxMzM2NDUwfQ.j5SDothgbJn9UlbDC0-zEQjFX96ZQ1lAKSkhonROUqE</value>
   </httpHeaderProperties>
   <katalonVersion>8.2.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${NewBase}/api/content/${Version}/Tags</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.NewBase</defaultValue>
      <description></description>
      <id>ca185d62-8a1f-472f-8ef0-b3aa5ad2f3b0</id>
      <masked>false</masked>
      <name>NewBase</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.TagName</defaultValue>
      <description></description>
      <id>2fc2a751-5caa-46ed-990a-5854cdc4660c</id>
      <masked>false</masked>
      <name>TagName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Version</defaultValue>
      <description></description>
      <id>00a426ad-cbfe-45cd-925b-28bd9b599b4c</id>
      <masked>false</masked>
      <name>Version</name>
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
