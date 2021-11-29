<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Authenticate user using Google</name>
   <tag></tag>
   <elementGuidId>aa8bc4b4-d57c-485f-a29e-86042b7b1ea9</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;token\&quot;: \&quot;eyJhbGciOiJSUzI1NiIsImtpZCI6Ijg1ODI4YzU5Mjg0YTY5YjU0YjI3NDgzZTQ4N2MzYmQ0NmNkMmEyYjMiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJhY2NvdW50cy5nb29nbGUuY29tIiwiYXpwIjoiMjgwNTU5MDYxODgtbXAwdm51YzFydnBkYWhoNGVvbjAxaTl0b3A5NTkxMXQuYXBwcy5nb29nbGV1c2VyY29udGVudC5jb20iLCJhdWQiOiIyODA1NTkwNjE4OC1tcDB2bnVjMXJ2cGRhaGg0ZW9uMDFpOXRvcDk1OTExdC5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsInN1YiI6IjExNjUxODU3ODIzMzM5NzQ2MDk2NCIsImhkIjoid2FqZWV6LmNvIiwiZW1haWwiOiJtb2hhbW1hZC5hbGhhakB3YWplZXouY28iLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwiYXRfaGFzaCI6InEzS1RfRUJoNkZ1TlZyVjdfbjQ1WVEiLCJuYW1lIjoiTW9oYW1tYWQgQWwtSGFqIEFiZWQiLCJwaWN0dXJlIjoiaHR0cHM6Ly9saDMuZ29vZ2xldXNlcmNvbnRlbnQuY29tL2EvQUFUWEFKemkxZmRIdGp5YUo3aG8yWXEyX1dkZVhCejdQMVFDRXJPcW53S0w9czk2LWMiLCJnaXZlbl9uYW1lIjoiTW9oYW1tYWQiLCJmYW1pbHlfbmFtZSI6IkFsLUhhaiBBYmVkIiwibG9jYWxlIjoiZW4iLCJpYXQiOjE2MzYwMTgzODksImV4cCI6MTYzNjAyMTk4OSwianRpIjoiMzFiNGVmMTBhNzc3YWYyNDJlOTU5MDgwMTQ3YTVjOTBhNGViZGJhZiJ9.pz-vQ0e6y15ep8xcKRojPYHtKeAb87uj3xuQEouTCXf6FuX2iiTzQ4zjPbi_SMcYeyVdbg-SL3RKq1ul2nWdJJeQgbw1Lih2ospyd2lAIq3IB2E4QTwBu4tIAzhafqpgrtvSzIHz7g2UGRd3jRMFS7Xrs2ZnoQPkbXULNGIar8IiPibq-rcMLDnsF0TRa1uBZhoVWGTS167H3cZuhtKwJRpU8x6xjwOLsRXeTwiO4W3cPC2B_FJ69Htxl7iCmy5yMJyjuQ-RfwGjEGb47mpVYO4rs-xEmhMO61iQGkcDSvnV5znTLJlyj-cvWPdhN0S9n7Rs2Q7GAMIQItMaHdzujA\&quot;\n}&quot;,
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
   <restUrl>${baseUrl}/api/management/account/authenticate/google</restUrl>
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
      <id>484b9568-8c55-49cc-a6d1-a12e9de4c13c</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
