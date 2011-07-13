/*
 * Copyright (C) 2011 The University of Manchester
 * 
 * See the file "LICENSE.txt" for license terms.
 */
/**
 * This package contains the exceptions/faults thrown by Taverna Server.
 * @author Donal Fellows
 */
@XmlSchema(namespace = SERVER, elementFormDefault = QUALIFIED, attributeFormDefault = QUALIFIED, xmlns = {
		@XmlNs(prefix = "xlink", namespaceURI = XLINK),
		@XmlNs(prefix = "ts", namespaceURI = SERVER),
		@XmlNs(prefix = "ts-rest", namespaceURI = SERVER_REST),
		@XmlNs(prefix = "ts-soap", namespaceURI = SERVER_SOAP),
		@XmlNs(prefix = "feed", namespaceURI = FEED),
		@XmlNs(prefix = "admin", namespaceURI = ADMIN) })
package org.taverna.server.master.exceptions;

import static javax.xml.bind.annotation.XmlNsForm.QUALIFIED;
import static org.taverna.server.master.common.Namespaces.ADMIN;
import static org.taverna.server.master.common.Namespaces.FEED;
import static org.taverna.server.master.common.Namespaces.SERVER;
import static org.taverna.server.master.common.Namespaces.SERVER_REST;
import static org.taverna.server.master.common.Namespaces.SERVER_SOAP;
import static org.taverna.server.master.common.Namespaces.XLINK;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlSchema;

