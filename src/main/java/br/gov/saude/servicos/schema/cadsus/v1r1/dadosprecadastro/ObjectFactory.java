
package br.gov.saude.servicos.schema.cadsus.v1r1.dadosprecadastro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.cadsus.v1r1.dadosprecadastro package. 
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

    private final static QName _DadosPreCadastro_QNAME = new QName("http://servicos.saude.gov.br/schema/cadsus/v1r1/dadosprecadastro", "DadosPreCadastro");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.cadsus.v1r1.dadosprecadastro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DadosPreCadastroType }
     * 
     */
    public DadosPreCadastroType createDadosPreCadastroType() {
        return new DadosPreCadastroType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DadosPreCadastroType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cadsus/v1r1/dadosprecadastro", name = "DadosPreCadastro")
    public JAXBElement<DadosPreCadastroType> createDadosPreCadastro(DadosPreCadastroType value) {
        return new JAXBElement<DadosPreCadastroType>(_DadosPreCadastro_QNAME, DadosPreCadastroType.class, null, value);
    }

}
