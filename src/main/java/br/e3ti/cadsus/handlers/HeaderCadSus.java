/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.e3ti.cadsus.handlers;

/**
 *
 * @author erik
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author erik
 */
@Component
public class HeaderCadSus implements SOAPHandler<SOAPMessageContext> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean handleMessage(SOAPMessageContext context) {

        logger.info("Client : handleMessage()......");

        Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        //if this is a request, true for outbound messages, false for inbound
        if (isRequest) {

            try {
                SOAPMessage soapMsg = context.getMessage();
                SOAPEnvelope soapEnv = soapMsg.getSOAPPart().getEnvelope();
                SOAPHeader soapHeader = soapEnv.getHeader();

                //if no header, add one
                if (soapHeader == null) {
                    soapHeader = soapEnv.addHeader();
                }

                SOAPFactory factory = SOAPFactory.newInstance();
                String prefix = "wsse";
                String uri = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
                SOAPHeaderElement securityElem = soapHeader.addHeaderElement(new QName(uri, "Security", "wsse"));

                SOAPElement tokenElem = factory.createElement("UsernameToken", prefix, uri);
                tokenElem.addAttribute(QName.valueOf("wsu:Id"), "UsernameToken-2");
                tokenElem.addAttribute(QName.valueOf("xmlns:wsu"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");

                SOAPElement aElem = factory.createElement("Username", prefix, uri);
                aElem.addTextNode("CADSUS.CNS.PDQ.PUBLICO");

                SOAPElement bElem = factory.createElement("Password", prefix, uri);
                bElem.addTextNode("kUXNmiiii#RDdlOELdoe00966");
                bElem.addAttribute(QName.valueOf("Type"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");

                tokenElem.addChildElement(aElem);
                tokenElem.addChildElement(bElem);
                securityElem.addChildElement(tokenElem);

                soapHeader.addChildElement(securityElem);

                soapMsg.saveChanges();

                logger.info("Client : handleMessage()......");

            } catch (SOAPException e) {
                logger.error(e.getMessage());
            }

        }

        //continue other handler chain
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        logger.info("Client : handleFault()......");
        return true;
    }

    @Override
    public void close(MessageContext context) {
        logger.info("Client : close()......");
    }

    @Override
    public Set<QName> getHeaders() {
        logger.info("Client : getHeaders()......");
        return null;
    }
}

