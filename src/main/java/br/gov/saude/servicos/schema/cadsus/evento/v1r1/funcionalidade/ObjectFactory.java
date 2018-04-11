
package br.gov.saude.servicos.schema.cadsus.evento.v1r1.funcionalidade;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.cadsus.evento.v1r1.funcionalidade package. 
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

    private final static QName _Funcionalidade_QNAME = new QName("http://servicos.saude.gov.br/schema/cadsus/evento/v1r1/funcionalidade", "Funcionalidade");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.cadsus.evento.v1r1.funcionalidade
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FuncionalidadeType }
     * 
     */
    public FuncionalidadeType createFuncionalidadeType() {
        return new FuncionalidadeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuncionalidadeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cadsus/evento/v1r1/funcionalidade", name = "Funcionalidade")
    public JAXBElement<FuncionalidadeType> createFuncionalidade(FuncionalidadeType value) {
        return new JAXBElement<FuncionalidadeType>(_Funcionalidade_QNAME, FuncionalidadeType.class, null, value);
    }

}