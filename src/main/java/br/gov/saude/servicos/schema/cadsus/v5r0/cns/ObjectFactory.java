package br.gov.saude.servicos.schema.cadsus.v5r0.cns;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * br.gov.saude.servicos.schema.cadsus.v5r0.cns package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CNS_QNAME = new QName("http://servicos.saude.gov.br/schema/cadsus/v5r0/cns", "CNS");
    private final static QName _ListaCNS_QNAME = new QName("http://servicos.saude.gov.br/schema/cadsus/v5r0/cns", "ListaCNS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * br.gov.saude.servicos.schema.cadsus.v5r0.cns
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CNSType }
     *
     */
    public CNSType createCNSType() {
        return new CNSType();
    }

    /**
     * Create an instance of {@link ListaCNSType }
     *
     */
    public ListaCNSType createListaCNSType() {
        return new ListaCNSType();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link CNSType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cadsus/v5r0/cns", name = "CNS")
    public JAXBElement<CNSType> createCNS(CNSType value) {
        return new JAXBElement<CNSType>(_CNS_QNAME, CNSType.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link ListaCNSType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cadsus/v5r0/cns", name = "ListaCNS")
    public JAXBElement<ListaCNSType> createListaCNS(ListaCNSType value) {
        return new JAXBElement<ListaCNSType>(_ListaCNS_QNAME, ListaCNSType.class, null, value);
    }

}
