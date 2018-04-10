
package br.gov.saude.servicos.wsdl.mensageria.v1r0.resultadopesquisacnesmunicipio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.wsdl.mensageria.v1r0.resultadopesquisacnesmunicipio package. 
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

    private final static QName _ResultadoPesquisaCnesMunicipio_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadopesquisacnesmunicipio", "ResultadoPesquisaCnesMunicipio");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.wsdl.mensageria.v1r0.resultadopesquisacnesmunicipio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResultadoPesquisaCnesMunicipioType }
     * 
     */
    public ResultadoPesquisaCnesMunicipioType createResultadoPesquisaCnesMunicipioType() {
        return new ResultadoPesquisaCnesMunicipioType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoPesquisaCnesMunicipioType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadopesquisacnesmunicipio", name = "ResultadoPesquisaCnesMunicipio")
    public JAXBElement<ResultadoPesquisaCnesMunicipioType> createResultadoPesquisaCnesMunicipio(ResultadoPesquisaCnesMunicipioType value) {
        return new JAXBElement<ResultadoPesquisaCnesMunicipioType>(_ResultadoPesquisaCnesMunicipio_QNAME, ResultadoPesquisaCnesMunicipioType.class, null, value);
    }

}
