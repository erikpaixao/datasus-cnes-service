
package br.gov.saude.servicos.schema.cnes.v1r0.tipogestao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.cnes.v1r0.tipogestao package. 
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

    private final static QName _TipoGestao_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/tipogestao", "tipoGestao");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.cnes.v1r0.tipogestao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoGestaoType }
     * 
     */
    public TipoGestaoType createTipoGestaoType() {
        return new TipoGestaoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoGestaoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/tipogestao", name = "tipoGestao")
    public JAXBElement<TipoGestaoType> createTipoGestao(TipoGestaoType value) {
        return new JAXBElement<TipoGestaoType>(_TipoGestao_QNAME, TipoGestaoType.class, null, value);
    }

}
