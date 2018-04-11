
package br.gov.saude.servicos.schema.cadsus.v5r0.usuariosus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.cadsus.v5r0.usuariosus package. 
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

    private final static QName _UsuarioSUS_QNAME = new QName("http://servicos.saude.gov.br/schema/cadsus/v5r0/usuariosus", "UsuarioSUS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.cadsus.v5r0.usuariosus
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UsuarioSUSType }
     * 
     */
    public UsuarioSUSType createUsuarioSUSType() {
        return new UsuarioSUSType();
    }

    /**
     * Create an instance of {@link UsuarioSUSType.Cartoes }
     * 
     */
    public UsuarioSUSType.Cartoes createUsuarioSUSTypeCartoes() {
        return new UsuarioSUSType.Cartoes();
    }

    /**
     * Create an instance of {@link UsuarioSUSType.Enderecos }
     * 
     */
    public UsuarioSUSType.Enderecos createUsuarioSUSTypeEnderecos() {
        return new UsuarioSUSType.Enderecos();
    }

    /**
     * Create an instance of {@link UsuarioSUSType.Telefones }
     * 
     */
    public UsuarioSUSType.Telefones createUsuarioSUSTypeTelefones() {
        return new UsuarioSUSType.Telefones();
    }

    /**
     * Create an instance of {@link UsuarioSUSType.Fotografias }
     * 
     */
    public UsuarioSUSType.Fotografias createUsuarioSUSTypeFotografias() {
        return new UsuarioSUSType.Fotografias();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioSUSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cadsus/v5r0/usuariosus", name = "UsuarioSUS")
    public JAXBElement<UsuarioSUSType> createUsuarioSUS(UsuarioSUSType value) {
        return new JAXBElement<UsuarioSUSType>(_UsuarioSUS_QNAME, UsuarioSUSType.class, null, value);
    }

}
