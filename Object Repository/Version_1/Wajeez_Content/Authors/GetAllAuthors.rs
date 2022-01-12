<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GetAllAuthors</name>
   <tag></tag>
   <elementGuidId>1d32e7a7-9c6d-4ec8-8a18-d9dae9a18133</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
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
      <value>Bearer eyJhbGciOiJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGRzaWctbW9yZSNobWFjLXNoYTI1NiIsInR5cCI6IkpXVCJ9.eyJJZCI6IjA5Njg2ZDliLWZjNTAtNGE3Yy04YjE3LWNhOTFmZTY2NWZkMCIsIlJvbGUiOiJTdXBlckFkbWluIiwiUGVybWlzc2lvbiI6WyIwLjAiLCIwLjEiLCIwLjIiLCIwLjMiLCIwLjQiLCIxLjAiLCIxLjEiLCIxLjIiLCIxLjMiLCIxLjQiLCIyLjAiLCIyLjEiLCIyLjIiLCIyLjMiLCIyLjQiLCIzLjAiLCIzLjEiLCIzLjIiLCIzLjMiLCI0LjAiLCI0LjEiLCI0LjIiLCI0LjMiLCI0LjQiLCI1LjAiLCI1LjEiLCI1LjIiLCI1LjMiLCI2LjAiLCI2LjEiLCI2LjIiLCI2LjMiLCI2LjQiLCI2LjUiLCI2LjYiLCI2LjciLCI3LjAiLCI3LjEiLCI3LjIiLCI4LjAiLCI4LjEiLCI4LjIiLCI4LjMiLCIxMC4wIiwiMTAuMSIsIjEwLjIiLCIxMC4zIiwiMTAuNCIsIjE3LjAiLCIxNy4xIiwiMTcuMiIsIjE3LjMiLCIxNy40IiwiMTcuNSIsIjE3LjYiLCIxOC4wIiwiMTguMSIsIjE4LjIiLCIxOC4zIiwiMTguNCIsIjE4LjYiLCIxOC43IiwiMTguOCIsIjE4LjkiLCIxOC4xMCIsIjE4LjExIiwiMTguMTIiLCIxOC4xMyIsIjE5LjAiLCIxOS4xIiwiMTkuMiIsIjE5LjMiLCIxOS40IiwiMjAuMCIsIjIwLjEiLCIyMC4yIiwiMjAuMyIsIjIwLjQiLCIyMS4wIiwiMjEuMSIsIjIyLjAiLCIyMi4xIiwiMjMuMCIsIjIzLjEiLCIyMy4yIiwiMjQuMCIsIjI0LjEiLCIyNC4yIiwiMjQuMyIsIjI1LjAiLCIyNS4xIiwiMjUuMiIsIjI1LjMiLCIyNS40IiwiMjcuMCIsIjI3LjEiLCIyNy4yIiwiMjcuMyIsIjI3LjQiLCIyNy41IiwiMjcuNiIsIjI3LjgiLCIyNy45IiwiMjcuMTAiLCIyNy4xMSIsIjI3LjEyIiwiMjcuMTMiLCIyNy4xNCIsIjI3LjE1IiwiMjguMCIsIjI4LjEiLCIyOS4wIiwiMjkuMSIsIjI5LjIiLCIyOS4zIiwiMjkuNCIsIjI5LjUiLCIzMC4wIiwiMzAuMSIsIjMwLjIiLCIzMC4zIiwiMzEuMCIsIjMxLjEiLCIzMS4yIiwiMzEuMyIsIjMxLjQiLCIzMS41IiwiMzIuMCIsIjMzLjAiLCIzMy4xIiwiMzMuMiIsIjMzLjMiLCIzNC4wIiwiMzUuMCIsIjkiLCIzMi4xIiwiMzYuMCIsIjM2LjEiLCIzNi4yIiwiMzYuMyIsIjM2LjQiLCIzNi41Il0sImV4cCI6MTY0MDYwOTI5Nn0.LH6YS8JOObXSDN32KMY1K9uuZ4G_umwM_kNwnybyihE</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>text/plain</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept-Language</name>
      <type>Main</type>
      <value>en</value>
   </httpHeaderProperties>
   <katalonVersion>8.2.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${NewBase}com/api/content/v${version}/Authors?PageNumber=1&amp;PageSize=1</restUrl>
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
      <id>9bf2fb07-873a-4425-8686-3b20befffe72</id>
      <masked>false</masked>
      <name>NewBase</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.version</defaultValue>
      <description></description>
      <id>2d7c7b76-d521-48ae-8259-fedc90fe510f</id>
      <masked>false</masked>
      <name>version</name>
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
