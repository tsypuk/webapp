curl --header "content-type: application/soap+xml" -d @request.xml http://localhost:8080/services/Soap

curl --header "content-type: application/soap+xml" -d @request_add.xml http://localhost:8080/services/Soap

http://localhost:8080/services/Soap/support.wsdl
Example of response:
Web Services Description Language


This XML file does not appear to have any style information associated with it. The document tree is shown below.
<wsdl:definitions xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:sch="http://example.com/xmlns/support" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tns="http://example.com/xmlns/support" targetNamespace="http://example.com/xmlns/support">
<wsdl:types>
<xs:schema xmlns:support="http://example.com/xmlns/support" xmlns:xs="http://www.w3.org/2001/XMLSchema" attributeFormDefault="unqualified" elementFormDefault="qualified" targetNamespace="http://example.com/xmlns/support">
<xs:element name="ticketsRequest" type="support:ticketsRequestType"/>
<xs:element name="ticketRequest" type="support:selectTicketType"/>
<xs:element name="createTicket" type="support:createTicketType"/>
<xs:element name="deleteTicket" type="support:selectTicketType"/>
<xs:element name="ticket" type="support:ticketType"/>
<xs:element name="tickets" type="support:ticketsType"/>
<xs:complexType name="ticketType">
<xs:sequence>
<xs:element minOccurs="0" name="id" type="xs:long"/>
<xs:element minOccurs="0" name="customerName" type="xs:string"/>
<xs:element minOccurs="0" name="dateCreated" type="xs:dateTime"/>
<xs:element name="subject" type="xs:string"/>
<xs:element name="body" type="xs:string"/>
<xs:element maxOccurs="unbounded" minOccurs="0" name="attachment" type="support:attachmentType"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ticketsRequestType">
<xs:sequence/>
</xs:complexType>
<xs:complexType name="selectTicketType">
<xs:sequence>
<xs:element name="id" type="xs:long"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="createTicketType">
<xs:sequence>
<xs:element name="ticket" type="support:ticketType"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="ticketsType">
<xs:sequence>
<xs:element maxOccurs="unbounded" minOccurs="0" name="ticket" type="support:ticketType"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="attachmentType">
<xs:sequence>
<xs:element name="name" type="xs:string"/>
<xs:element name="mimeContentType" type="xs:string"/>
<xs:element name="contents" type="xs:base64Binary"/>
</xs:sequence>
</xs:complexType>
</xs:schema>
</wsdl:types>
<wsdl:message name="ticketRequest">
<wsdl:part element="tns:ticketRequest" name="ticketRequest"></wsdl:part>
</wsdl:message>
<wsdl:message name="ticketsRequest">
<wsdl:part element="tns:ticketsRequest" name="ticketsRequest"></wsdl:part>
</wsdl:message>
<wsdl:portType name="Support">
<wsdl:operation name="ticket">
<wsdl:input message="tns:ticketRequest" name="ticketRequest"></wsdl:input>
</wsdl:operation>
<wsdl:operation name="tickets">
<wsdl:input message="tns:ticketsRequest" name="ticketsRequest"></wsdl:input>
</wsdl:operation>
</wsdl:portType>
<wsdl:binding name="SupportSoap12" type="tns:Support">
<soap12:binding style="document" transport="http://schemas.xmlsoap.org/soap/http"/>
<wsdl:operation name="ticket">
<soap12:operation soapAction=""/>
<wsdl:input name="ticketRequest">
<soap12:body use="literal"/>
</wsdl:input>
</wsdl:operation>
<wsdl:operation name="tickets">
<soap12:operation soapAction=""/>
<wsdl:input name="ticketsRequest">
<soap12:body use="literal"/>
</wsdl:input>
</wsdl:operation>
</wsdl:binding>
<wsdl:service name="SupportService">
<wsdl:port binding="tns:SupportSoap12" name="SupportSoap12">
<soap12:address location="http://localhost:8080/services/Soap/"/>
</wsdl:port>
</wsdl:service>
</wsdl:definitions>