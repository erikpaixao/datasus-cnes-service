
package br.gov.saude.servicos.schema.horus.v1r0.produto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.horus.v1r0.produto package. 
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

    private final static QName _Produto_QNAME = new QName("http://servicos.saude.gov.br/schema/horus/v1r0/produto", "Produto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.horus.v1r0.produto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProdutoType }
     * 
     */
    public ProdutoType createProdutoType() {
        return new ProdutoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/horus/v1r0/produto", name = "Produto")
    public JAXBElement<ProdutoType> createProduto(ProdutoType value) {
        return new JAXBElement<ProdutoType>(_Produto_QNAME, ProdutoType.class, null, value);
    }

}
