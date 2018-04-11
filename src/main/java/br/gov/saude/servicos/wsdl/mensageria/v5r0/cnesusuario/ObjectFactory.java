
package br.gov.saude.servicos.wsdl.mensageria.v5r0.cnesusuario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.wsdl.mensageria.v5r0.cnesusuario package. 
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

    private final static QName _CNESUsuario_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/v5r0/cnesusuario", "CNESUsuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.wsdl.mensageria.v5r0.cnesusuario
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CNESUsuarioType }
     * 
     */
    public CNESUsuarioType createCNESUsuarioType() {
        return new CNESUsuarioType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CNESUsuarioType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v5r0/cnesusuario", name = "CNESUsuario")
    public JAXBElement<CNESUsuarioType> createCNESUsuario(CNESUsuarioType value) {
        return new JAXBElement<CNESUsuarioType>(_CNESUsuario_QNAME, CNESUsuarioType.class, null, value);
    }

}
