
package br.gov.saude.servicos.schema.corporativo.documento.v1r1.nis;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.corporativo.documento.v1r1.nis package. 
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

    private final static QName _NIS_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/documento/v1r1/nis", "NIS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.corporativo.documento.v1r1.nis
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NISType }
     * 
     */
    public NISType createNISType() {
        return new NISType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NISType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/documento/v1r1/nis", name = "NIS")
    public JAXBElement<NISType> createNIS(NISType value) {
        return new JAXBElement<NISType>(_NIS_QNAME, NISType.class, null, value);
    }

}
