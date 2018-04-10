
package br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.alvarasanitario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.alvarasanitario package. 
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

    private final static QName _AlvaraSanitario_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/alvarasanitario", "AlvaraSanitario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.corporativo.pessoajuridica.v1r0.alvarasanitario
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlvaraSanitarioType }
     * 
     */
    public AlvaraSanitarioType createAlvaraSanitarioType() {
        return new AlvaraSanitarioType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlvaraSanitarioType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/alvarasanitario", name = "AlvaraSanitario")
    public JAXBElement<AlvaraSanitarioType> createAlvaraSanitario(AlvaraSanitarioType value) {
        return new JAXBElement<AlvaraSanitarioType>(_AlvaraSanitario_QNAME, AlvaraSanitarioType.class, null, value);
    }

}
