
package br.gov.saude.servicos.schema.corporativo.documento.certidao.v1r1.certidoes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.corporativo.documento.certidao.v1r1.certidoes package. 
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

    private final static QName _Certidoes_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/documento/certidao/v1r1/certidoes", "Certidoes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.corporativo.documento.certidao.v1r1.certidoes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CertidoesType }
     * 
     */
    public CertidoesType createCertidoesType() {
        return new CertidoesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertidoesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/documento/certidao/v1r1/certidoes", name = "Certidoes")
    public JAXBElement<CertidoesType> createCertidoes(CertidoesType value) {
        return new JAXBElement<CertidoesType>(_Certidoes_QNAME, CertidoesType.class, null, value);
    }

}
