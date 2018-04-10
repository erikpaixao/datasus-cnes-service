package br.gov.saude.servicos.wsdl.mensageria.v1r0.resultadopesquisaestabelecimentosaude;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * br.gov.saude.servicos.wsdl.mensageria.v1r0.resultadopesquisaestabelecimentosaude
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

    private final static QName _ResultadoPesquisaEstabelecimentoSaude_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadopesquisaestabelecimentosaude", "ResultadoPesquisaEstabelecimentoSaude");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * br.gov.saude.servicos.wsdl.mensageria.v1r0.resultadopesquisaestabelecimentosaude
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResultadoPesquisaEstabelecimentoSaudeType }
     *
     */
    public ResultadoPesquisaEstabelecimentoSaudeType createResultadoPesquisaEstabelecimentoSaudeType() {
        return new ResultadoPesquisaEstabelecimentoSaudeType();
    }

    /**
     * Create an instance of {@link SumarioEstabelecimentoType }
     *
     */
    public SumarioEstabelecimentoType createSumarioEstabelecimentoType() {
        return new SumarioEstabelecimentoType();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link ResultadoPesquisaEstabelecimentoSaudeType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadopesquisaestabelecimentosaude", name = "ResultadoPesquisaEstabelecimentoSaude")
    public JAXBElement<ResultadoPesquisaEstabelecimentoSaudeType> createResultadoPesquisaEstabelecimentoSaude(ResultadoPesquisaEstabelecimentoSaudeType value) {
        return new JAXBElement<ResultadoPesquisaEstabelecimentoSaudeType>(_ResultadoPesquisaEstabelecimentoSaude_QNAME, ResultadoPesquisaEstabelecimentoSaudeType.class, null, value);
    }

}
