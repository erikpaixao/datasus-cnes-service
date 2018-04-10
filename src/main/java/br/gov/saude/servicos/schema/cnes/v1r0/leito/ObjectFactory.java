package br.gov.saude.servicos.schema.cnes.v1r0.leito;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * br.gov.saude.servicos.schema.cnes.v1r0.leito package.
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

    private final static QName _Leito_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/leito", "leito");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * br.gov.saude.servicos.schema.cnes.v1r0.leito
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LeitoType }
     *
     */
    public LeitoType createLeitoType() {
        return new LeitoType();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link LeitoType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/leito", name = "leito")
    public JAXBElement<LeitoType> createLeito(LeitoType value) {
        return new JAXBElement<LeitoType>(_Leito_QNAME, LeitoType.class, null, value);
    }

}
