package br.gov.saude.servicos.schema.cnes.v1r0.dadosbasicosestabelecimento;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * br.gov.saude.servicos.schema.cnes.v1r0.dadosbasicosestabelecimento package.
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

    private final static QName _DadosBasicosEstabelecimento_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/dadosbasicosestabelecimento", "DadosBasicosEstabelecimento");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * br.gov.saude.servicos.schema.cnes.v1r0.dadosbasicosestabelecimento
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DadosBasicosEstabelecimentoType }
     *
     */
    public DadosBasicosEstabelecimentoType createDadosBasicosEstabelecimentoType() {
        return new DadosBasicosEstabelecimentoType();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link DadosBasicosEstabelecimentoType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/dadosbasicosestabelecimento", name = "DadosBasicosEstabelecimento")
    public JAXBElement<DadosBasicosEstabelecimentoType> createDadosBasicosEstabelecimento(DadosBasicosEstabelecimentoType value) {
        return new JAXBElement<DadosBasicosEstabelecimentoType>(_DadosBasicosEstabelecimento_QNAME, DadosBasicosEstabelecimentoType.class, null, value);
    }

}
