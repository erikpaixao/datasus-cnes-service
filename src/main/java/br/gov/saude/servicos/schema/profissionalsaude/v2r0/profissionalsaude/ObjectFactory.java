
package br.gov.saude.servicos.schema.profissionalsaude.v2r0.profissionalsaude;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.profissionalsaude.v2r0.profissionalsaude package. 
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

    private final static QName _ProfissionalSaude_QNAME = new QName("http://servicos.saude.gov.br/schema/profissionalsaude/v2r0/profissionalsaude", "ProfissionalSaude");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.profissionalsaude.v2r0.profissionalsaude
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProfissionalSaudeType }
     * 
     */
    public ProfissionalSaudeType createProfissionalSaudeType() {
        return new ProfissionalSaudeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfissionalSaudeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/profissionalsaude/v2r0/profissionalsaude", name = "ProfissionalSaude")
    public JAXBElement<ProfissionalSaudeType> createProfissionalSaude(ProfissionalSaudeType value) {
        return new JAXBElement<ProfissionalSaudeType>(_ProfissionalSaude_QNAME, ProfissionalSaudeType.class, null, value);
    }

}
