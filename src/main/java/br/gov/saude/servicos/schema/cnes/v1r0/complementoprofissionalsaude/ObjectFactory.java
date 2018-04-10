package br.gov.saude.servicos.schema.cnes.v1r0.complementoprofissionalsaude;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * br.gov.saude.servicos.schema.cnes.v1r0.complementoprofissionalsaude package.
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

    private final static QName _ComplementoProfissionalSaude_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/complementoprofissionalsaude", "ComplementoProfissionalSaude");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * br.gov.saude.servicos.schema.cnes.v1r0.complementoprofissionalsaude
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComplementoProfissionalSaudeType }
     *
     */
    public ComplementoProfissionalSaudeType createComplementoProfissionalSaudeType() {
        return new ComplementoProfissionalSaudeType();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link ComplementoProfissionalSaudeType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/complementoprofissionalsaude", name = "ComplementoProfissionalSaude")
    public JAXBElement<ComplementoProfissionalSaudeType> createComplementoProfissionalSaude(ComplementoProfissionalSaudeType value) {
        return new JAXBElement<ComplementoProfissionalSaudeType>(_ComplementoProfissionalSaude_QNAME, ComplementoProfissionalSaudeType.class, null, value);
    }

}
