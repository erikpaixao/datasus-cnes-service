
package br.gov.saude.servicos.schema.cadsus.v5r0.grauqualidade;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.cadsus.v5r0.grauqualidade package. 
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

    private final static QName _GrauQualidade_QNAME = new QName("http://servicos.saude.gov.br/schema/cadsus/v5r0/grauqualidade", "GrauQualidade");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.cadsus.v5r0.grauqualidade
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GrauQualidadeType }
     * 
     */
    public GrauQualidadeType createGrauQualidadeType() {
        return new GrauQualidadeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrauQualidadeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cadsus/v5r0/grauqualidade", name = "GrauQualidade")
    public JAXBElement<GrauQualidadeType> createGrauQualidade(GrauQualidadeType value) {
        return new JAXBElement<GrauQualidadeType>(_GrauQualidade_QNAME, GrauQualidadeType.class, null, value);
    }

}
