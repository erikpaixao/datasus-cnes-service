
package br.gov.saude.servicos.schema.cadsus.v1r0.protocoloprecadastro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.cadsus.v1r0.protocoloprecadastro package. 
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

    private final static QName _ProtocoloPreCadastro_QNAME = new QName("http://servicos.saude.gov.br/schema/cadsus/v1r0/protocoloprecadastro", "ProtocoloPreCadastro");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.cadsus.v1r0.protocoloprecadastro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProtocoloPreCadastroType }
     * 
     */
    public ProtocoloPreCadastroType createProtocoloPreCadastroType() {
        return new ProtocoloPreCadastroType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtocoloPreCadastroType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cadsus/v1r0/protocoloprecadastro", name = "ProtocoloPreCadastro")
    public JAXBElement<ProtocoloPreCadastroType> createProtocoloPreCadastro(ProtocoloPreCadastroType value) {
        return new JAXBElement<ProtocoloPreCadastroType>(_ProtocoloPreCadastro_QNAME, ProtocoloPreCadastroType.class, null, value);
    }

}
