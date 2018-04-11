
package br.gov.saude.servicos.schema.cadsus.v5r0.identificadorcorporativo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.cadsus.v5r0.identificadorcorporativo package. 
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

    private final static QName _IdentificadorCorporativo_QNAME = new QName("http://servicos.saude.gov.br/schema/cadsus/v5r0/identificadorcorporativo", "IdentificadorCorporativo");
    private final static QName _ListaIdentificadoresCorporativos_QNAME = new QName("http://servicos.saude.gov.br/schema/cadsus/v5r0/identificadorcorporativo", "ListaIdentificadoresCorporativos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.cadsus.v5r0.identificadorcorporativo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IdentificadorCorporativoType }
     * 
     */
    public IdentificadorCorporativoType createIdentificadorCorporativoType() {
        return new IdentificadorCorporativoType();
    }

    /**
     * Create an instance of {@link ListaIdentificadoresCorporativosType }
     * 
     */
    public ListaIdentificadoresCorporativosType createListaIdentificadoresCorporativosType() {
        return new ListaIdentificadoresCorporativosType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificadorCorporativoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cadsus/v5r0/identificadorcorporativo", name = "IdentificadorCorporativo")
    public JAXBElement<IdentificadorCorporativoType> createIdentificadorCorporativo(IdentificadorCorporativoType value) {
        return new JAXBElement<IdentificadorCorporativoType>(_IdentificadorCorporativo_QNAME, IdentificadorCorporativoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaIdentificadoresCorporativosType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cadsus/v5r0/identificadorcorporativo", name = "ListaIdentificadoresCorporativos")
    public JAXBElement<ListaIdentificadoresCorporativosType> createListaIdentificadoresCorporativos(ListaIdentificadoresCorporativosType value) {
        return new JAXBElement<ListaIdentificadoresCorporativosType>(_ListaIdentificadoresCorporativos_QNAME, ListaIdentificadoresCorporativosType.class, null, value);
    }

}
