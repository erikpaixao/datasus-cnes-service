
package br.gov.saude.servicos.schema.profissionalsaude.v1r0.registroprofissionalsaude;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.profissionalsaude.v1r0.registroprofissionalsaude package. 
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

    private final static QName _RegistroProfissionalSaude_QNAME = new QName("http://servicos.saude.gov.br/schema/profissionalsaude/v1r0/registroprofissionalsaude", "RegistroProfissionalSaude");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.profissionalsaude.v1r0.registroprofissionalsaude
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistroProfissionalSaudeType }
     * 
     */
    public RegistroProfissionalSaudeType createRegistroProfissionalSaudeType() {
        return new RegistroProfissionalSaudeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroProfissionalSaudeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/profissionalsaude/v1r0/registroprofissionalsaude", name = "RegistroProfissionalSaude")
    public JAXBElement<RegistroProfissionalSaudeType> createRegistroProfissionalSaude(RegistroProfissionalSaudeType value) {
        return new JAXBElement<RegistroProfissionalSaudeType>(_RegistroProfissionalSaude_QNAME, RegistroProfissionalSaudeType.class, null, value);
    }

}
