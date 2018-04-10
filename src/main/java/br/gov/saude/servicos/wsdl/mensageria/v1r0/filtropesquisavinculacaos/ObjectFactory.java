
package br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisavinculacaos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisavinculacaos package. 
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

    private final static QName _FiltroPesquisaVinculacaos_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisavinculacaos", "FiltroPesquisaVinculacaos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.wsdl.mensageria.v1r0.filtropesquisavinculacaos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FiltroPesquisaVinculacaosType }
     * 
     */
    public FiltroPesquisaVinculacaosType createFiltroPesquisaVinculacaosType() {
        return new FiltroPesquisaVinculacaosType();
    }

    /**
     * Create an instance of {@link ProfissionalVinculacaoType }
     * 
     */
    public ProfissionalVinculacaoType createProfissionalVinculacaoType() {
        return new ProfissionalVinculacaoType();
    }

    /**
     * Create an instance of {@link EstabelecimentoVinculacaoType }
     * 
     */
    public EstabelecimentoVinculacaoType createEstabelecimentoVinculacaoType() {
        return new EstabelecimentoVinculacaoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltroPesquisaVinculacaosType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisavinculacaos", name = "FiltroPesquisaVinculacaos")
    public JAXBElement<FiltroPesquisaVinculacaosType> createFiltroPesquisaVinculacaos(FiltroPesquisaVinculacaosType value) {
        return new JAXBElement<FiltroPesquisaVinculacaosType>(_FiltroPesquisaVinculacaos_QNAME, FiltroPesquisaVinculacaosType.class, null, value);
    }

}
