
package br.gov.saude.servicos.schema.cnes.v1r0.vinculacao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.cnes.v1r0.vinculacao package. 
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

    private final static QName _VinculacaoService_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/vinculacao", "VinculacaoService");
    private final static QName _Vinculacaos_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/vinculacao", "Vinculacaos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.cnes.v1r0.vinculacao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VinculacaoServiceType }
     * 
     */
    public VinculacaoServiceType createVinculacaoServiceType() {
        return new VinculacaoServiceType();
    }

    /**
     * Create an instance of {@link VinculacaosType }
     * 
     */
    public VinculacaosType createVinculacaosType() {
        return new VinculacaosType();
    }

    /**
     * Create an instance of {@link VinculacaoType }
     * 
     */
    public VinculacaoType createVinculacaoType() {
        return new VinculacaoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VinculacaoServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/vinculacao", name = "VinculacaoService")
    public JAXBElement<VinculacaoServiceType> createVinculacaoService(VinculacaoServiceType value) {
        return new JAXBElement<VinculacaoServiceType>(_VinculacaoService_QNAME, VinculacaoServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VinculacaosType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/vinculacao", name = "Vinculacaos")
    public JAXBElement<VinculacaosType> createVinculacaos(VinculacaosType value) {
        return new JAXBElement<VinculacaosType>(_Vinculacaos_QNAME, VinculacaosType.class, null, value);
    }

}
