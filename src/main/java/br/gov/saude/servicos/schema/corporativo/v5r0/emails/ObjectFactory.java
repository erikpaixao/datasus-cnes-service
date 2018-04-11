
package br.gov.saude.servicos.schema.corporativo.v5r0.emails;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.corporativo.v5r0.emails package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Emails_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/v5r0/emails", "Emails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.corporativo.v5r0.emails
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmailsType }
     * 
     */
    public EmailsType createEmailsType() {
        return new EmailsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/v5r0/emails", name = "Emails")
    public JAXBElement<EmailsType> createEmails(EmailsType value) {
        return new JAXBElement<EmailsType>(_Emails_QNAME, EmailsType.class, null, value);
    }

}
