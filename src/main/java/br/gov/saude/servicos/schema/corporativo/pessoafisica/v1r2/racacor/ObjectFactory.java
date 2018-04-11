
package br.gov.saude.servicos.schema.corporativo.pessoafisica.v1r2.racacor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.corporativo.pessoafisica.v1r2.racacor package. 
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

    private final static QName _RacaCor_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r2/racacor", "RacaCor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.corporativo.pessoafisica.v1r2.racacor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RacaCorType }
     * 
     */
    public RacaCorType createRacaCorType() {
        return new RacaCorType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RacaCorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r2/racacor", name = "RacaCor")
    public JAXBElement<RacaCorType> createRacaCor(RacaCorType value) {
        return new JAXBElement<RacaCorType>(_RacaCor_QNAME, RacaCorType.class, null, value);
    }

}
