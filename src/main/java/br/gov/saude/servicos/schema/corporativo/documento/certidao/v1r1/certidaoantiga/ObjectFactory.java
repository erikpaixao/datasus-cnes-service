
package br.gov.saude.servicos.schema.corporativo.documento.certidao.v1r1.certidaoantiga;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.corporativo.documento.certidao.v1r1.certidaoantiga package. 
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

    private final static QName _CertidaoAntiga_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/documento/certidao/v1r1/certidaoantiga", "CertidaoAntiga");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.corporativo.documento.certidao.v1r1.certidaoantiga
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CertidaoAntigaType }
     * 
     */
    public CertidaoAntigaType createCertidaoAntigaType() {
        return new CertidaoAntigaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertidaoAntigaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/documento/certidao/v1r1/certidaoantiga", name = "CertidaoAntiga")
    public JAXBElement<CertidaoAntigaType> createCertidaoAntiga(CertidaoAntigaType value) {
        return new JAXBElement<CertidaoAntigaType>(_CertidaoAntiga_QNAME, CertidaoAntigaType.class, null, value);
    }

}
