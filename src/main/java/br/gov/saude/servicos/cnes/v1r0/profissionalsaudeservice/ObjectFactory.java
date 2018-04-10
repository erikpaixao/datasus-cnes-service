
package br.gov.saude.servicos.cnes.v1r0.profissionalsaudeservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.cnes.v1r0.profissionalsaudeservice package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.cnes.v1r0.profissionalsaudeservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestConsultarProfissionaisSaude }
     * 
     */
    public RequestConsultarProfissionaisSaude createRequestConsultarProfissionaisSaude() {
        return new RequestConsultarProfissionaisSaude();
    }

    /**
     * Create an instance of {@link ResponseConsultarProfissionaisSaude }
     * 
     */
    public ResponseConsultarProfissionaisSaude createResponseConsultarProfissionaisSaude() {
        return new ResponseConsultarProfissionaisSaude();
    }

    /**
     * Create an instance of {@link RequestConsultarProfissionalSaude }
     * 
     */
    public RequestConsultarProfissionalSaude createRequestConsultarProfissionalSaude() {
        return new RequestConsultarProfissionalSaude();
    }

    /**
     * Create an instance of {@link ResponseConsultarProfissionalSaude }
     * 
     */
    public ResponseConsultarProfissionalSaude createResponseConsultarProfissionalSaude() {
        return new ResponseConsultarProfissionalSaude();
    }

}
