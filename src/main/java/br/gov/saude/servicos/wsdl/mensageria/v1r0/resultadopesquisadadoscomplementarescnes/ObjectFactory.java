
package br.gov.saude.servicos.wsdl.mensageria.v1r0.resultadopesquisadadoscomplementarescnes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.wsdl.mensageria.v1r0.resultadopesquisadadoscomplementarescnes package. 
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

    private final static QName _ResultadoPesquisaDadosComplementaresCnes_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadopesquisadadoscomplementarescnes", "ResultadoPesquisaDadosComplementaresCnes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.wsdl.mensageria.v1r0.resultadopesquisadadoscomplementarescnes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResultadoPesquisaDadosComplementaresCnesType }
     * 
     */
    public ResultadoPesquisaDadosComplementaresCnesType createResultadoPesquisaDadosComplementaresCnesType() {
        return new ResultadoPesquisaDadosComplementaresCnesType();
    }

    /**
     * Create an instance of {@link SumarioDadosComplementaresType }
     * 
     */
    public SumarioDadosComplementaresType createSumarioDadosComplementaresType() {
        return new SumarioDadosComplementaresType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoPesquisaDadosComplementaresCnesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadopesquisadadoscomplementarescnes", name = "ResultadoPesquisaDadosComplementaresCnes")
    public JAXBElement<ResultadoPesquisaDadosComplementaresCnesType> createResultadoPesquisaDadosComplementaresCnes(ResultadoPesquisaDadosComplementaresCnesType value) {
        return new JAXBElement<ResultadoPesquisaDadosComplementaresCnesType>(_ResultadoPesquisaDadosComplementaresCnes_QNAME, ResultadoPesquisaDadosComplementaresCnesType.class, null, value);
    }

}
