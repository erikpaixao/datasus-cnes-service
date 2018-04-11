
package br.gov.saude.servicos.wsdl.mensageria.v5r0.usuariosusauditoria;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.wsdl.mensageria.v5r0.usuariosusauditoria package. 
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

    private final static QName _UsuarioSUSAuditoria_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/v5r0/usuariosusauditoria", "UsuarioSUSAuditoria");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.wsdl.mensageria.v5r0.usuariosusauditoria
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UsuarioSUSAuditoriaType }
     * 
     */
    public UsuarioSUSAuditoriaType createUsuarioSUSAuditoriaType() {
        return new UsuarioSUSAuditoriaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioSUSAuditoriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v5r0/usuariosusauditoria", name = "UsuarioSUSAuditoria")
    public JAXBElement<UsuarioSUSAuditoriaType> createUsuarioSUSAuditoria(UsuarioSUSAuditoriaType value) {
        return new JAXBElement<UsuarioSUSAuditoriaType>(_UsuarioSUSAuditoria_QNAME, UsuarioSUSAuditoriaType.class, null, value);
    }

}
