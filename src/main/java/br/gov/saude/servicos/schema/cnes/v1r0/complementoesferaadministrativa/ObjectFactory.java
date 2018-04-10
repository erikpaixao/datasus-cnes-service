
package br.gov.saude.servicos.schema.cnes.v1r0.complementoesferaadministrativa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.cnes.v1r0.complementoesferaadministrativa package. 
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

    private final static QName _ComplementoEsferaAdministrativa_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/complementoesferaadministrativa", "ComplementoEsferaAdministrativa");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.cnes.v1r0.complementoesferaadministrativa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComplementoEsferaAdministrativaType }
     * 
     */
    public ComplementoEsferaAdministrativaType createComplementoEsferaAdministrativaType() {
        return new ComplementoEsferaAdministrativaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplementoEsferaAdministrativaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/complementoesferaadministrativa", name = "ComplementoEsferaAdministrativa")
    public JAXBElement<ComplementoEsferaAdministrativaType> createComplementoEsferaAdministrativa(ComplementoEsferaAdministrativaType value) {
        return new JAXBElement<ComplementoEsferaAdministrativaType>(_ComplementoEsferaAdministrativa_QNAME, ComplementoEsferaAdministrativaType.class, null, value);
    }

}
