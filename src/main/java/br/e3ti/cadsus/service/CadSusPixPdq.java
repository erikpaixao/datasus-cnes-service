/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.e3ti.cadsus.service;

import br.e3ti.cadsus.handlers.ClientHandlerCadsus;
import br.gov.saude.servicos.cadsus.v5r0.cadsusservice.CadsusFault;
import br.gov.saude.servicos.cadsus.v5r0.cadsusservice.CadsusService;
import br.gov.saude.servicos.cadsus.v5r0.cadsusservice.CadsusServicePortType;
import br.gov.saude.servicos.cadsus.v5r0.cadsusservice.RequestAlterarSituacao;
import br.gov.saude.servicos.cadsus.v5r0.cadsusservice.RequestAtualizar;
import br.gov.saude.servicos.cadsus.v5r0.cadsusservice.RequestCalcularGrauDeQualidade;
import br.gov.saude.servicos.cadsus.v5r0.cadsusservice.RequestConsultar;
import br.gov.saude.servicos.cadsus.v5r0.cadsusservice.RequestIncluir;
import br.gov.saude.servicos.cadsus.v5r0.cadsusservice.RequestPesquisar;
import br.gov.saude.servicos.cadsus.v5r0.cadsusservice.ResponseAlterarSituacao;
import br.gov.saude.servicos.cadsus.v5r0.cadsusservice.ResponseAtualizar;
import br.gov.saude.servicos.cadsus.v5r0.cadsusservice.ResponseCalcularGrauDeQualidade;
import br.gov.saude.servicos.cadsus.v5r0.cadsusservice.ResponseConsultar;
import br.gov.saude.servicos.cadsus.v5r0.cadsusservice.ResponseIncluir;
import br.gov.saude.servicos.cadsus.v5r0.cadsusservice.ResponsePesquisar;
import br.gov.saude.servicos.schema.cadsus.v5r0.cns.CNSType;
import br.gov.saude.servicos.schema.cadsus.v5r0.usuariosus.UsuarioSUSType;
import br.gov.saude.servicos.wsdl.mensageria.v5r0.cnesusuario.CNESUsuarioType;
import br.gov.saude.servicos.wsdl.mensageria.v5r0.filtropesquisa.FiltroPesquisa;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erik
 */
public class CadSusPixPdq {

    public ResponseAlterarSituacao alterarSituacao(CNESUsuarioType cnes, UsuarioSUSType usuarioSUSType) throws CadsusFault {

        // Call Web Cnes Operation
        CadsusService service = new CadsusService();
        ClientHandlerCadsus handlerResolver = new ClientHandlerCadsus();
        service.setHandlerResolver(handlerResolver);

        CadsusServicePortType port = service.getCadsusServicePort();

        RequestAlterarSituacao requestAlterarSituacao = new RequestAlterarSituacao();

        requestAlterarSituacao.setUsuarioSUS(usuarioSUSType);

        requestAlterarSituacao.setCNESUsuario(cnes);

        return port.alterarSituacao(requestAlterarSituacao);

    }

    public ResponseAtualizar atualizar(CNESUsuarioType cnes, UsuarioSUSType usuarioSUSType, boolean higienizar) throws CadsusFault {

        // Call Web Cnes Operation
        CadsusService service = new CadsusService();
        ClientHandlerCadsus handlerResolver = new ClientHandlerCadsus();
        service.setHandlerResolver(handlerResolver);

        CadsusServicePortType port = service.getCadsusServicePort();

        RequestAtualizar request = new RequestAtualizar();

        request.setUsuarioSUS(usuarioSUSType);

        request.setHigienizar(higienizar);

        request.setCNESUsuario(cnes);

        return port.atualizar(request);

    }

    public ResponseCalcularGrauDeQualidade calcularGrauDeQualidade(CNESUsuarioType cnes, UsuarioSUSType usuarioSUSType) throws CadsusFault {

        // Call Web Cnes Operation
        CadsusService service = new CadsusService();
        ClientHandlerCadsus handlerResolver = new ClientHandlerCadsus();
        service.setHandlerResolver(handlerResolver);

        CadsusServicePortType port = service.getCadsusServicePort();

        RequestCalcularGrauDeQualidade request = new RequestCalcularGrauDeQualidade();

        request.setUsuarioSUS(usuarioSUSType);

        request.setCNESUsuario(cnes);

        return port.calcularGrauDeQualidade(request);

    }

    public ResponseConsultar consultar(CNESUsuarioType cnes, CNSType cNSType) throws CadsusFault {

        // Call Web Cnes Operation
        CadsusService service = new CadsusService();
        ClientHandlerCadsus handlerResolver = new ClientHandlerCadsus();
        service.setHandlerResolver(handlerResolver);

        CadsusServicePortType port = service.getCadsusServicePort();

        RequestConsultar request = new RequestConsultar();

        request.setCNS(cNSType);

        request.setCNESUsuario(cnes);

        return port.consultar(request);

    }

    public ResponseIncluir incluir(UsuarioSUSType sUSType, CNESUsuarioType cnes, CNSType cNSType, boolean higienizar) {

        try {
            // Call Web Cnes Operation
            CadsusService service = new CadsusService();
            ClientHandlerCadsus handlerResolver = new ClientHandlerCadsus();
            service.setHandlerResolver(handlerResolver);
            
            CadsusServicePortType port = service.getCadsusServicePort();
            
            RequestIncluir request = new RequestIncluir();
            
            request.setHigienizar(higienizar);
            
            request.setCNESUsuario(cnes);
            
            request.setUsuarioSUS(sUSType);
            
            return port.incluir(request);
        } catch (CadsusFault ex) {
            Logger.getLogger(CadSusPixPdq.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public ResponsePesquisar pesquisar(CNESUsuarioType cnes, boolean higienizar, FiltroPesquisa filtroPesquisa) throws CadsusFault {

        // Call Web Cnes Operation
        CadsusService service = new CadsusService();
        ClientHandlerCadsus handlerResolver = new ClientHandlerCadsus();
        service.setHandlerResolver(handlerResolver);

        CadsusServicePortType port = service.getCadsusServicePort();

        RequestPesquisar request = new RequestPesquisar();

        request.setFiltroPesquisa(filtroPesquisa);

        request.setHigienizar(higienizar);

        request.setCNESUsuario(cnes);

        return port.pesquisar(request);

    }

}
