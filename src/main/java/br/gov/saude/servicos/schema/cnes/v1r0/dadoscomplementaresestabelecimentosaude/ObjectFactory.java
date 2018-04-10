
package br.gov.saude.servicos.schema.cnes.v1r0.dadoscomplementaresestabelecimentosaude;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.cnes.v1r0.dadoscomplementaresestabelecimentosaude package. 
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

    private final static QName _DadosComplementares_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/dadoscomplementaresestabelecimentosaude", "DadosComplementares");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.cnes.v1r0.dadoscomplementaresestabelecimentosaude
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DadosComplementaresType }
     * 
     */
    public DadosComplementaresType createDadosComplementaresType() {
        return new DadosComplementaresType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DadosComplementaresType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/dadoscomplementaresestabelecimentosaude", name = "DadosComplementares")
    public JAXBElement<DadosComplementaresType> createDadosComplementares(DadosComplementaresType value) {
        return new JAXBElement<DadosComplementaresType>(_DadosComplementares_QNAME, DadosComplementaresType.class, null, value);
    }

}
