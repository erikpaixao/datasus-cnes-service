
package br.gov.saude.servicos.schema.corporativo.documento.v1r2.documentos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.corporativo.documento.v1r2.documentos package. 
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

    private final static QName _Documentos_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/documento/v1r2/documentos", "Documentos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.corporativo.documento.v1r2.documentos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentosType }
     * 
     */
    public DocumentosType createDocumentosType() {
        return new DocumentosType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentosType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/documento/v1r2/documentos", name = "Documentos")
    public JAXBElement<DocumentosType> createDocumentos(DocumentosType value) {
        return new JAXBElement<DocumentosType>(_Documentos_QNAME, DocumentosType.class, null, value);
    }

}
