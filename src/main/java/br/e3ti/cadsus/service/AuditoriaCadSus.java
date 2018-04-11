/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.e3ti.cadsus.service;

import br.e3ti.cadsus.handlers.ClientHandlerAuditoriaCadsus;
import br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice.AuditoriaCadsusFault;
import br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice.AuditoriaCadsusService;
import br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice.AuditoriaCadsusServicePortType;
import br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice.RequestObterCamposAlteradosPorTransacao;
import br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice.RequestObterHistoricoImpressao;
import br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice.RequestObterHistoricoTransacoesUsuarioSUS;
import br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice.RequestObterHistoricoUnificacaoUsuarioSUS;
import br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice.RequestObterUltimaDataAlteracaoUsuarioSUS;
import br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice.ResponseObterCamposAlteradosPorTransacao;
import br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice.ResponseObterHistoricoImpressao;
import br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice.ResponseObterHistoricoTransacoesUsuarioSUS;
import br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice.ResponseObterHistoricoUnificacaoUsuarioSUS;
import br.gov.saude.servicos.cadsus.v5r0.auditoriacadsusservice.ResponseObterUltimaDataAlteracaoUsuarioSUS;
import br.gov.saude.servicos.schema.cadsus.v5r0.cns.CNSType;
import br.gov.saude.servicos.schema.cadsus.v5r0.identificadorcorporativo.IdentificadorCorporativoType;
import br.gov.saude.servicos.wsdl.mensageria.v5r0.cnesusuario.CNESUsuarioType;

/**
 *
 * @author erik
 */
public class AuditoriaCadSus {

    public ResponseObterCamposAlteradosPorTransacao obterCamposAlteradosPorTransacao(CNESUsuarioType cnes, String identificadorTransacao) throws AuditoriaCadsusFault {

        // Call Web Cnes Operation
        AuditoriaCadsusService service = new AuditoriaCadsusService();
        ClientHandlerAuditoriaCadsus handlerResolver = new ClientHandlerAuditoriaCadsus();
        service.setHandlerResolver(handlerResolver);
        AuditoriaCadsusServicePortType port = service.getAuditoriaCadsusServicePort();
        RequestObterCamposAlteradosPorTransacao request = new RequestObterCamposAlteradosPorTransacao();

        request.setCNESUsuario(cnes);

        request.setIdentificadorTransacao(identificadorTransacao);

        return port.obterCamposAlteradosPorTransacao(request);

    }

    public ResponseObterHistoricoImpressao obterHistoricoImpressao(CNESUsuarioType cnes, CNSType cNSType) throws AuditoriaCadsusFault {

        // Call Web Cnes Operation
        AuditoriaCadsusService service = new AuditoriaCadsusService();
        ClientHandlerAuditoriaCadsus handlerResolver = new ClientHandlerAuditoriaCadsus();
        service.setHandlerResolver(handlerResolver);
        AuditoriaCadsusServicePortType port = service.getAuditoriaCadsusServicePort();
        RequestObterHistoricoImpressao request = new RequestObterHistoricoImpressao();

        request.setCNESUsuario(cnes);

        request.setCNS(cNSType);

        return port.obterHistoricoImpressao(request);

    }

    public ResponseObterHistoricoTransacoesUsuarioSUS obterHistoricoTransacoesUsuario(CNESUsuarioType cnes, IdentificadorCorporativoType identificadorCorporativoType) throws AuditoriaCadsusFault {

        // Call Web Cnes Operation
        AuditoriaCadsusService service = new AuditoriaCadsusService();
        ClientHandlerAuditoriaCadsus handlerResolver = new ClientHandlerAuditoriaCadsus();
        service.setHandlerResolver(handlerResolver);
        AuditoriaCadsusServicePortType port = service.getAuditoriaCadsusServicePort();
        RequestObterHistoricoTransacoesUsuarioSUS request = new RequestObterHistoricoTransacoesUsuarioSUS();

        request.setCNESUsuario(cnes);

        request.setIdentificadorCorporativo(identificadorCorporativoType);

        return port.obterHistoricoTransacoesUsuarioSUS(request);

    }

    public ResponseObterHistoricoUnificacaoUsuarioSUS obterHistoricoUnificacaoUsuario(CNESUsuarioType cnes, IdentificadorCorporativoType identificadorCorporativoType) throws AuditoriaCadsusFault {

        // Call Web Cnes Operation
        AuditoriaCadsusService service = new AuditoriaCadsusService();
        ClientHandlerAuditoriaCadsus handlerResolver = new ClientHandlerAuditoriaCadsus();
        service.setHandlerResolver(handlerResolver);
        AuditoriaCadsusServicePortType port = service.getAuditoriaCadsusServicePort();
        RequestObterHistoricoUnificacaoUsuarioSUS request = new RequestObterHistoricoUnificacaoUsuarioSUS();

        request.setCNESUsuario(cnes);

        request.setIdentificadorCorporativo(identificadorCorporativoType);

        return port.obterHistoricoUnificacaoUsuarioSUS(request);

    }

    public ResponseObterUltimaDataAlteracaoUsuarioSUS obterUltimaDataAlteracaoUsuarioSus(CNESUsuarioType cnes, CNSType cNSType) throws AuditoriaCadsusFault {

        // Call Web Cnes Operation
        AuditoriaCadsusService service = new AuditoriaCadsusService();
        ClientHandlerAuditoriaCadsus handlerResolver = new ClientHandlerAuditoriaCadsus();
        service.setHandlerResolver(handlerResolver);
        AuditoriaCadsusServicePortType port = service.getAuditoriaCadsusServicePort();
        RequestObterUltimaDataAlteracaoUsuarioSUS request = new RequestObterUltimaDataAlteracaoUsuarioSUS();

        request.setCNESUsuario(cnes);

        request.setCNS(cNSType);

        return port.obterUltimaDataAlteracaoUsuarioSUS(request);

    }

}
