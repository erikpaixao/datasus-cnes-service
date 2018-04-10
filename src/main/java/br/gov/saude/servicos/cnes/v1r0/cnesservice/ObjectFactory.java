package br.gov.saude.servicos.cnes.v1r0.cnesservice;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * br.gov.saude.servicos.cnes.v1r0.cnesservice package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * br.gov.saude.servicos.cnes.v1r0.cnesservice
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestConsultarEstabelecimentoSaude }
     *
     */
    public RequestConsultarEstabelecimentoSaude createRequestConsultarEstabelecimentoSaude() {
        return new RequestConsultarEstabelecimentoSaude();
    }

    /**
     * Create an instance of {@link ResponseConsultarEstabelecimentoSaude }
     *
     */
    public ResponseConsultarEstabelecimentoSaude createResponseConsultarEstabelecimentoSaude() {
        return new ResponseConsultarEstabelecimentoSaude();
    }

    /**
     * Create an instance of {@link RequestConsultarEstabelecimentoSaudePorMunicipio
     * }
     *
     */
    public RequestConsultarEstabelecimentoSaudePorMunicipio createRequestConsultarEstabelecimentoSaudePorMunicipio() {
        return new RequestConsultarEstabelecimentoSaudePorMunicipio();
    }

    /**
     * Create an instance of {@link ResponseConsultarEstabelecimentoSaudePorMunicipio
     * }
     *
     */
    public ResponseConsultarEstabelecimentoSaudePorMunicipio createResponseConsultarEstabelecimentoSaudePorMunicipio() {
        return new ResponseConsultarEstabelecimentoSaudePorMunicipio();
    }

    /**
     * Create an instance of {@link RequestConsultarDadosComplementaresEstabelecimentoSaude
     * }
     *
     */
    public RequestConsultarDadosComplementaresEstabelecimentoSaude createRequestConsultarDadosComplementaresEstabelecimentoSaude() {
        return new RequestConsultarDadosComplementaresEstabelecimentoSaude();
    }

    /**
     * Create an instance of {@link ResponseConsultarDadosComplementaresEstabelecimentoSaude
     * }
     *
     */
    public ResponseConsultarDadosComplementaresEstabelecimentoSaude createResponseConsultarDadosComplementaresEstabelecimentoSaude() {
        return new ResponseConsultarDadosComplementaresEstabelecimentoSaude();
    }

}
