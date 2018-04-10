
package br.gov.saude.servicos.cnes.v1r0.vinculacaoprofissionalservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.cnes.v1r0.vinculacaoprofissionalservice package. 
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

    private final static QName _RequestVinculacaos_QNAME = new QName("http://servicos.saude.gov.br/cnes/v1r0/vinculacaoprofissionalservice", "RequestVinculacaos");
    private final static QName _ResponseVinculacaos_QNAME = new QName("http://servicos.saude.gov.br/cnes/v1r0/vinculacaoprofissionalservice", "ResponseVinculacaos");
    private final static QName _RequestVinculacao_QNAME = new QName("http://servicos.saude.gov.br/cnes/v1r0/vinculacaoprofissionalservice", "RequestVinculacao");
    private final static QName _ResponseVinculacao_QNAME = new QName("http://servicos.saude.gov.br/cnes/v1r0/vinculacaoprofissionalservice", "ResponseVinculacao");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.cnes.v1r0.vinculacaoprofissionalservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestVinculacaos }
     * 
     */
    public RequestVinculacaos createRequestVinculacaos() {
        return new RequestVinculacaos();
    }

    /**
     * Create an instance of {@link ResponseVinculacaos }
     * 
     */
    public ResponseVinculacaos createResponseVinculacaos() {
        return new ResponseVinculacaos();
    }

    /**
     * Create an instance of {@link RequestVinculacao }
     * 
     */
    public RequestVinculacao createRequestVinculacao() {
        return new RequestVinculacao();
    }

    /**
     * Create an instance of {@link ResponseVinculacao }
     * 
     */
    public ResponseVinculacao createResponseVinculacao() {
        return new ResponseVinculacao();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestVinculacaos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/cnes/v1r0/vinculacaoprofissionalservice", name = "RequestVinculacaos")
    public JAXBElement<RequestVinculacaos> createRequestVinculacaos(RequestVinculacaos value) {
        return new JAXBElement<RequestVinculacaos>(_RequestVinculacaos_QNAME, RequestVinculacaos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseVinculacaos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/cnes/v1r0/vinculacaoprofissionalservice", name = "ResponseVinculacaos")
    public JAXBElement<ResponseVinculacaos> createResponseVinculacaos(ResponseVinculacaos value) {
        return new JAXBElement<ResponseVinculacaos>(_ResponseVinculacaos_QNAME, ResponseVinculacaos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestVinculacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/cnes/v1r0/vinculacaoprofissionalservice", name = "RequestVinculacao")
    public JAXBElement<RequestVinculacao> createRequestVinculacao(RequestVinculacao value) {
        return new JAXBElement<RequestVinculacao>(_RequestVinculacao_QNAME, RequestVinculacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseVinculacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/cnes/v1r0/vinculacaoprofissionalservice", name = "ResponseVinculacao")
    public JAXBElement<ResponseVinculacao> createResponseVinculacao(ResponseVinculacao value) {
        return new JAXBElement<ResponseVinculacao>(_ResponseVinculacao_QNAME, ResponseVinculacao.class, null, value);
    }

}
