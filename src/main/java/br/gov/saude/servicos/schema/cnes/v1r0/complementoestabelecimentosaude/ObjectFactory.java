package br.gov.saude.servicos.schema.cnes.v1r0.complementoestabelecimentosaude;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * br.gov.saude.servicos.schema.cnes.v1r0.complementoestabelecimentosaude
 * package.
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

    private final static QName _ComplementoEstabelecimentoSaude_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/complementoestabelecimentosaude", "ComplementoEstabelecimentoSaude");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * br.gov.saude.servicos.schema.cnes.v1r0.complementoestabelecimentosaude
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComplementoEstabelecimentoSaudeType }
     *
     */
    public ComplementoEstabelecimentoSaudeType createComplementoEstabelecimentoSaudeType() {
        return new ComplementoEstabelecimentoSaudeType();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link ComplementoEstabelecimentoSaudeType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/complementoestabelecimentosaude", name = "ComplementoEstabelecimentoSaude")
    public JAXBElement<ComplementoEstabelecimentoSaudeType> createComplementoEstabelecimentoSaude(ComplementoEstabelecimentoSaudeType value) {
        return new JAXBElement<ComplementoEstabelecimentoSaudeType>(_ComplementoEstabelecimentoSaude_QNAME, ComplementoEstabelecimentoSaudeType.class, null, value);
    }

}
