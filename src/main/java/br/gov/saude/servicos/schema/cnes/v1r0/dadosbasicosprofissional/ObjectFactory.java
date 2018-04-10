
package br.gov.saude.servicos.schema.cnes.v1r0.dadosbasicosprofissional;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.cnes.v1r0.dadosbasicosprofissional package. 
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

    private final static QName _DadosBasicosProfissionais_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/dadosbasicosprofissional", "DadosBasicosProfissionais");
    private final static QName _DadosBasicosProfissional_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/dadosbasicosprofissional", "DadosBasicosProfissional");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.cnes.v1r0.dadosbasicosprofissional
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DadosBasicosProfissionaisType }
     * 
     */
    public DadosBasicosProfissionaisType createDadosBasicosProfissionaisType() {
        return new DadosBasicosProfissionaisType();
    }

    /**
     * Create an instance of {@link DadosBasicosProfissionalType }
     * 
     */
    public DadosBasicosProfissionalType createDadosBasicosProfissionalType() {
        return new DadosBasicosProfissionalType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DadosBasicosProfissionaisType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/dadosbasicosprofissional", name = "DadosBasicosProfissionais")
    public JAXBElement<DadosBasicosProfissionaisType> createDadosBasicosProfissionais(DadosBasicosProfissionaisType value) {
        return new JAXBElement<DadosBasicosProfissionaisType>(_DadosBasicosProfissionais_QNAME, DadosBasicosProfissionaisType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DadosBasicosProfissionalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/dadosbasicosprofissional", name = "DadosBasicosProfissional")
    public JAXBElement<DadosBasicosProfissionalType> createDadosBasicosProfissional(DadosBasicosProfissionalType value) {
        return new JAXBElement<DadosBasicosProfissionalType>(_DadosBasicosProfissional_QNAME, DadosBasicosProfissionalType.class, null, value);
    }

}
